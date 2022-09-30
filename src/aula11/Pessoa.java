package aula11;

public class Pessoa {

	private String nome;
	
	private String matricula;
	
	private String turno;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Nome:" +getNome() + " ----- Matricula: " + getMatricula()+ " ----- "+" Turno: " +getTurno() + "";
	}

	
	
}
