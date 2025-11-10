public class HamburguerTriplo extends Hamburguer implements Produtos{
    HamburguerTriplo(){
        super(); //já insere todos os ingredientes
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