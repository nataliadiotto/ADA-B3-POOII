package br.com.ada.pooii.aula06.exercicio;

import java.util.List;

public class exercicioSRP {

    public class Pedido {
        public double calcularTotalPedido() { return 0.0; }
        public List<Item> getItens() { /*...*/ return null;}
        public long getQtdItens() { /*...*/ return -1;}
        public void addItem(Item item) { /*...*/ }
        public void deletarItem(Item item) { /*...*/ }


        public class OrderController {
            public void imprimirPedido() { /* Violação do SRP */ }
            public void imprimirItens() { /* Violação do SRP */ }
        }

        public class OrderRepository{
            public void buscarPedido(long id) { /* Violação do SRP */ }
            public void salvar(Pedido pedido) { /* Violação do SRP */ }
            public void atualizar(long id, Pedido pedido) { /* Violação do SRP */ }
            public void deletar(long id) { /* Violação do SRP */ }

        }

       public class EmailService{
           public void enviarEmailConfirmacao(String mensagem) { /* Violação do SRP */ }
       }

       public class ShippingService{
           public void enviarParaTransporte() { /* Violação do SRP */ }
       }

    }

    class PedidoExercicio {
        private long id;
        private List<Item> itens;

        // getters e setters
    }

    class Item {
        // Detalhes do item
    }

}
