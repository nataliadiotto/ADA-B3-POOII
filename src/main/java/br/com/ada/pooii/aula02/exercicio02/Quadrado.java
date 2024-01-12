package br.com.ada.pooii.aula02.exercicio02;

public class Quadrado implements Shape {

    Double altura;

    public Quadrado(Double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularÁrea() {
        return this.altura * this.altura;
    }
}
