import java.util.ArrayList;

public class Caixa {
    protected ArrayList<Pedido> pedidos;
    protected double valorTotal;

    Caixa(){
        pedidos = new ArrayList<>();
        valorTotal = 0.00;
    }

    void exibePedidos(){
        for(int i = 0; i < pedidos.size(); i++){
            System.out.print("ID: "+pedidos.get(i).id+"\nNome: "+pedidos.get(i).nome+"\nTotal: "+pedidos.get(i).valorFinal+"\nProdutos:\n");
            for(int j = 0; j < pedidos.get(i).produtos.size(); j++){
                pedidos.get(i).produtos.get(j).exibirNome();
            }
        }
    }

    void exibePedidosTeste(){
        for(int i = 0; i < pedidos.size(); i++){
            System.out.print("ID: "+pedidos.get(i).id+"\nNome: "+pedidos.get(i).nome+"\nTotal: "+pedidos.get(i).valorFinal+"\nProdutos:\n");
            for(int j = 0; j < pedidos.get(i).produtos.size(); j++){
                pedidos.get(i).produtos.get(j).exibirNome();
                System.out.print("\n");
                pedidos.get(i).produtos.get(j).imprime();
            }
        }
    }

    void addAoValorTotal(Pedido pedido){
        valorTotal = valorTotal + pedido.valorFinal;
    }

    double getValorTotal(){
        return valorTotal;
    }
}
