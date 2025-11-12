import java.util.ArrayList;

public class BurguerAmericano implements Produtos {
    
    private ArrayList<IngredientesBurguerAmericano> ingredientes;
    private  double preco;
    private String nome;

    BurguerAmericano() {
        ingredientes = new ArrayList<>();

        setIngredientes(1);
    }
    BurguerAmericano(int i){
        ingredientes = new ArrayList<>();
        setIngredientes(i);
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIngredientes(int i){
        if(i == 1){
            for (int j = 0; j < 6; j++) {
                ingredientes.add(IngredientesBurguerAmericano.values()[j]);
            }
            setPreco(15.00);
            setNome("Burguer americano Simples\n");
        } else if(i == 2){
            for (int j = 0; j < 7; j++) {
                ingredientes.add(IngredientesBurguerAmericano.values()[j]);
            }
            setPreco(17.00);
            setNome("Burguer americano Duplo\n");
        } else if (i == 3) {
            for (int j = 0; j < 8; j++) {
                ingredientes.add(IngredientesBurguerAmericano.values()[j]);
            }
            setPreco(20.00);
            setNome("Burguer americano Triplo\n");
        } else {
            System.out.print("erro na criação do burguer americano\n");
        }
    }

    public String getNome() {
        return nome;
    }

    public void remove(IngredientesBurguerAmericano ingrediente) {
        ingredientes.remove(ingrediente);
    }

    @Override
    public void imprime() {
        exibirNome();
        for (IngredientesBurguerAmericano ing : ingredientes) {
            System.out.print(ing + "\n");
        }
        System.out.print("Preço: " + getPreco() + "\n");
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
