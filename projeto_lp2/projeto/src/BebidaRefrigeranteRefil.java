public class BebidaRefrigeranteRefil implements Produtos {
    protected static double preco;
    protected String nome;

    BebidaRefrigeranteRefil() {
        nome = "Refrigerante (Refil)";
        preco = 12.00;
    }

    @Override
    public void imprime() {
        System.out.print(nome + "\n");
        System.out.print("Preço: " + preco + "\n");
    }
}
