public class BatataFrita implements Produtos {

    protected static double preco;
    protected String nome;

    BatataFrita() {
        nome = "Batata Frita";
        preco = 9.00;
    }

    @Override
    public void imprime() {
        System.out.print(nome + "\n");
        System.out.print("Preço: " + preco + "\n");
    }
}
