package br.com.ada.pooii.aula05.exercicio_stack;

import java.util.ArrayList;
import java.util.List;

public class StackImpl <E> implements Stack<E>{

    private final List<E> listaInterna;

    public StackImpl() {
        this.listaInterna = new ArrayList<>();
    }

    @Override
    public void push(E elemento) {
        listaInterna.add(elemento);
    }

    @Override
    public E pop() {
        return listaInterna.remove(listaInterna.size() - 1); //"remove" já remove e retorna o valor
    }

    @Override
    public E peek() {
        return listaInterna.get(listaInterna.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        if (listaInterna.isEmpty()) return true;
        return false;
    }
}
