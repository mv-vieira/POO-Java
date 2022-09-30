package aula20;

public class Aula {

	
	
	public static void main(String[] args) {
		
		Calculo c = new Calculo();
		System.out.println("Soma = " + c.somar(10, 5));
		System.out.println("Multiplicar = " + c.multiplicar(5, 10));
		
		Aula a = new Aula();
		
		
		// Classe Anônima MySoma
		System.out.println("MySoma igual = " + a.mySoma(10, 20));
	}
	
	
	int mySoma(int z , int y) {
		Adicao adicao = new Adicao() {

			@Override
			public int somar(int a, int b) {
				
				return b + a;
			}
		
			
		};
		return adicao.somar(z, y);
	}
}
