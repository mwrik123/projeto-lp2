public class HamburguerDuplo extends Hamburguer implements Produtos{

    HamburguerDuplo(int opc){
        super(opc);
        for(int i = 8; i < 10; i++){
            ingredientes.add(Ingredientes.values()[i]);
        }
        novoPreco();
    }

}
