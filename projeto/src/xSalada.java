import java.util.ArrayList;

public class xSalada implements Produtos {

    private ArrayList <IngredientesXSalada> ingredientesXSalada;
    private static double preco;
    private String nome;

    xSalada(){
        ingredientesXSalada = new ArrayList<>();
        for(int i = 0; i < IngredientesXSalada.values().length; i++){
            getIngredientesXSalada().add(IngredientesXSalada.values()[i]);
        }
        setPreco(19.50);
        setNome();
    }
    public void setPreco(double preco){
        xSalada.preco = preco;
    }

    public void setNome() {
        this.nome = "X salada";
    }

    public String getNome() {
        return nome;
    }

    void remove(IngredientesXSalada ingrediente){
        getIngredientesXSalada().remove(ingrediente);
    }

    @Override
    public void imprime() {
        exibirNome();
        for (IngredientesXSalada ingrediente : getIngredientesXSalada()) {
            System.out.print(ingrediente + "\n");
        }
        System.out.print("Preço: " + getPreco() + "\n");
    }

    public ArrayList<IngredientesXSalada> getIngredientesXSalada(){
        return ingredientesXSalada;
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
