package br.com.ada.pooii.aula03.exercicio;

public record Pessoa (Integer id, String nome) implements ObjetoComId<Integer> {
    @Override
    public Integer getId() {
        return id;
    }
}
