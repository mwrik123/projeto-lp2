public class HamburguerDuplo extends Hamburguer implements Produtos{

    HamburguerDuplo(int opc){
        super(opc);
        //modifiquei i < 10 para i < 9
        for(int i = 8; i < 9; i++){
            ingredientes.add(Ingredientes.values()[i]);
        }
        novoPreco(2);
    }

    @Override
    public void exibirNome() {
        System.out.print("Hamburguer duplo\n");
    }

    @Override
    public double getValor() {
        return super.getValor();
    }
}
