package telefone.iphone.reprodutor;

public class ReprodutorDeMusica {
    public String nomeDaMusica;
    public int tempoDaMucica;

    public void play(String nome, double tempo) {
        System.out.println(nome + " está tocando. Duração: " + tempo + " minutos.");
    }

    public void pause() {
        System.out.println("A musica foi pausada!");
    }

    public void stop() {
        System.out.println("A musica foi interrompida");
    }

    public static void main(String[] args) {
        ReprodutorDeMusica tocarMusica = new ReprodutorDeMusica();
        tocarMusica.play("Música aleatória", 3.5);
        tocarMusica.pause();
        tocarMusica.stop();

    }
}
