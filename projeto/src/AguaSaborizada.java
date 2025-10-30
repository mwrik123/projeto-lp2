public class AguaSaborizada implements Produtos {
    protected static double preco;
    protected String nome;

    AguaSaborizada() {
        nome = "Água Saborizada";
        preco = 6.50;
    }

    @Override
    public void imprime() {
        System.out.print(nome + "\n");
        System.out.print("Preço: " + preco + "\n");
    }
}
