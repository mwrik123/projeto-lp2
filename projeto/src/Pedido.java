import java.util.ArrayList;

public class Pedido{
    private int id;
    private String nome;
    private ArrayList <Produtos> produtos;
    private double valorFinal;
    

    Pedido(int id, String nome, ArrayList <Produtos> produtos){
        this.id = id;
        this.produtos = produtos;
        this.nome = nome;
        setValorFinal(calculaValorFinal());
    }

    public void atualizaNome(String novoNome){
        nome = novoNome;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Produtos> getProdutos() {
        return produtos;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public int getId() {
        return id;
    }

    double calculaValorFinal(){
        double valor = 0.00;
        for(int i = 0; i < produtos.size(); i++){
            valor = valor+produtos.get(i).getPreco();
        }
        return valor;
    }

}
