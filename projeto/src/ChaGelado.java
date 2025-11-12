public class ChaGelado implements Produtos {
    private static double preco;
    private ChaSabor sabor;
    private String nome;
    ChaGelado(int i) {
        setSabor(i);
        setPreco(7.00);
        setNome();
    }

    public void setSabor(int i) {
        this.sabor = ChaSabor.values()[i-1];
    }

    public static void setPreco(double preco) {
        ChaGelado.preco = preco;
    }

    public void setNome() {
        this.nome = "Chá gelado " +sabor+"\n";
    }

    public String getNome() {
        return nome;
    }

    public ChaSabor getSabor() {
        return sabor;
    }

    @Override
    public double getPreco() {
        return preco;
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

}
