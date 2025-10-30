import java.util.ArrayList;

interface Produtos{
    void imprime();
}

public class Pedido{
    int id;
    String nome;
    ArrayList <Produtos> produtos;
    double valorFinal;

    Pedido(int id, String nome, ArrayList <Produtos> produtos){
        this.id = id;
        this.produtos = produtos;
        this.nome = nome;
    }
}
