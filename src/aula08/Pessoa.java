package aula08;

import java.util.Random;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private int idade;
	private char sexo;
	private double numero_identificador;
	private Random aleatorio;
	
	
	
	public Pessoa() {
		super();
	}
	
	public Pessoa(String nome, String sobrenome) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public Pessoa(double numero_identificador,String nome, String sobrenome, int idade, char sexo) {
		super();
		aleatorio = new Random(10);
		this.numero_identificador = aleatorio.nextInt();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.sexo = sexo;
	}
	


	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sobrenome=" + sobrenome + ", idade=" + idade + ", sexo=" + sexo
				+ ", numero_identificador=" + numero_identificador + "]";
	}

	public static void main(String[] args) {
		
		
		Pessoa pessoa1 = new Pessoa();
			pessoa1.idade = 26;
			pessoa1.nome = "Matheus";
			pessoa1.sobrenome = "Vicente";
			pessoa1.sexo = 'M';
			System.out.println(pessoa1.toString());
			
		Pessoa pessoa2 = new Pessoa("Matheus","Vicente");
			System.out.println(pessoa2.toString());
	}
}

