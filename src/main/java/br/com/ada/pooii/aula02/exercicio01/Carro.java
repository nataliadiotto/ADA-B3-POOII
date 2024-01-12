package br.com.ada.pooii.aula02.exercicio01;

public class Carro implements VeiculoMotorizado {

    Double velocidadeAtual = 0.0;

    @Override
    public void ligar() {
        System.out.println("Carro ligado.");
    }

    public void desligar() {
        System.out.println("Carro desligado.");
    }

    @Override
    public void acelerar(int velocidade) {
        if (velocidade > 0) {
            velocidadeAtual += velocidade;
            System.out.println("Acelerar! Velocidade atual: " + velocidadeAtual);
        } else {
            System.out.println("Velocidade não pode ser negativa");
        }

    }

    @Override
    public void frear() {
        if (velocidadeAtual >= 10) {
            this.velocidadeAtual -= 10;
            System.out.println("Freio acionado! Velocidade atual: " +velocidadeAtual);
        } else {
            System.out.println("Velocidade atual não pode ser negativa");
        }

    }

}
