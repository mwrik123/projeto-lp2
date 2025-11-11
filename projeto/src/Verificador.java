import java.util.ArrayList;

public class Verificador {
    void verificaLista(ArrayList<Produtos> produtos) throws ListaVaziaException{
        if(produtos.isEmpty()) {
            throw new ListaVaziaException("A lista está vazia!\n");
        }
    }
    void verificaPedidosPendentes(ArrayList<Pedido> pedidos) throws  ListaPendenteException{
        if (!pedidos.isEmpty()){
            throw new ListaPendenteException("Não é possível fechar o caixa. Finalize os pedidos pendentes\n");
        }
    }
}
