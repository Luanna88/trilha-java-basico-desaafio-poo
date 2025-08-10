package modelagemIphone;

public class Main {
	public static void main(String[] args) {
		
		 iPhone meuIphone = new iPhone();

	        // Testando reprodutor musical
	        meuIphone.selecionarMusica("Imagine - John Lennon");
	        meuIphone.tocar();
	        meuIphone.pausar();

	        // Testando telefone
	        meuIphone.ligar("123456789");
	        meuIphone.atender();
	        meuIphone.iniciarCorreioVoz();

	        // Testando navegador
	        meuIphone.exibirPagina("https://apple.com");
	        meuIphone.adicionarNovaAba();
	        meuIphone.atualizarPagina();
		
	}

}
