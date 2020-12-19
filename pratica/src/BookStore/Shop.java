package BookStore;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Shop {
	public static void main(String[] args) {
		boolean out = false;
		int bookindex = 1;
		
		ArrayList<Books> books = new ArrayList<Books>();
		
		while(!out) {
			String name = panel("Digite o nome do livro " + bookindex + ": ");
			String owner = panel("Nome do autor: ");
			String price = panel("Digite o preço do livro '" + name + "': ").replace(",", ".");
			String priceOff = panel("Desconto: ").replace("%", "");

			Books book = new Books(name, owner, Double.parseDouble(price), Integer.parseInt(priceOff));
		
			boolean save = questionPanel("Deseja salvar? " + book.getBookInfo());
			
			if(save) {
				books.add(book);
				bookindex++;
			}
			
			boolean exit = questionPanel("Deseja continuar?");
			
			if(!exit) {
				out = true;
			}
		}
		
		out = false;
		
		while(!out) {
			String indexBook = panel("Você tem " + books.size() + " cadastrados! Digite pelo index qual você deseja ver: ");
			int index = Integer.parseInt(indexBook) - 1;
			
			panel(books.get(index).getBookPromotion());
			
			boolean putPriceOff = questionPanel("Deseja altera o desconto do livro: " + books.get(index).getBookInfo());
			
			if(putPriceOff) {
				String priceOff = panel("Digite o desconto: ").replace("%", "");
				
				int price_off = Integer.parseInt(priceOff);
				
				books.get(index).setPriceOff(price_off);
				
				panel(books.get(index).getBookPromotion());
			}
			
			boolean exit = questionPanel("Deseja continuar?");
			
			if(!exit) {
				out = true;
			}
		}
	}
	
	public static String panel(String message) {
		return JOptionPane.showInputDialog(message);
	}
	
	public static boolean questionPanel(String message) {
		String response = panel(message.trim() + " [s/n] ");
		
		return response.equals("s") || response.equals("sim");
	}
}
