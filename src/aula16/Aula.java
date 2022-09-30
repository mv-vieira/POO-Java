package aula16;

public class Aula {
	
	static String nome = "Ana";
	
	String sobrenome = "Monteiro";
	
	void imprime() {
		System.out.println(nome + " " + sobrenome);
	}
	
	
	public static void main(String[] args) {
		 // System.out.println(nome + " " + sobrenome);
		
		System.out.println(new Aula().sobrenome);
		
		
		Aula a = new Aula();
		System.out.println(a.sobrenome);
		
		
		new Aula().imprime();
		
		show();
	
	}
	
	static void show() {
		System.out.println(nome + " " + new Aula().sobrenome);
	}

}
