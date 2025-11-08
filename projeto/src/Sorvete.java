public class Sorvete implements Produtos {

    protected static double preco;
    protected SorveteSabor sabor;

    Sorvete(SorveteSabor sabor) {
        this.sabor = sabor;
        preco = 3.0;
    }

    @Override
    public void imprime() {

        System.out.print(sabor);
        System.out.print("Preço: " + preco + "\n");

    }

    @Override
    public void exibirNome() {
        System.out.print("Sorvete\nTipo: "+sabor+"\n");
    }

    @Override
    public double getValor() {
        return preco;
    }
}
