public class HamburguerDuplo extends Hamburguer implements Produtos{

    HamburguerDuplo(int i){
        super();
        setIngredientesFouC(i);
        addIngrediente(Ingredientes.SALSICHA);
        addIngrediente(Ingredientes.HAMB2);
        setPreco(23.00);
        setNome("Hamburguer duplo\n");
    }

    @Override
    public void exibirNome() {
        System.out.print(getNome());
    }

    @Override
    public double getPreco() {
        return super.getPreco();
    }
}
