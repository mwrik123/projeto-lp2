import java.util.ArrayList;

public class xSalada implements Produtos {

    ArrayList <IngredientesXSalada> ingredientesXSalada;
    protected static double preco;

    xSalada(){
        ingredientesXSalada = new ArrayList<>();
        for(int i = 0; i < IngredientesXSalada.values().length; i++){
            ingredientesXSalada.add(IngredientesXSalada.values()[i]);
        }
        preco = 14.50;
    }

    void remove(IngredientesXSalada ingrediente){
        ingredientesXSalada.remove(ingrediente);
    }

    @Override
    public void imprime() {
        for (IngredientesXSalada ingrediente : ingredientesXSalada) {
            System.out.print(ingrediente + "\n");
        }
        System.out.print("Preço: " + preco + "\n");
    }
}
