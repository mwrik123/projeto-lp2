public class FileFrangoEmpanado implements Produtos {

    private static double preco;
    private String nome;

    FileFrangoEmpanado() {
        nome = "Filé de Frango Empanado\n";
        preco = 9.00;
    }

    public String getNome(){
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
