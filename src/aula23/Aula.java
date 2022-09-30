package aula23;

import java.util.Arrays;
import java.util.List;

import aula20.Adicao;

public class Aula {

	public static void main(String[] args) {
		
		List<String> nomes = Arrays.asList("Matheus", "Vicente", "Vieira", "Mikaela", "Marques", "Da Silva");
		
		
		// teste01();
		
		//teste02();
		
		//teste03(nomes);
		
		teste04(nomes);

	}

	private static void teste04(List<String> nomes) {
		
		
		  for (String nome : nomes) { if(nome.startsWith("M")) {
		  System.out.println(nome); }
		  
		  System.out.println("-------------------------------");
		 
			
			
		nomes.stream()
			.filter( (String name) -> nome.startsWith("M"))
			.forEach(System.out::println);
			
			
			
			
		}
		
	}

	private static void teste03(List<String> nomes) {
		
		// Até Java 7 (Comando For)
		
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		System.out.println("----------------------------------");
		
		
		// Após Java 8 ForEach com Lambda
		
		nomes.forEach((nome) -> System.out.println(nome));
		
	}

	private static void teste02() {
		
		Adicao ad1 = (a , b) -> { return a + b; };
		System.out.println("Soma igual = " + ad1.somar(80, 10));
		
		
		
	}

	private static void teste01() {
		// Até Java 7 
		
		Funcionario f1 = new Funcionario() {

			@Override
			public double remuneracao() {
	
				return 800 + 900;
			}
			
		};
		
		System.out.println(f1.remuneracao());
		
		
		
		System.out.println("---------------------------");
		
		// Java 8+ Função Lambda
		
		Funcionario f2 = () -> { return 800 + 700; };
		f2.imprime();
		
	}

}
