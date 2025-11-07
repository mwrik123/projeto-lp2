public class BebidaRefrigeranteLata implements Produtos {
    protected static double preco;

    protected RefriSabores sabor;

    BebidaRefrigeranteLata(RefriSabores saborRefri) {
        sabor = saborRefri;
        preco = 9.00;
    }

    @Override
    public void imprime() {
        System.out.print(sabor);
        System.out.print("Preço: " + preco + "\n");
    }

    @Override
    public void exibirNome() {
        System.out.print("Refrigerante lata\nTipo:"+ sabor+"\n");
    }
}
