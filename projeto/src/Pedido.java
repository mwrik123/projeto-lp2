import java.util.ArrayList;

public class Pedido{
    int id;
    String nome;
    ArrayList <Produtos> produtos;
    double valorFinal;

    Pedido(int id, String nome, ArrayList <Produtos> produtos){
        this.id = id;
        this.produtos = produtos;
        this.nome = nome;
        valorFinal = calculaValorFinal();
    }

    double calculaValorFinal(){
        valorFinal = 0.00;
        for(int i = 0; i < produtos.size(); i++){
            valorFinal = valorFinal+produtos.get(i).getValor();
        }
        return valorFinal;
    }
}
