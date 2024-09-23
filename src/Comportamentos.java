import java.util.Random;
public class Comportamentos {
    
    static void Ligar(){
        System.out.println("Ligando...");
    }

    static void Atender(){
        String numeroAleatorio = gerarNumeroTelefoneAleatorio();
        System.out.println("Atendendo telefone... Ligacao recebida de: " + numeroAleatorio);
    }

    static void IniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");
    }


    static void Tocar(){
        System.out.println("Tocando musica...") ;
    }

    static void Pausar(){
        System.out.println("Pausando musica");
    }

    static void SelecionarMusica(String musica){
        System.out.println("Musica '" + musica + "' selecionada.");
    }

    static void ExibirPagina(String aba){
        System.out.println("ixibindo nova aba: " + aba);
    }

    static void AdicionarNovaAba(){
        System.out.println("Adicionando uma nova aba");
        ExibirPagina("Home - google");
    }

    static void AtualizarPagina(){
        System.out.println("Atualizando pagina");
    }
    
    private static String gerarNumeroTelefoneAleatorio() {
        Random random = new Random();
        int codigoArea = random.nextInt(900) + 100; 
        int prefixo = random.nextInt(900) + 100;    
        int numeroLinha = random.nextInt(9000) + 1000; 
        return "(" + codigoArea + ") " + prefixo + "-" + numeroLinha;
    }
}