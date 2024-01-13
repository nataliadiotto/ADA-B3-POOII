package br.com.ada.pooii.aula03.exercicio;

public class Main {
    public static void main(String[] args) {
        MinhaLista<Pessoa, Integer> pessoas = new MinhaLista<>();

        Pessoa jorge = new Pessoa(1, "jorge");
        pessoas.adicionar(jorge);

        Pessoa maria = new Pessoa(2, "maria");
        pessoas.adicionar(maria);

        Pessoa jess = new Pessoa(3, "jess");
        pessoas.adicionar(jess);

        System.out.println("Elemento na posição 2: " + pessoas.obter(2)); // Saída: Pessoa[id=3, nome="jess]
        System.out.println("A lista contém a pessoa maria? " + pessoas.contem(maria)); // Saída: true
        System.out.println("Qual a posicao do elemento de ID 3? " + pessoas.indice(3)); // Saída: 2

    }

}
