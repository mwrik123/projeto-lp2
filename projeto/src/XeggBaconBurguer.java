import java.util.ArrayList;

public class XeggBaconBurguer implements Produtos{
    private ArrayList <IngredientesXBB> ingredientes;
    private static double preco;
    private String nome;

    XeggBaconBurguer(){
        ingredientes = new ArrayList<>();
        for(int i = 0; i < IngredientesXBB.values().length; i++){
            getIngredientesXBB().add(IngredientesXBB.values()[i]);
        }
        setPreco(18.50);
        setNome();
    }
    public void setPreco(double valor){
        XeggBaconBurguer.preco = valor;
    }

    public void setNome() {
        this.nome = "X egg bacon burguer\n";
    }

    public String getNome() {
        return nome;
    }

    public void remove(IngredientesXBB a ){
        getIngredientesXBB().remove(a);
    }
    public ArrayList<IngredientesXBB> getIngredientesXBB() {
        return ingredientes;
    }
    @Override
    public void imprime() {
        exibirNome();
        for(int i = 0; i < getIngredientesXBB().size(); i++){
            System.out.print(getIngredientesXBB().get(i) + "\n");
        }
        System.out.print("Preço: "+getPreco()+"\n");
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