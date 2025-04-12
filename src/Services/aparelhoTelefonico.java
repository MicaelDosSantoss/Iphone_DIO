package Services;

public interface aparelhoTelefonico {
    static void tocar() {
        System.out.println("Tocando o telefone!");
    }

    static void pausar() {
        System.out.println("Pausar");
    }

    static void selecionarMusica(String musica) {
        System.out.println("Tocando: " + musica);
    }
}
