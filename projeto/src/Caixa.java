import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Caixa {
    private ArrayList<Pedido> pedidos;
    private double valorTotal;

    Caixa(){
        pedidos = new ArrayList<>();
        valorTotal = 0.00;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    void exibePedidos(){
        for(int i = 0; i < pedidos.size(); i++){
            System.out.print("ID: "+pedidos.get(i).getId()+"\nNome: "+pedidos.get(i).getNome()+"\nTotal: "+pedidos.get(i).getValorFinal()+"\nProdutos:\n");
            for(int j = 0; j < pedidos.get(i).getProdutos().size(); j++){
                pedidos.get(i).getProdutos().get(j).exibirNome();
            }
        }
    }

    void exibePedidosTeste(){
        for(int i = 0; i < getPedidos().size(); i++){
            System.out.print("ID: "+getPedidos().get(i).getId()+"\nNome: "+getPedidos().get(i).getNome()+"\nTotal: "+getPedidos().get(i).getValorFinal()+"\nProdutos:\n");
            for(int j = 0; j < getPedidos().get(i).getProdutos().size(); j++){
                getPedidos().get(i).getProdutos().get(j).imprime();
                System.out.print("\n");
            }
        }
    }

    void addAoValorTotal(Pedido pedido){
        valorTotal = valorTotal + pedido.getValorFinal();
    }

    double getValorTotal(){
        return valorTotal;
    }
}
