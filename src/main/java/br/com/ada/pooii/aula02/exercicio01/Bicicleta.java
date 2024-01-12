package br.com.ada.pooii.aula02.exercicio01;

public class Bicicleta implements Veiculo{

    Integer velocidadeAtual = 0;

    @Override
    public void acelerar(int velocidade) {
        if (velocidade >= 3) {
            velocidadeAtual += velocidade;
            System.out.println("Velocidade atual: " + velocidadeAtual);
        } else {
            System.out.println("Bicicleta não acelera mais que 3km");
        };
    }

    @Override
    public void frear() {
        if (velocidadeAtual >= 3) {
            this.velocidadeAtual -= 3;
            System.out.println("Freio acionado! Velocidade atual: " +velocidadeAtual);
        } else {
            System.out.println("Velocidade atual não pode ser negativa");
        }
    }
}
