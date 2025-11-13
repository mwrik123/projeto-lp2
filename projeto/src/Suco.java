public class Suco implements Produtos {
    private  double preco;
    private Sucos sabor;
    private String nome;

    Suco(int i) {
        setSabor(i);
        setPreco(i);
        setNome();
    }
    public void setSabor(int i){
        if(i == 1){
            sabor = Sucos.LARANJA_NATURAL;
        } else if(i == 2){
            sabor = Sucos.DELL_UVA;
        } else if(i == 3){
            sabor = Sucos.DELL_LARANJA;
        } else {
            System.out.print("erro em setSabor do suco, nao foi possivel identificar o sabor do suco");
        }
    }

    public void setNome() {
        this.nome = "Suco "+getSabor()+"\n";
    }

    public void setPreco(int i) {
        if(i == 1){
            this.preco = 5.00;
        } else if(i == 2||i == 3){
            this.preco = 4.50;
        } else {
            System.out.print("erro em setPreco, nao foi possivel identificar que suco era");
        }
    }

    public Sucos getSabor(){
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
