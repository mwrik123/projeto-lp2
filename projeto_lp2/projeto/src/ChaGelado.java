public class ChaGelado implements Produtos {
    protected static double preco;
    protected String nome;

    ChaGelado() {
        nome = "Chá Gelado";
        preco = 7.00;
    }

    @Override
    public void imprime() {
        System.out.print(nome + "\n");
        System.out.print("Preço: " + preco + "\n");
    }
}
