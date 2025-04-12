package Services;

public interface navegadorDeInternet {

    static void exibirPagina(String url) {
        System.out.println("Aba aberta: " + url);
    }

    static void adicionarNovaAba() {
        System.out.println("Adicionando nova aba!");
    }

    static void atualizarPagina() {
        System.out.println("Atualizando a pagina!");
    }
}
