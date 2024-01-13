package br.com.ada.pooii.aula03.exercicio;
import java.util.ArrayList;
import java.util.List;

public class MinhaLista <T extends ObjetoComId<U>, U>{

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

//    public int indice(U identificador) {
//        int indice;
//        for (int i = 0; i < elementos.size(); i++) {
//            T elementosDaPosicao = this.elementos.get(i);
//            boolean isIgual = elementosDaPosicao.getId().equals(identificador);
//        } return indice;
//    }

    //int indice(U identificador);
    public int indice(U id) {
        for (int i = 0; i < this.elementos.size(); i++) {

            T elementoDaPosicao = this.elementos.get(i);
            boolean isIgual = elementoDaPosicao.getId().equals(id);

            if (isIgual) {
                return i;
            }
        }
        return -1;
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

