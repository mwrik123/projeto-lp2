import java.util.ArrayList;

public class Box implements Produtos {
    private ArrayList <Produtos> produtos_box;
    private static double preco;
    private final String nome;

    //2 hambugueres, 2 bebidas, 1 sorvete, 1 petisco
    Box(ArrayList<Produtos> produtos){
            produtos_box = new ArrayList<>();
            produtos_box = produtos;
            preco = 45.0;
            nome = "Box-combo(tudo por 45.00)\n";

    }

    public String getNome() {
        return nome;
    }

    @Override
    public void imprime() {
        exibirNome();
        for(int i = 0; i < produtos_box.size(); i++){
            produtos_box.get(i).imprime();
        }
    }

    @Override
    public void exibirNome() {
        System.out.print(getNome());
    }

    @Override
    public double getPreco() {
        return preco;
    }
}
