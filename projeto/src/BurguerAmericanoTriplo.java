public class BurguerAmericanoTriplo extends BurguerAmericano implements Produtos {

    BurguerAmericanoTriplo() {
        super(3);
    }

    @Override
    public void exibirNome() {
        System.out.print(getNome());
    }

    @Override
    public double getPreco() {
        return super.getPreco();
    }
}
