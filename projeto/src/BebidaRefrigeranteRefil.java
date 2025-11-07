public class BebidaRefrigeranteRefil implements Produtos {
    protected static double preco;
    protected RefriSabores sabor;

    BebidaRefrigeranteRefil(RefriSabores sabor) {
        this.sabor = sabor;
        preco = 12.00;
    }

    @Override
    public void imprime() {
        System.out.print(sabor);
        System.out.print("Preço: " + preco + "\n");
    }

    @Override
    public void exibirNome() {
        System.out.print("Refrigerante refil\nTipo:"+sabor+"\n");
    }
}
