package br.com.ada.pooii.aula07.solucao_exercicio.parte_1;

import br.com.ada.pooii.aula06.Pedido;

public class PedidoRepository {

    public Pedido buscarPedido(long id) {
        System.out.println("buscando pedido pelo id: " + id);
        return new Pedido(1, null, "pendente");
    }
    public void salvar(Pedido pedido) {
        System.out.println("salvando pedido no db: " + pedido);
    }
    public void atualizar(long id, Pedido pedido) {
        System.out.println("atualizando pedido " + id + " no db pedido atualizado: " + pedido);
    }
    public void deletar(long id) {
        System.out.println("deletando pedido no banco de dados id: " + id);
    }

}
