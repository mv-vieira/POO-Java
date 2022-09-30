package aula14;

public class WMV implements PlayerVideo {

	@Override
	public void play() {
		System.out.println("Play...");
	}

	@Override
	public void stop() {
		System.out.println("Stop.");
	}

	@Override
	public void pause() {
		System.out.println("Pause...");
	}

	@Override
	public void volume(int volume) {
		System.out.println("Volume: "+ volume);
	}

	@Override
	public void taxaDeBits(int taxaBits) {
		System.out.println("Taxa de Bits: "+taxaBits);
	}

	@Override
	public void taxaDeQuadros(int taxaQuadro) {
		System.out.println("FPS: "+taxaQuadro);
	}

	@Override
	public void nomeArquivo(String arquivo) {
		System.out.println("Filme: "+arquivo);
	}

}
