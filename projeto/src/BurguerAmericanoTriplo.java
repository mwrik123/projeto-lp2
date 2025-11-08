public class BurguerAmericanoTriplo extends BurguerAmericano implements Produtos {

    BurguerAmericanoTriplo() {
        super();
        ingredientes.add(IngredientesBurguerAmericano.values()[6]);
        ingredientes.add(IngredientesBurguerAmericano.values()[7]);
        novoPreco(3);
    }

    @Override
    public void exibirNome() {
        System.out.print("Burguer americano triplo\n");
    }

    @Override
    public double getValor() {
        return super.getValor();
    }
}
