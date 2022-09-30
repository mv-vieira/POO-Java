package aula07;

public class Aula {

	
	private boolean ativo;
	
	
	public boolean isAtivo() {
		return ativo;
	}


	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	
	public static void main(String[] args) {
		
		
		Pessoa p1 = new Pessoa();
		
		p1.setNome("Maria Luiza");
		p1.setIdade(25);
		
		System.out.println(p1.getNome() + " - " + p1.getIdade()+" anos");
		
		
		Pessoa p2 = new Pessoa();
		
		p2.setNome("Joana");
		p2.setIdade(27);
		
		System.out.println(p2.getNome() + " - " + p2.getIdade() + " anos");
	}
}
