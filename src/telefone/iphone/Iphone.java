package telefone.iphone;

import telefone.AparelhoTelefonico;

public class Iphone implements AparelhoTelefonico {
    String nome;

    public void abrirReprodutorMusical() {
        System.out.println("Reprodutor musical aberto.");

    }

    public void ligar() {
        System.out.println("Celular ligado!");
    }

    public void desligar() {
        System.out.println("Celular desligando!");
    }

    public void avancar() {
        System.out.println("Página avançanda.");
    }

    public void retornar() {
        System.out.println("Página retornanda.");
    }

    public static void main(String[] args) {
        Iphone acoes = new Iphone();
        acoes.ligar();
        acoes.abrirReprodutorMusical();
    }
}
