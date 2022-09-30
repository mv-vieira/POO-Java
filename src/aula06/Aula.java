package aula06;

import primeira_classe.ClassB;

public class Aula extends ClassB{
	
	public static void main (String[] args) {
		
		ClassA a = new ClassA();
		a.pacote = "pacote a";
		a.protegido = "protegido a";
		a.publico = "publico a";
		
		ClassB b = new ClassB();
		b.publico = "publico b";
		
		Aula aula = new Aula();
		aula.protegido = "protegido de b por herança";
		aula.publico = "publico b";
		
		ClassD d = new ClassD();
		d.metodoD();
	}
}
