public class BurguerAmericanoDuplo extends BurguerAmericano implements Produtos {

    BurguerAmericanoDuplo() {
        super();
        ingredientes.add(IngredientesBurguerAmericano.values()[6]);
        novoPreco(2);
    }

    @Override
    public void exibirNome() {
        System.out.print("Burguer americano duplo\n");
    }
}
