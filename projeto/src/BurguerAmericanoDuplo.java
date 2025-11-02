public class BurguerAmericanoDuplo extends BurguerAmericano implements Produtos {

    BurguerAmericanoDuplo() {
        super();
        ingredientes.add(IngredientesBurguerAmericano.values()[6]);
        novoPreco(2);
    }
}
