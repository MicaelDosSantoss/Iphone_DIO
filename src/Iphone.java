import Services.*;

public class Iphone {
    public static void main(String[] args) {

        System.out.println("\n ===== REPRODUTOR MUSICAL ===== \n");
        reprodutorMusical.ligar("11 9433-12323");
        reprodutorMusical.atender();
        reprodutorMusical.iniciarCorreioDeVoz();

        System.out.println("\n ===== APARELHO TELEFÔNICO ===== \n");

        aparelhoTelefonico.tocar();
        aparelhoTelefonico.pausar();
        aparelhoTelefonico.selecionarMusica("Post Malone");

        System.out.println("\n ===== NAVEGADOR DE INTERNET ===== \n");

        navegadorDeInternet.adicionarNovaAba();
        navegadorDeInternet.atualizarPagina();
        navegadorDeInternet.exibirPagina("GOOGLE");

    }
}
