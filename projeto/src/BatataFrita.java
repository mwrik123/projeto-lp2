public class BatataFrita implements Produtos {

    private static double preco;
    private String nome;

    BatataFrita() {
        setNome("Batata Frita\n");
        setPreco(9.00);
    }

    public static void setPreco(double preco) {
        BatataFrita.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void imprime() {
        exibirNome();
        System.out.print("Preço: " + getPreco() + "\n");
    }

    @Override
    public void exibirNome() {
        System.out.print(getNome());
    }

    @Override
    public double getPreco() {
        return preco;
    }
}
