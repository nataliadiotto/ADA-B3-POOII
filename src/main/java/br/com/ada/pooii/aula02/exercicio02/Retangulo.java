package br.com.ada.pooii.aula02.exercicio02;

public class Retangulo implements Shape {

   Double base;
   Double altura;

    public Retangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularÁrea() {
        return this.base * this.altura;
    }
}
