package BookStore;

import java.util.Date;

public class Books {
	private String name;
	private String owner;
	private double price;
	private int price_off;
	private Date created_at;
	private Date updated_at;

	Books(String name, String owner, double price, int price_off) {
		this.name = name;
		this.owner = owner;
		this.price = price;
		this.price_off = price_off;
		this.created_at = new Date();
		this.updated_at = new Date();
	}

	public double getPriceWithPriceOff() {
		return this.price * this.getPriceOff();
	}

	public String getBookInfo() {
		String info = String.format("O livro '%s' do autor %s", this.name, this.owner);
		
		return info;
	}
	
	public String getBookPromotion() {
		String promotion = String.format(
			"O livro %s que custa R$ %.2f está com um desconto de %d%% saindo por R$ %.2f",
			this.name, this.price, this.price_off, this.getPriceWithPriceOff()
		);
		
		return promotion;
	}
	
	public void putPrice(double price, int price_off) {
		 this.price = price;
		 this.price_off = price_off;
		 this.updated_at = new Date();
	}
	
	public void setPriceOff(int price_off) {
		this.putPrice(this.price, price_off);
	}

	private double getPriceOff() {
		return 1.0 - (this.price_off / 100.0);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		
		int result = 1;
		
		result = prime * result + ((created_at == null) ? 0 : created_at.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		
		long temp;
		
		temp = Double.doubleToLongBits(price);
		
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + price_off;
		result = prime * result + ((updated_at == null) ? 0 : updated_at.hashCode());
		
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		
		Books other = (Books) obj;
		
		if (created_at == null) {
			if (other.created_at != null) return false;
		} else if (!created_at.equals(other.created_at)) return false;
		
		if (name == null) {
			if (other.name != null) return false;
		} else if (!name.equals(other.name)) return false;
		
		if (owner == null) {
			if (other.owner != null) return false;
		} else if (!owner.equals(other.owner)) return false;
		
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		
		if (price_off != other.price_off) return false;
		
		if (updated_at == null) {
			if (other.updated_at != null) return false;
		} else if (!updated_at.equals(other.updated_at)) return false;
		
		return true;
	}

}
