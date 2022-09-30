package aula10;

import java.time.LocalDate;

public class Aula {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setData_nascimento(LocalDate.of(1996, 03, 26));
		aluno1.setNome("Matheus");
		aluno1.setSobrenome("Vieira");
		aluno1.setSexo('M');
		aluno1.setTurno(Turno.DIURNO);
		
		System.out.println("-----------------------------------");
		System.out.println(aluno1.toString());
		
		
		
		Professor prof1 = new Professor();
		prof1.setData_nascimento(LocalDate.of(1980,05,27));
		prof1.setNome("Filipe");
		prof1.setSobrenome("Augusto");
		prof1.setSexo('M');
		prof1.setHoras(Horas.QUARENTA_HORAS);
		
		System.out.println("-----------------------------------");
		System.out.println(prof1.toString());
	}
}
