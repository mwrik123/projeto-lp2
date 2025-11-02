public class BurguerAmericanoTriplo extends BurguerAmericano implements Produtos {

    BurguerAmericanoTriplo() {
        super();
        ingredientes.add(IngredientesBurguerAmericano.values()[6]);
        ingredientes.add(IngredientesBurguerAmericano.values()[7]);
        novoPreco(3);
    }
}
