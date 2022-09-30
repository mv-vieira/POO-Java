package aula09;

public class Aula {

	public static final String OURO = "ouro";
	public static final String PAUS = "paus";
	public static final String ESPADAS = "espadas";
	public static final String COPAS = "copas";
	
	public static void main(String[] args) {
		
		String naipe = Aula.COPAS;
		
			
			Carta carta = Carta.OURO;
			
			switch(carta) {
			case OURO:
				System.out.println("Sua carta é de ouro");
				break;
			case PAUS:
				System.out.println("Sua carta é de paus");
				break;
			case ESPADAS:
				System.out.println("Sua carta é de espadas");
				break;
			case COPAS:
				System.out.println("Sua carta é de copas");
				break;
			default:
				System.out.println("Nenhum naipe está presente");
				break;
			}
				
		
		
		
		
		
		switch(naipe) {
		case Aula.OURO:
			System.out.println("Sua carta é de ouro");
			break;
		case Aula.PAUS:
			System.out.println("Sua carta é de paus");
			break;
		case Aula.ESPADAS:
			System.out.println("Sua carta é de espadas");
			break;
		case Aula.COPAS:
			System.out.println("Sua carta é de copas");
			break;
		default:
			System.out.println("Nenhum naipe está presente");
			break;
		}
			
	}
}
