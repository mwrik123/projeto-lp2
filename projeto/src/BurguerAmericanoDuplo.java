public class BurguerAmericanoDuplo extends BurguerAmericano implements Produtos {

    BurguerAmericanoDuplo() {
        super(2);
    }

    @Override
    public void exibirNome() {
        System.out.print(super.getNome());
    }

    @Override
    public double getPreco() {
        return super.getPreco();
    }
}
