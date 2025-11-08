public class FileFrangoEmpanado implements Produtos {

    protected static double preco;
    protected String nome;

    FileFrangoEmpanado() {
        nome = "Filé de Frango Empanado";
        preco = 9.00;
    }

    @Override
    public void imprime() {
        System.out.print(nome + "\n");
        System.out.print("Preço: " + preco + "\n");
    }

    @Override
    public void exibirNome() {
        System.out.print(nome);
    }

    @Override
    public double getValor() {
        return preco;
    }
}
