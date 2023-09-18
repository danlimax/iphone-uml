package telefone.iphone.navegador;

import telefone.iphone.Iphone;

public class Navegador extends Iphone {
    private String URL;

    public String getURL() {
        return URL;
    }

    public void enviarUrl(String url) {
        System.out.println(url);
    }

    public static void main(String[] args) {
        Navegador urlBox = new Navegador();
        urlBox.URL = "http://google.com";
        urlBox.enviarUrl(urlBox.URL);
        urlBox.avancar();
        urlBox.retornar();
    }
}
