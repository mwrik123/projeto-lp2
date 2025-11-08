import java.util.ArrayList;

public class BurguerAmericano implements Produtos {
    
    protected ArrayList<IngredientesBurguerAmericano> ingredientes;
    
    protected static double preco;

    BurguerAmericano() {
        ingredientes = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            ingredientes.add(IngredientesBurguerAmericano.values()[i]);
        }

        preco = 22.0;
    }

    void remove(IngredientesBurguerAmericano ingrediente) {
        ingredientes.remove(ingrediente);
    }

    @Override
    public void imprime() {
        for (IngredientesBurguerAmericano ing : ingredientes) {
            System.out.print(ing + "\n");
        }
        System.out.print("Preço: " + preco + "\n");
    }

    @Override
    public void exibirNome() {
        System.out.print("Burguer americano\n");
    }

    @Override
    public double getValor() {
        return preco;
    }

    void novoPreco(int versao) {
        if (versao == 2) { 
            BurguerAmericano.preco = 28.0;
        }
        if (versao == 3) { 
            BurguerAmericano.preco = 34.0;
        }
    }
}
