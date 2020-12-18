package arrays.classe;

public class Usuario {
	String nome;
	String email;
	
	public Usuario(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public boolean equals(Usuario obj) {
		boolean isNameEquals = this.nome.equals(obj.nome);
		boolean isEmailEquals = this.email.equals(obj.email);
		
		return isNameEquals && isEmailEquals;
	}
}
