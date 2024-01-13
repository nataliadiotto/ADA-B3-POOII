package br.com.ada.pooii.aula03.exercicio;
import java.util.ArrayList;
import java.util.List;

public class MinhaLista <T, U>{

    List<T> elementos = new ArrayList<>();

    public void adicionar(T elemento) {
        this.elementos.add(elemento);
    }

    public T obter(int indice) {
        if (indice >= elementos.size() && indice < 0){
            return null;
        } else {
            return elementos.get(indice);
        }
    }

    public int indice(U identificador) {
        int indice = 0;
        for (int i = 0; i < elementos.size(); i++) {
            if (elementos.get(i).equals(identificador)) {
                indice = elementos.indexOf(i);
            }
        } return indice;
    }

    public boolean contem(T elemento) {

        //this.elementos.contains(elemento);

        for (int i = 0; i < elementos.size(); i++) {
            if (this.elementos.get(i).equals(elemento)) {
                return true;
            }
        }
        return false;
    }

}

