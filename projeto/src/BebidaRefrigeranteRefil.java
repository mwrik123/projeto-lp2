public class BebidaRefrigeranteRefil implements Produtos {
    private static double preco;
    private RefriSabores sabor;
    private String nome;

    BebidaRefrigeranteRefil(int i) {
        setSabor(i);
        setPreco(7.00);
        setNome();
    }

    public void setNome() {
        this.nome = "Refrigerante refil "+getSabor()+"\n";
    }

    public static void setPreco(double preco) {
        BebidaRefrigeranteRefil.preco = preco;
    }

    public void setSabor(int i) {
        this.sabor = RefriSabores.values()[i-1];
    }

    public RefriSabores getSabor() {
        return sabor;
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
