package aula20;

public class Calculo implements Multiplicacao, Adicao{

	@Override
	public int somar(int a, int b) {
		
		return a + b;
	}

	@Override
	public int multiplicar(int a, int b) {
		
		return a * b;
	}

	
}
