public class HamburguerTriplo extends Hamburguer implements Produtos{
    HamburguerTriplo(){
        super();
        ingredientes.add(Ingredientes.values()[10]); //novo
        ingredientes.add(Ingredientes.values()[11]); //novo
        novoPreco(3);
    }

    @Override
    public void exibirNome() {
        System.out.print("Hamburguer triplo\n");
    }

    @Override
    public double getValor() {
        return super.getValor();
    }
}