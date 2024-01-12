package br.com.ada.pooii.aula02.exercicio01;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.ligar();
        carro.acelerar(20);
        carro.frear();
        carro.desligar();
        System.out.println();

        Bicicleta bicicleta = new Bicicleta();
        bicicleta.acelerar(3);
        bicicleta.frear();
        System.out.println();

        VeiculoMotorizado moto = new Moto();
        moto.ligar();
        moto.acelerar(10);
        moto.frear();
        moto.desligar();
        System.out.println();
    }
}
