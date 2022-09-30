package aula14;

public class Aula {
	
	// INTERFACE ATÉ JAVA 7
	
	private PlayerVideo video;
	
	private PlayerAudio audio;
	
	void video(){
		
		video = new WMV();
		video.nomeArquivo("Superman - O Retorno");
		video.play();
		video.pause();
		video.volume(80);
		video.taxaDeBits(240);
		video.taxaDeQuadros(200);
		video.stop();	
		
		System.out.println();
		
		video = new RMV();
		video.nomeArquivo("Harry Potter - A Pedra Filosofal");
		video.play();
		video.pause();
		video.volume(75);
		video.taxaDeBits(360);
		video.taxaDeQuadros(180);
		video.stop();
	}
	
	void audio() {
		audio = new Radio();
		audio.nomeArquivo("Radio Clube FM");
		audio.play();
		audio.pause();
		audio.taxaDeBits(120);
		audio.stop();
	}
	
	
	

	public static void main(String[] args) {
		
		MP3 mp3 = new MP3();
		mp3.play();
		mp3.pause();
		mp3.taxaDeBits(180);
		mp3.stop();
		
		System.out.println();
		
		AVI avi = new AVI();
		avi.play();
		avi.pause();
		avi.volume(100);
		avi.taxaDeBits(240);
		avi.taxaDeQuadros(100);
		avi.stop();
		
		System.out.println();
		
		WMV wmv = new WMV();
		wmv.nomeArquivo("Batman - O Cavaleiro das Trevas");
		wmv.play();
		wmv.pause();
		wmv.volume(95);
		wmv.taxaDeBits(360);
		wmv.taxaDeQuadros(300);
		wmv.stop();
		
		System.out.println();
		
		
		Aula aula = new Aula();
		aula.video();
		
		System.out.println();
		
		aula.audio();

	}

}
