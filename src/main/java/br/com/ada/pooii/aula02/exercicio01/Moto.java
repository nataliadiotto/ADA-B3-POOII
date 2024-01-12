package br.com.ada.pooii.aula02.exercicio01;

public class Moto implements VeiculoMotorizado {
    Integer velocidadeAtual = 0;

    @Override
    public void ligar() {
        System.out.println("Moto ligada.");
    }

    @Override
    public void desligar() {
        System.out.println("Moto desligada.");
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
        if (velocidadeAtual >= 5) {
            this.velocidadeAtual -= 5;
            System.out.println("Freio acionado! Velocidade atual: " +velocidadeAtual);
        } else {
            System.out.println("Velocidade atual não pode ser negativa");
        }
    }
}
