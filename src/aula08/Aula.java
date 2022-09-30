package aula08;

public class Aula {

	public static void main(String[] args) {


		Livro l1 = new Livro();
		
		l1.setTitulo("Java 1");
		l1.setAutor("Matheus");
		l1.setPaginas(350);
		l1.setLancamento(false);
		
		System.out.println(l1.toString());
		
		
		
		Livro l2 = new Livro();
		
		l2.setAutor("Mikaela");
		l2.setLancamento(true);
		l2.setTitulo("A Mulher que copiava");
		System.out.println(l2.toString());
		
		
		Livro l3 = new Livro("Isabela Scarlett");
		System.out.println(l3);
		

	}

}
