package aula14;

public class MP3 implements Player, Audio {

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
		System.out.println("Taxa de Bits: "+ taxaBits);
	}

}
