public class Sorvete implements Produtos {

    protected static double preco;
    protected String nome;
    protected String sabor;

    Sorvete(String saborSorvete) {
        sabor = saborSorvete;
        nome = "Sorvete de (" + sabor + ")";

        if (saborSorvete.equals("Chocolate") || saborSorvete.equals("Misto")) {
            preco = 2.00;
        } else if (saborSorvete.equals("Creme")) {
            preco = 1.50;
        } else {
            preco = 1.50;
        }
    }

    @Override
    public void imprime() {

        System.out.print(nome + "\n");
        System.out.print("Preço: " + preco + "\n");

    }
}
