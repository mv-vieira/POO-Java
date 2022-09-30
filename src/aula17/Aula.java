package aula17;

public class Aula {

	static int vStatic = 1;
	int vInstance = 1;
	
	// Bloco Estático
	static {
		System.out.println("Bloco estatico");
		System.out.println(vStatic);
		System.out.println(new Aula().vInstance);
	}
	
	
	//Bloco Dinâmico
	
	{
		System.out.println("Bloco de instancia");
		System.out.println(vStatic + vInstance);
	}
	
	public Aula() {
		System.out.println("new Aula()");
		vInstance = 9;
	}
	
	
	
	public static void main(String[] args) {
		Aula a = new Aula();
		System.out.println(a.vInstance = 5);
	}
}
