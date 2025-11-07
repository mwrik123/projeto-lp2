public class HamburguerTriplo extends Hamburguer implements Produtos{
    HamburguerTriplo(){
        super();
        novoPreco(3);
    }

    @Override
    public void exibirNome() {
        System.out.print("Hamburguer triplo\n");
    }
}