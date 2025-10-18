public class Carro {
    private final String marca;
    private final String modelo;
    private final int anoFabricacao;
    private int velocidadeAtual;

    public Carro(String marca, String modelo, int anoFabricacao, int velocidadeInicial){
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.velocidadeAtual = velocidadeInicial;
    }
    public void acelerar(int valor){
        if(valor >= 0){
            velocidadeAtual = velocidadeAtual+valor;
        }
    }
    public void frear(int valor){
        if(velocidadeAtual - valor < 0){
            velocidadeAtual = 0;
        } else {
            velocidadeAtual = velocidadeAtual - valor;
        }
    }
    public void exibirInfo(){
        System.out.print("Marca: "+marca+"\nModelo: "+modelo+"\nAno de fabricação: "+anoFabricacao+"\nVelocidade atual: "+velocidadeAtual+"\n--------------------------\n");
    }
}
