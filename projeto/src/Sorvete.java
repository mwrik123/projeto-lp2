public class Sorvete implements Produtos {

    private static double preco;
    private SorveteSabor sabor;

    Sorvete(int i) {
        setSabor(i);
        setPreco(3.50);
    }

    public static void setPreco(double preco) {
        Sorvete.preco = preco;
    }

    public void setSabor(int i) {
        if(i == 1){
            this.sabor = SorveteSabor.CHOCOLATE;
        } else if (i == 2){
            this.sabor = SorveteSabor.CREME;
        } else if(i == 3){
            this.sabor = SorveteSabor.MISTO;
        } else {
            System.out.print("erro no set de sabor do sorvete");
        }
    }

    public SorveteSabor getSabor(){
        return sabor;
    }

    @Override
    public void imprime() {
        exibirNome();
        System.out.print("Preço: " + getPreco() + "\n");

    }

    @Override
    public void exibirNome() {
        System.out.print("Sorvete "+getSabor()+"\n");
    }

    @Override
    public double getPreco() {
        return preco;
    }
}
