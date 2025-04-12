package Services;

public interface reprodutorMusical {
     static void ligar(String ligacao ) {
         System.out.println("Ligando para: " + ligacao);
     } ;

     static void atender() {
         System.out.println("Atendendo telefone!");
     }

    static void iniciarCorreioDeVoz() {
        System.out.println("Abrindo o correio de voz");
    }
}
