import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner sc = new Scanner(System.in);



        System.out.print("Adicione o carro\n");

        System.out.print("Marca: ");
        String marca = sc.next();

        System.out.print("Modelo: ");
        String modelo = sc.next();

        System.out.print("Ano de fabricação: ");
        int anoFabricacao = sc.nextInt();

        System.out.print("Velocidade inicial: ");
        int velocidadeInicial = sc.nextInt();

        Carro carro = new Carro(marca, modelo, anoFabricacao, velocidadeInicial);


        while(opcao != 3){
            System.out.print("1. Acelerar\n2. Frear\n3. Encerrar\n------------------\n");
            opcao = sc.nextInt();

            if(opcao == 1){
                System.out.print("Valor: ");
                int valor = sc.nextInt();
                carro.acelerar(valor);
                carro.exibirInfo();
            } else if(opcao == 2){
                System.out.print("Valor: ");
                int valor = sc.nextInt();
                carro.frear(valor);
                carro.exibirInfo();
            }
        }
    }
}