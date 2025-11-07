import java.util.ArrayList;

public class Hamburguer implements Produtos{

    protected ArrayList <Ingredientes> ingredientes;
    protected static double preco;

    Hamburguer(int opc){
        ingredientes = new ArrayList<>();
        for(int i = 0; i < 6; i++){
            ingredientes.add(Ingredientes.values()[i]);
        }
        if(opc == 1){
            ingredientes.add(Ingredientes.FRANGO);
        }
        if(opc == 2){
            ingredientes.add(Ingredientes.CARNE);
        }
        preco = 15.0;
    }
    Hamburguer(){
        ingredientes = new ArrayList<>();
        for(int i = 0; i < Ingredientes.values().length; i++){
            ingredientes.add(Ingredientes.values()[i]);
        }
    }

    void remove(Ingredientes ingrediente){
        ingredientes.remove(ingrediente);
    }
    @Override
    public void imprime() {
        for(Ingredientes ingredientes1 : ingredientes){
            System.out.print(ingredientes1+"\n");
        }
        System.out.print("Preço: "+preco+"\n");
    }

    @Override
    public void exibirNome() {
        System.out.print("Hamburguer Simples\n");
    }

    void novoPreco (int i){
        if(i == 2){
            Hamburguer.preco = 20.0;
        }
        if(i == 3){
            Hamburguer.preco = 25.0;
        }
    }
}
