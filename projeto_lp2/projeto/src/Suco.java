public class Suco implements Produtos {
    protected static double preco;
    protected String nome;
    protected String sabor;

    Suco(String saborSuco) {
        sabor = saborSuco;
        nome = "Suco " + sabor;
        preco = 6.00;
    }

    @Override
    public void imprime() {
        System.out.print(nome + "\n");
        System.out.print("Preço: " + preco + "\n");
    }
}
