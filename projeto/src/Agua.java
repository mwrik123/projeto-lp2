public class Agua implements Produtos {
    protected static double preco;
    protected Aguas agua;

    Agua(Aguas agua) {
        this.agua = agua;
        preco = 5.00;
    }

    @Override
    public void imprime() {
        System.out.print(agua);
        System.out.print("Preço: " + preco + "\n");
    }

    @Override
    public void exibirNome() {
        System.out.print("Água\nTipo:" + agua +"\n");
    }
}
