package br.com.ada.pooii.aula02.exercicio02;

public class Main {

    public static void main(String[] args) {

        Shape quadrado = new Quadrado(5.0);
        System.out.println("Area do quadrado: " + quadrado.calcularÁrea());

        Shape triangulo = new Triangulo(6.0, 3.0);
        System.out.println("Area do triângulo: " + triangulo.calcularÁrea());

        Retangulo retangulo = new Retangulo(8.0, 4.0);
        System.out.println("Area do retângulo: " + retangulo.calcularÁrea());

    }

}
