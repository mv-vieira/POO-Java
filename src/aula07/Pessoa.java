package aula07;

public class Pessoa {
	
	
	private String nome;
	
	private int idade;
	
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		
		if(nome.isEmpty() || nome.isBlank()){
			this.nome = "Nome incorreto";
		}else {
			this.nome = nome.trim().toUpperCase();
		}
			
	}
	
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		
		if(idade >= 0 ) {
			this.idade = idade;
		}else {
			this.idade = 0;
		}
	}
}
