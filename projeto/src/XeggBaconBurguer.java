import java.util.ArrayList;

public class XeggBaconBurguer implements Produtos{
    protected ArrayList <IngredientesXBB> ingredientes;
    protected static double preco;

    XeggBaconBurguer(){
        ingredientes = new ArrayList<>();
        for(int i = 0; i < IngredientesXBB.values().length; i++){
            ingredientes.add(IngredientesXBB.values()[i]);
        }
        preco = 18.0;
    }
    public void remove( IngredientesXBB a ){
        ingredientes.remove(a);
    }
    @Override
    public void imprime() {

    }
}