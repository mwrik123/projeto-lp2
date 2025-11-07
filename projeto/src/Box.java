import java.util.ArrayList;

public class Box implements Produtos {
    protected ArrayList <Produtos> produtos_box;
    protected static double preco;

    //2 hambugueres, 2 bebidas, 1 sorvete, 1 petisco
    Box(ArrayList<Produtos> produtos){
        produtos_box = new ArrayList<>();
        produtos_box = produtos;

        preco = 70.0;
    }

    @Override
    public void imprime() {
        for(int i = 0; i < produtos_box.size(); i++){
            produtos_box.get(i).exibirNome();
        }
    }

    @Override
    public void exibirNome() {
        System.out.print("Box");
    }
}
