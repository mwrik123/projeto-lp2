public class BebidaAgua implements Produtos {
    protected static double preco;
    protected String nome;

    BebidaAgua() {
        nome = "Água";
        preco = 5.00;
    }

    @Override
    public void imprime() {
        System.out.print(nome + "\n");
        System.out.print("Preço: " + preco + "\n");
    }
}
