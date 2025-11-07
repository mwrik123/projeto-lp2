public class CrocParmegiana extends CrocSimples implements Produtos{

    CrocParmegiana(){
        super();
        ingredientesCrocs.add(IngredientesCroc.MOLHO_DE_TOMATE);
        ingredientesCrocs.add(IngredientesCroc.TOMATE);
        novoPreco(2);
    }

    @Override
    public void exibirNome() {
        System.out.print("Croc parmegiana\n");
    }
}
