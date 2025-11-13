public class CrocAmericano extends CrocSimples implements Produtos{
    CrocAmericano(){
        super(3);
        setIngredientesCrocs(3);
    }

    @Override
    public void exibirNome() {
        System.out.print(super.getNome());
    }

    @Override
    public double getPreco() {
        return super.getPreco();
    }
}
