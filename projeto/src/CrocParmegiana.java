public class CrocParmegiana extends CrocSimples implements Produtos{

    CrocParmegiana(){
        super(2);
        setIngredientesCrocs(2);

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
