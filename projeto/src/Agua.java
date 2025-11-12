public class Agua implements Produtos {
    private double preco;
    private Aguas agua;
    private String nome;

    Agua(int i) {
        setAgua(i);
        if(i == 1){
            setPreco(2.00);
        } else if(i == 2){
            setPreco(3.00);
        } else if (i == 3){
            setPreco(5.00);
        } else {
            System.out.print("erro no set preco");
        }
        setNome();

    }

    public void setAgua(int i) {
        if(i == 1){
            agua = Aguas.MINERAL;
        } else if (i == 2){
            agua = Aguas.COM_GAS;
        } else if(i == 3){
            agua = Aguas.SABORIZADA_LIMAO;
        } else {
            System.out.print("erro no tipo da agua");
        }
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setNome() {
        this.nome = "Água " + getAgua() +"\n";
    }

    public String getNome() {
        return nome;
    }

    public Aguas getAgua() {
        return agua;
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
