package aula12;

public class Aula {

	public static void main(String[] args) {


		Programador p1 = new Programador();
		p1.setNome("Matheus Vicente");
		p1.setSalario(2800.00);
		System.out.printf("Programador : %s -- R$%.2f",p1.getNome(),p1.calculaSalario());
		
		System.out.println();
		
		Analista a1 = new Analista();
		a1.setNome("Mikaela Marques");
		a1.setSalario(2800.00);
		System.out.printf("Analista : %s -- R$%.2f",a1.getNome(),a1.calculaSalario());
		
		System.out.println();
		
		ImplantadorJunior ij = new ImplantadorJunior();
		ij.setNome("Thiago Vicente");
		ij.setSalario(2800.00);
		System.out.printf("Implantador Jr : %s -- R$%.2f",ij.getNome(),ij.calculaSalario());;
	}


}
