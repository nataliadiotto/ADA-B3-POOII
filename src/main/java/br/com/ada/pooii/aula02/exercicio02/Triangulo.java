package br.com.ada.pooii.aula02.exercicio02;

public class Triangulo implements Shape {

    Double base;
    Double altura;

    public Triangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularÁrea() {
        return (base * altura) / 2;
    }
}
