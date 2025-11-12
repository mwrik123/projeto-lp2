import java.util.ArrayList;
import java.util.Collections;

public class Hamburguer implements Produtos{

    private ArrayList <Ingredientes> ingredientes;
    private static double preco;
    private String nome;

    Hamburguer(int i){
        ingredientes = new ArrayList<>();
        setIngredientesFouC(i);
        setPreco(21.50);
        setNome("Hamburguer Simples\n");
    }
    Hamburguer(){
        ingredientes = new ArrayList<>();
    }

    public static void setPreco(double preco) {
        Hamburguer.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIngredientesFouC(int i){
        for(int j = 0; j < 6; j++){
            ingredientes.add(Ingredientes.values()[j]);
        }
        if(i == 1){
            ingredientes.add(Ingredientes.FRANGO);
        } else if (i == 2){
            ingredientes.add(Ingredientes.CARNE);
        } else {
            System.out.print("erro no set de ingredientes do hamburguer");
        }
    }

    public String getNome() {
        return nome;
    }

    public void remove(Ingredientes ingrediente){
        ingredientes.remove(ingrediente);
    }
    public void addIngrediente(Ingredientes ingredientes){
        this.ingredientes.add(ingredientes);
    }
    public void setIngredientesTriplo(){
        Collections.addAll(ingredientes, Ingredientes.values());
    }
    @Override
    public void imprime() {
        exibirNome();
        for(Ingredientes ingredientes1 : ingredientes){
            System.out.print(ingredientes1+"\n");
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
