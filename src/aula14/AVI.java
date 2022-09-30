package aula14;

public class AVI implements Player, Video, Audio {

	
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

}
