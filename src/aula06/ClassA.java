package aula06;

import aula06.ClassD.B;

public class ClassA {

	private String privado;
	
	protected String protegido;
	
	public String publico;
	
	String pacote;
	
public static void main (String[] args) {
		
		ClassA a = new ClassA();
		a.pacote = "pacote a";
		a.protegido = "protegido a";
		a.publico = "publico a";
		a.privado = "pivado a";
		
		// B b = new B();
		// b.ola;
		
		
		
		
		System.out.println(a.privado);
	}

}
