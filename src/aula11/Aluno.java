package aula11;

public class Aluno extends Pessoa {
	
	@Override
	public void setMatricula(String matricula) {
		
		if(matricula.length() == 10) {
			super.setMatricula(matricula);
		}else {
			super.setMatricula("Matricula invalida");
		}
		
	}
	
	


	
	
	
}
