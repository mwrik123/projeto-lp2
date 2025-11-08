public class Agua implements Produtos {
    protected static double preco;
    protected Aguas agua;

    Agua(Aguas agua, int i) {
        this.agua = agua;
        if(i == 1){
            preco = 5.00;
        } else if(i == 2){
            preco = 6.00;
        } else {
            preco = 9.00;
        }
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

    @Override
    public double getValor() {
        return preco;
    }
}
