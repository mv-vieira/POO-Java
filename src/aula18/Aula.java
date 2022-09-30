package aula18;

import java.time.LocalDate;

public class Aula {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
	
		p.setNome("Matheus");
		p.setSobrenome("Vieira");
		p.setDataNascimento(LocalDate.of(1996, 3, 26));
		p.getIdade().getAnos();
		System.out.printf("%s %s possui %d anos %d meses %d dias.",
				p.getNome(),
				p.getSobrenome(),
				p.getIdade().getAnos(),
				p.getIdade().getMeses(),
				p.getIdade().getDias());
	}
}
