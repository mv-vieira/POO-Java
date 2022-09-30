package aula11;

public class Main {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		
		a1.setNome("Joana da Silva");
		a1.setMatricula("5896789856");
		a1.setTurno("Noite");
		
		System.out.println(a1.toString());
		
		System.out.println();
		

		Aluno a2 = new Aluno();
		
		a2.setNome("Andressa Andrade");
		a2.setMatricula("7894561225");
		a2.setTurno("Manha");
		
		System.out.println(a2.toString());
		
		System.out.println();
		
		
		Professor p1 = new Professor();
		
		p1.setNome("Mikael Santos");
		p1.setMatricula("78945611");
		p1.setTurno("Tarde");
		
		System.out.println(p1.toString());
		

	}

}
