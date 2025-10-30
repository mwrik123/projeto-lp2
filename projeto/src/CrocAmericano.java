public class CrocAmericano extends CrocSimples implements Produtos{
    CrocAmericano(){
        super();
        for(int i = 7; i < 10; i++){
            ingredientesCrocs.add(IngredientesCroc.values()[i]);
        }
        novoPreco(3);
    }
}
