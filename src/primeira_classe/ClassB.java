package primeira_classe;

public class ClassB {

	private String privado;
	
	protected String protegido;
	
	public String publico;
	
	String pacote;
	
	
	
	public static void main(String[] args) {
		ClassB b = new ClassB();
		String ola = b.privado;
		System.out.println(ola);
		
		// ClassD d = newClassD();
	}
}
