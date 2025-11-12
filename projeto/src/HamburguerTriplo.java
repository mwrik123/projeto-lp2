public class HamburguerTriplo extends Hamburguer implements Produtos{
    HamburguerTriplo(){
        super();
        setPreco(25.00);
        setIngredientesTriplo();
        setNome("Hamburguer Triplo\n");
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