import java.util.Scanner;

static int id = 0;
public class Main {
    public static void main(String[] args){
        while (true){
            System.out.print("===== Bem-vindo(a)! =====\n");
            System.out.print("[1] Cadastrar pedido\n[2] Entregar pedido\n[3] Pedidos pendentes\n[4] Verificar saldo do caixa\n[5] Feixar o caixa\n");
            Scanner sc = new Scanner(System.in);

            int opc = sc.nextInt();

            switch (opc){
                case 1:
                    id++;
                    System.out.print("Adicione produtos ao carrinho:\n");
                    while(true){
                        System.out.print("[1] Hamburguer (simples/ duplo/ triplo)\n[2] Croc (simples/ parmegiana/ americano)\n" +
                                "[3] X-salada\n[4] X-egg bacon burguer\n[5] Burguer americano\n[6]Box-combo\n" +
                                "[7] Sorvete (chocolate/ misto/ creme)\n[8] Porções (Batata/ Filé de frango empanado)\n[9] Bebida\n[10] Sair");
                        int opc2 = sc.nextInt();

                        switch (opc2){
                            case 1:
                                System.out.print("[1] Simples\n[2] Duplo\n[3] Triplo\n");
                                int opc3 = sc.nextInt();
                                switch (opc3){
                                    case 1:
                                        //lista ingredientes e chama função pra remover
                                        System.out.print("Deseja remover algum ingrediente?");
                                    case 2:
                                        //lista ingredientes e chama função pra remover
                                        System.out.print("Deseja remover algum ingrediente?");
                                    case 3:
                                        //lista ingredientes e chama função pra remover
                                        System.out.print("Deseja remover algum ingrediente?");
                                    default:
                                        //exception ou implementa while pra perguntar ate digitar o certo
                                }
                            case 2:
                                System.out.print("[1] Simples\n[2] Parmegiana\n[3] Americano\n");
                                opc3 = sc.nextInt();
                                switch (opc3){
                                    case 1:
                                        //lista ingredientes e chama função pra remover
                                        System.out.print("Deseja remover algum ingrediente?");
                                    case 2:
                                        //lista ingredientes e chama função pra remover
                                        System.out.print("Deseja remover algum ingrediente?");
                                    case 3:
                                        //lista ingredientes e chama função pra remover
                                        System.out.print("Deseja remover algum ingrediente?");
                                    default:
                                        //exception ou implementa while
                                }
                            case 3:
                                //lista ingredientes e chama função pra remover
                                System.out.print("Deseja remover algum ingrediente?");
                            case 4:
                                //lista ingredientes e chama função pra remover
                                System.out.print("Deseja remover algum ingrediente?");
                            case 5:
                                //lista ingredientes e chama função pra remover
                                System.out.print("Deseja remover algum ingrediente?");
                            case 6:
                                //implementa montagem do combo a partir do que da pra colocar
                            case 7:
                                System.out.print("[1] Chocolate\n[2] Misto\n[3] Creme\n");
                                opc3 = sc.nextInt();

                                switch (opc3){
                                    case 1:
                                        //sorvete de chocolate
                                    case 2:
                                        //sorvete misto
                                    case 3:
                                        //sorvete de creme
                                    default:
                                        //exceptio ou while
                                }
                            case 8:
                                System.out.print("[1] Batata frita\n[2] Filés de frango empanado\n");
                                opc3 = sc.nextInt();

                                switch (opc3){
                                    case 1:
                                        //batata
                                    case 2:
                                        //filé
                                    default:
                                        //exception ou while
                                }
                            case 9:
                                System.out.print("[1] Refrigerante (refil/lata)\n[2] Sucos (laranja/ Dell vale)\n[3] Chá gelado\n[4] Água saborizada\n[5] Água\n");
                                opc3 = sc.nextInt();

                                switch (opc3){
                                    case 1:
                                        System.out.print("[1] Refil\n[2] Lata\n");
                                        int opc4 = sc.nextInt();

                                        switch (opc4){
                                            case 1:
                                                //refil
                                            case 2:
                                                System.out.print("[1] Guaraná\n[2] Coca cola\n[3] Fanta uva\n");
                                                int opc5 = sc.nextInt();

                                                switch (opc5){
                                                    case 1:
                                                        //lata de guarana
                                                    case 2:
                                                        //lata de coca
                                                    case 3:
                                                        //lata de fanta
                                                    default:
                                                        //exception ou while
                                                }
                                            default:
                                                //exception ou while
                                        }
                                    case 2:
                                        System.out.print("[1] Suco de laranja natural\n[2] Dell vale (uva/ laranja)\n");
                                        opc4 = sc.nextInt();

                                        switch (opc4){
                                            case 1:
                                                //suco de laranja
                                            case 2:
                                                System.out.print("[1] Uva\n[2] Laranja\n");
                                                int opc5 = sc.nextInt();

                                                switch (opc5){
                                                    case 1:
                                                        //dell uva
                                                    case 2:
                                                        //dell laranja
                                                    default:
                                                        //exception ou while
                                                }
                                            default:
                                                //exception ou while
                                        }
                                    case 3:
                                        //cha gelado
                                    case 4:
                                        //agua saborizada
                                    case 5:
                                        //agua
                                    default:
                                        //exception ou while
                                }
                            case 10:
                                //add arrays de produtos ao pedido e fecha o carrinho
                            default:
                                //exception ou while
                        }
                    }
                case 2:
                    //remove pedido da lista de pedidos pendentes e add saldo ao caixa
                case 3:
                    //exibe tabela com pedidos pendentes
                case 4:
                    //exibe saldo do caixa
                case 5:
                    //fecha caixa
                default:
                    //exception ou while
            }
        }
    }
}

