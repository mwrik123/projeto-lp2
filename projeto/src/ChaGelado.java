public class ChaGelado implements Produtos {
    protected static double preco;
    protected ChaSabor sabor;

    ChaGelado(ChaSabor sabor) {
        this.sabor = sabor;
        preco = 7.00;
    }

    @Override
    public void imprime() {
        System.out.print(sabor);
        System.out.print("Preço: " + preco + "\n");
    }

    @Override
    public void exibirNome() {
        System.out.print("Chá gelado\nTipo:" +sabor+"\n");
    }

    @Override
    public double getValor() {
        return preco;
    }
}
