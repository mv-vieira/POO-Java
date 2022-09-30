package aula10;

import java.time.LocalDate;

public class Pessoa {

	private String nome;
	private String sobrenome;
	private LocalDate data_nascimento;
	private char sexo;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public LocalDate getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(LocalDate data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public String toString() {
		return " Nome = " + nome + "\n Sobrenome = " + sobrenome + "\n Data_nascimento = " + data_nascimento + "\n Sexo = "
				+ sexo + "\n ";
	}
	
	
}
