public class Suco implements Produtos {
    protected static double preco;
    protected Sucos sabor;

    Suco(Sucos saborSuco) {
        sabor = saborSuco;
        preco = 6.00;
    }

    @Override
    public void imprime() {
        System.out.print(sabor);
        System.out.print("Preço: " + preco + "\n");
    }

    @Override
    public void exibirNome() {
        System.out.print("Suco\nTipo: "+sabor+"\n");
    }
}
