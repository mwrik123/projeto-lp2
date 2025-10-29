import java.util.ArrayList;


public class CrocSimples implements Produtos{
    protected ArrayList<IngredientesCroc> ingredientesCrocs;
    protected static double preco;

    CrocSimples(){
        ingredientesCrocs = new ArrayList<>();
        for(int i = 0; i < IngredientesCroc.values().length; i++){
            ingredientesCrocs.add(IngredientesCroc.values()[i]);
        }
        preco = 15.0;
    }

    void remove(IngredientesCroc ingrediente){
        ingredientesCrocs.remove(ingrediente);
    }

    public void imprime(){
        for(IngredientesCroc ingredientes1 : ingredientesCrocs){
            System.out.print(ingredientes1+"\n");
        }
        System.out.print("Preço: "+preco+"\n");
    }

    void novoPreco(int i){
        if(i == 2){
            CrocSimples.preco = 20.0;
        }
        if(i == 3){
            CrocSimples.preco = 25.0;
        }
    }
}
