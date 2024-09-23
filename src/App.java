public class App {
    public static void main(String[] args) throws Exception {
        Comportamentos Telefone = new Comportamentos();

        Telefone.Ligar();
        Telefone.IniciarCorreioVoz();
        Telefone.Atender();
        Telefone.SelecionarMusica("joji - WILL HE");
        Telefone.Tocar();
        Telefone.Pausar();
        Telefone.ExibirPagina("youtube");
        Telefone.AdicionarNovaAba();
        Telefone.AtualizarPagina();
    }
}
