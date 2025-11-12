public class BebidaRefrigeranteLata implements Produtos {
    private static double preco;
    private RefriSabores sabor;
    private String nome;

    BebidaRefrigeranteLata(int i) {
        setSabor(i);
        setPreco(5.00);
        setNome();
    }

    public void setSabor(int i) {
        this.sabor = RefriSabores.values()[i-1];
    }

    public void setNome() {
        this.nome = "Refrigerante lata "+ getSabor()+"\n";
    }

    public static void setPreco(double preco) {
        BebidaRefrigeranteLata.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public RefriSabores getSabor() {
        return sabor;
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
