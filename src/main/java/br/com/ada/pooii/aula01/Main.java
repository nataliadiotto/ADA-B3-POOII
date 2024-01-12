package br.com.ada.pooii.aula01;

import br.com.ada.pooii.domain.Gerente;
import br.com.ada.pooii.domain.Vendedor;

public class Main {
    public static void main(String[] args) {
//**Maven** → gerenciador de dependências, gerencia o projeto de uma forma e compila.
//pacotes → geralmente serão o domínio invertido (br.com.ada.pooii)
//
//**Classe abstrata vs. interface**
//
//→ Só podemos herdar **UMA** classe abstrata por vez, interface podemos herdar múltiplas.
//→ Interface é um contrato: todas as classes que a implementarem precisa seguir o contrato (implementar os métodos)
//
//**Interfaces**
//
//**É um contrato para dizer o que precisa ser feito, mas não como deve ser feito**
//
//Classe Autentica define o que deve ser autenticado (senha), mas não como essa implementação deve ser realizada.
//
//Uma interface pode HERDAR outra interface, mas não pode IMPLEMENTAR
//
//Podemos ter variáveis em interfaces, mas precisam ser CONSTANTES
//Posso ter método CONCRETO na interface a partir dos métodos **default**


                // checked and unchecked exceptions in java

                Vendedor vendedor = new Vendedor("igor", 1000);
                Gerente gerente = new Gerente("maria", 2000);

                autentica(vendedor, vendedor.getSenha());
//        autentica(funcionario2, "123");

                System.out.println("Imprimindo o bonus do jorge: " + vendedor.getBonus());
                System.out.println("Imprimindo o bonus da maria: " + gerente.getBonus());
            }

            public static void autentica(Autentica a, String senha) {

                a.autenticaDefault(senha);

                if (a.autentica(senha)) {
                    System.out.println("Autenticado");
                } else {
                    System.out.println("Nao autenticado");
                }
            }
        }
