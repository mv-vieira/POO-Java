package aula13;

public class Aula {

	private Veiculo veiculo;
	
	private Carro carro;
	
	private Moto moto;
	
	void CarrosEMotos() {
		
		carro = new Ford();
		carro.setNome("Mustang");
		carro.setCor("Vermelho");
		carro.setPeso(700);
		System.out.println(carro.toString()+" -- Modelo: "+carro.getNome());
		
		moto = new Yamaha();
		moto.setNome("Fazer 250");
		moto.setCor("Azul");
		moto.setPeso(100);
		System.out.println(moto.toString()+ " -- Modelo: "+moto.getNome());
		
		
	}
	
	void veiculos(){
		
		veiculo = new Ford();
		veiculo.setCor("Amarelo");
		veiculo.setPeso(500);
		System.out.println(veiculo.toString());
		
		carro = (Carro) veiculo;
		carro.setNome("KA");
		System.out.println(carro.toString()+ " -- Modelo: "+carro.getNome());
		
		Ford f = (Ford) veiculo;
		f.setNome("Ranger");
		System.out.println(f.toString()+ " -- Modelo: "+f.getNome());
		
		
		
		veiculo = new Yamaha(); // UP Cast
		veiculo.setCor("Azul");
		veiculo.setPeso(100);
		System.out.println(veiculo.toString());
		
		moto = (Moto) veiculo; // Down Cast
		moto.setNome("XJ600");
		System.out.println(moto.toString()+ " -- Modelo: "+moto.getNome());
		
		Yamaha y = (Yamaha) veiculo; // Down Cast
		y.setNome("CBR600");
		System.out.println(y.toString()+ " -- Modelo: "+y.getNome());
		
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		new Aula().veiculos();
	}
}
