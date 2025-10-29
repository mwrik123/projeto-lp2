public class BebidaRefrigeranteLata implements Produtos {
    protected static double preco;
    protected String nome;
    protected String sabor;

    BebidaRefrigeranteLata(String saborRefri) {
        sabor = saborRefri;
        nome = "Refrigerante Lata (" + sabor + ")";
        preco = 9.00;
    }

    @Override
    public void imprime() {
        System.out.print(nome + "\n");
        System.out.print("Preço: " + preco + "\n");
    }
}
