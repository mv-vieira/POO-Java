package aula19;

public class MyClass {

	private int a;
	static int valor = 1000;
	
	private static class MyStaticClass {
		
		public void imprime() {
			System.out.println(valor);
		}
	}
	
	public static void main(String[] args) {
		
		int a = MyClass.valor;
		
		MyStaticClass m = new MyClass.MyStaticClass();
		m.imprime();
		
	}
}
