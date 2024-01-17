package br.com.ada.pooii.aula05.exercicio_stack;

import br.com.ada.pooii.aula05.exercicio_stack.StackImpl;

public class Main {

    public static void main(String[] args) {

        StackImpl<String> minhaStack = new StackImpl<>();

        minhaStack.push("lucia");
        minhaStack.push("maria");
        minhaStack.push("erica");
        minhaStack.push("paula");

        String nome = minhaStack.pop();
        System.out.println(nome);

        nome = minhaStack.pop();
        System.out.println(nome);

        System.out.println("\nPEEK");
        nome = minhaStack.peek();
        System.out.println(nome);

        System.out.println("\nPEEK");
        nome = minhaStack.peek();
        System.out.println(nome);
        System.out.println();

        System.out.println("Is list empty? " + minhaStack.isEmpty());
        System.out.println();

    }

}
