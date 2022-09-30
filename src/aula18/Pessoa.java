package aula18;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private LocalDate dataNascimento;
	
	
	public calculaIdade getIdade() {
		return new Idade();
	}
	
	
	private class Idade implements calculaIdade{

		@Override
		public int getAnos() {
			Period p = Period.between(dataNascimento,LocalDate.now());
			return p.getYears();
		}

		
		@Override
		public int getMeses() {
			Period p = Period.between(dataNascimento,LocalDate.now());
			return p.getMonths();
		}

		
		@Override
		public int getDias() {
			Period p = Period.between(dataNascimento,LocalDate.now());
			return p.getDays();
		}
		
	}
	
	
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
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	

}
