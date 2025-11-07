
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Main {
    public static void main(String[] args){
        int id = 0;
        while (true){
            System.out.print("===== Bem-vindo(a)! =====\n");
            System.out.print("[1] Cadastrar pedido\n[2] Entregar pedido\n[3] Pedidos pendentes\n[4] Verificar saldo do caixa\n[5] Feixar o caixa\n");
            Scanner sc = new Scanner(System.in);

            while(true){
                try{
                    int opc = sc.nextInt();

                    if(opc < 1 || opc > 5){
                        System.out.print("Opção inválida\n");
                        continue;
                    }
                    break;
                } catch (InputMismatchException e){
                    System.out.print("Inserção inválida\n");
                }
            }

            int opc = sc.nextInt();
            int opc2 = 0;
            int opc3 = 0;
            int opc4 = 0;

            switch (opc){
                case 1:
                    ArrayList <Produtos> produtosPedidoAtual = new ArrayList<>();
                    id++;
                    System.out.print("Nome do pedido:\n");
                    String nome = sc.next();

                    System.out.print("Adicione produtos ao carrinho:\n");
                    while(true){
                        System.out.print("[1] Hamburguer (simples/ duplo/ triplo)\n[2] Croc (simples/ parmegiana/ americano)\n" +
                                "[3] X-salada\n[4] X-egg bacon burguer\n[5] Burguer americano(simples/ duplo/ triplo)\n[6]Box-combo\n" +
                                "[7] Sorvete (chocolate/ misto/ creme)\n[8] Porções (Batata/ Filé de frango empanado)\n[9] Bebida\n[10] Sair");

                        while (true){
                            try{
                                opc2 = sc.nextInt();
                                if(opc2 < 1 || opc2 > 10){
                                    System.out.print("Opção inválida\n");
                                    continue;
                                }
                                break;
                            } catch (InputMismatchException e){
                                System.out.print("Inserção inválida\n");
                            }
                        }

                        switch (opc2){
                            case 1://hamburguer
                                System.out.print("[1] Simples\n[2] Duplo\n[3] Triplo\n");

                                while(true){
                                    try{
                                        opc3 = sc.nextInt();

                                        if(opc3 < 1 || opc3 > 3){
                                            System.out.print("Opção inválida\n");
                                            continue;
                                        }
                                        break;
                                    } catch (InputMismatchException e){
                                        System.out.print("Inserção inválida\n");
                                    }
                                }

                                simpDuplTrip(produtosPedidoAtual, opc3);
                                        
                            case 2://Croc

                                System.out.print("[1] Simples\n[2] Parmegiana\n[3] Americano\n");

                                while(true){
                                    try{
                                        opc3 = sc.nextInt();

                                        if(opc3 < 1 || opc3 > 3){
                                            System.out.print("Opção inválida\n");
                                            continue;
                                        }
                                        break;
                                    } catch (InputMismatchException e){
                                        System.out.print("Inserção inválida\n");
                                    }
                                }

                                simpParmAmer(produtosPedidoAtual, opc3);
                            case 3: //X-Salada
                                montaXsalada(produtosPedidoAtual);
                            case 4://X-egg bacon burguer
                                montaXegg(produtosPedidoAtual);
                            case 5://Burguer Americano

                                System.out.print("[1] Simples\n[2] Duplo\n[3] Triplo\n");

                                while(true){
                                    try{
                                        opc3 = sc.nextInt();

                                        if(opc3 < 1 || opc3 > 3){
                                            System.out.print("Opção inválida\n");
                                            continue;
                                        }
                                        break;
                                    } catch (InputMismatchException e){
                                        System.out.print("Inserção inválida\n");
                                        sc.next();
                                    }
                                }

                                burSimpDuplTrip(produtosPedidoAtual, opc3);
                            case 6:
                                //Box Combo
                                ArrayList<Produtos> box = new ArrayList<>();
                                
                                System.out.print("Hamburguer 1:\n[1] Hamburguer (simples/ duplo/ triplo)\n[2] Croc (simples/ parmegiana/ americano)\n"
                                                +"\n[3] X-salada\n[4] X-egg bacon burguer\n[5] Burguer americano (simples/ duplo/ triplo)\n[6] Vazio\n");

                                while (true) {
                                    try {
                                        opc3 = sc.nextInt();
                                        if (opc3 < 1 || opc3 > 6) {
                                            System.out.print("Opção inválida\n");
                                            continue;
                                        }
                                        break;
                                    } catch (InputMismatchException e) {
                                        System.out.print("Inserção inválida\n");
                                        sc.next();
                                    }
                                }
                                
                                if(opc3 == 1){
                                    System.out.print("[1] Simples\n[2] Duplo\n[3] Triplo\n");
                                    
                                    while (true) {
                                        try {
                                            opc4 = sc.nextInt();
                                            if (opc4 < 1 || opc4 > 3) {
                                                System.out.print("Opção inválida\n");
                                                continue;
                                            }
                                            break;
                                        } catch (InputMismatchException e) {
                                            System.out.print("Inserção inválida\n");
                                            sc.next();
                                        }
                                    }
                                    
                                    simpDuplTrip(box, opc4);
                                } else if(opc3 == 2) {
                                    System.out.print("[1] Simples\n[2] Parmegiana\n[3] Americano\n");

                                    while (true) {
                                        try {
                                            opc4 = sc.nextInt();
                                            if (opc4 < 1 || opc4 > 3) {
                                                System.out.print("Opção inválida\n");
                                                continue;
                                            }
                                            break;
                                        } catch (InputMismatchException e) {
                                            System.out.print("Inserção inválida\n");
                                            sc.next();
                                        }
                                    }

                                    simpParmAmer(box, opc4);
                                } else if(opc3 == 3){
                                    montaXsalada(box);
                                } else if (opc3 == 4){
                                    montaXegg(box);
                                } else if (opc3 == 5){
                                    System.out.print("[1] Simples\n[2] Duplo\n[3] Triplo\n");

                                    while (true) {
                                        try {
                                            opc4 = sc.nextInt();
                                            if (opc4 < 1 || opc4 > 3) {
                                                System.out.print("Opção inválida\n");
                                                continue;
                                            }
                                            break;
                                        } catch (InputMismatchException e) {
                                            System.out.print("Inserção inválida\n");
                                            sc.next();
                                        }
                                    }

                                    burSimpDuplTrip(box, opc4);
                                } else {
                                   System.out.print("Sem hamburguer 1\n");
                                }
                                //hamburguer 2
                                System.out.print("Hamburguer 2:\n[1] Hamburguer (simples/ duplo/ triplo)\n[2] Croc (simples/ parmegiana/ americano)\n"
                                        +"\n[3] X-salada\n[4] X-egg bacon burguer\n[5] Burguer americano (simples/ duplo/ triplo)\n[6] Vazio\n");

                                while (true) {
                                    try {
                                        opc3 = sc.nextInt();
                                        if (opc3 < 1 || opc3 > 6) {
                                            System.out.print("Opção inválida\n");
                                            continue;
                                        }
                                        break;
                                    } catch (InputMismatchException e) {
                                        System.out.print("Inserção inválida\n");
                                        sc.next();
                                    }
                                }

                                if(opc3 == 1){
                                    System.out.print("[1] Simples\n[2] Duplo\n[3] Triplo\n");

                                    while (true) {
                                        try {
                                            opc4 = sc.nextInt();
                                            if (opc4 < 1 || opc4 > 3) {
                                                System.out.print("Opção inválida\n");
                                                continue;
                                            }
                                            break;
                                        } catch (InputMismatchException e) {
                                            System.out.print("Inserção inválida\n");
                                            sc.next();
                                        }
                                    }

                                    simpDuplTrip(box, opc4);
                                } else if(opc3 == 2) {
                                    System.out.print("[1] Simples\n[2] Parmegiana\n[3] Americano\n");

                                    while (true) {
                                        try {
                                            opc4 = sc.nextInt();
                                            if (opc4 < 1 || opc4 > 3) {
                                                System.out.print("Opção inválida\n");
                                                continue;
                                            }
                                            break;
                                        } catch (InputMismatchException e) {
                                            System.out.print("Inserção inválida\n");
                                            sc.next();
                                        }
                                    }

                                    simpParmAmer(box, opc4);
                                } else if(opc3 == 3){
                                    montaXsalada(box);
                                } else if (opc3 == 4){
                                    montaXegg(box);
                                } else if (opc3 == 5){
                                    System.out.print("[1] Simples\n[2] Duplo\n[3] Triplo\n");

                                    while (true) {
                                        try {
                                            opc4 = sc.nextInt();
                                            if (opc4 < 1 || opc4 > 3) {
                                                System.out.print("Opção inválida\n");
                                                continue;
                                            }
                                            break;
                                        } catch (InputMismatchException e) {
                                            System.out.print("Inserção inválida\n");
                                            sc.next();
                                        }
                                    }

                                    burSimpDuplTrip(box, opc4);
                                } else {
                                    System.out.print("Sem hamburguer 2\n");
                                }

                                //bebida 1
                                System.out.print("[1] Refrigerante (refil/lata)\n[2] Sucos (laranja/dell vale)\n[3] Chá gelado\n[4] Água (mineral/ com gás/ saborizada)\n[5] Vazio\n");

                                while (true) {
                                    try {
                                        opc3 = sc.nextInt();
                                        if (opc3 < 1 || opc3 > 5) {
                                            System.out.print("Opção inválida\n");
                                            continue;
                                        }
                                        break;
                                    } catch (InputMismatchException e) {
                                        System.out.print("Inserção inválida\n");
                                        sc.next();
                                    }
                                }

                                if(opc3 == 5){
                                    System.out.print("Sem bebida 1\n");
                                } else {
                                    bebidaOpc(box, opc3);
                                }

                                //bebida 2

                                System.out.print("[1] Refrigerante (refil/lata)\n[2] Sucos (laranja/dell vale)\n[3] Chá gelado\n[4] Água (mineral/ com gás/ saborizada)\n[5] Vazio\n");

                                while (true) {
                                    try {
                                        opc3 = sc.nextInt();
                                        if (opc3 < 1 || opc3 > 5) {
                                            System.out.print("Opção inválida\n");
                                            continue;
                                        }
                                        break;
                                    } catch (InputMismatchException e) {
                                        System.out.print("Inserção inválida\n");
                                        sc.next();
                                    }
                                }

                                if(opc3 == 5){
                                    System.out.print("Sem bebida 2\n");
                                } else {
                                    bebidaOpc(box, opc3);
                                }

                                //sorvete
                                System.out.print("Adicionar sorvete?\n[1] Sim\n[2] Não\n");

                                while (true) {
                                    try {
                                        opc3 = sc.nextInt();
                                        if (opc3 < 1 || opc3 > 2) {
                                            System.out.print("Opção inválida\n");
                                            continue;
                                        }
                                        break;
                                    } catch (InputMismatchException e) {
                                        System.out.print("Inserção inválida\n");
                                        sc.next();
                                    }
                                }

                                if(opc3 == 1){
                                    montaSorvete(box);
                                } else {
                                    System.out.print("Sem sorvete\n");
                                }

                                //porcoes
                                System.out.print("[1] Batata Frita\n[2] Filé de frango empanado\n[3] Vazio\n");

                                while (true) {
                                    try {
                                        opc3 = sc.nextInt();
                                        if (opc3 < 1 || opc3 > 3) {
                                            System.out.print("Opção inválida\n");
                                            continue;
                                        }
                                        break;
                                    } catch (InputMismatchException e) {
                                        System.out.print("Inserção inválida\n");
                                        sc.next();
                                    }
                                }

                                if(opc3 == 3){
                                    System.out.print("Sem porçoes\n");
                                } else {
                                    batataFile(box, opc3);
                                }

                                //se lista de produtos estiver vazia, lançar execption e cancelar o box no pedido
                                //se nao:
                                Box boxtotal = new Box(box);
                                produtosPedidoAtual.add(boxtotal);
                                //implementa montagem do combo a partir do que da pra colocar
                            case 7://Sorvete
                                montaSorvete(produtosPedidoAtual);
                            case 8://batata frita
                                System.out.print("[1] Batata frita\n[2] Filé de frango empanado\n");

                                while (true) {
                                    try {
                                        opc3 = sc.nextInt();

                                        if (opc3 < 1 || opc3 > 2) {
                                            System.out.print("Opção inválida\n");
                                            continue;
                                        }
                                        break;
                                    } catch (InputMismatchException e) {
                                        System.out.print("Inserção inválida\n");
                                    }
                                }

                                batataFile(produtosPedidoAtual, opc3);
                            case 9://bebidas
                                    while (true){
                                        System.out.print("[1] Refrigerante (refil/lata)\n[2] Sucos (laranja/dell vale)\n[3] Chá gelado\n[4] Água(mineral/ com gás/ saborizada)\n[5] Pronto");

                                        while (true) {
                                            try {
                                                opc3 = sc.nextInt();

                                                if (opc3 < 1 || opc3 > 5) {
                                                    System.out.print("Opção inválida\n");
                                                    continue;
                                                }
                                                break;
                                            } catch (InputMismatchException e) {
                                                System.out.print("Inserção inválida\n");
                                            }
                                        }

                                        if(opc3 == 5){
                                            break;
                                        } else {
                                            bebidaOpc(produtosPedidoAtual, opc3);
                                        }
                                    }
                            case 10://Sair
                                break;
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
    static void montaHambSimp(ArrayList<Produtos> produtos, int i){
        Scanner sc = new Scanner(System.in);
        int opc, opc1;

        if (i == 1) {//hamburguer simples de frango
            Hamburguer hamburguer = new Hamburguer(i);

            System.out.print("Deseja remover algum ingrediente?[1] Sim, [2] Concluir\n");

            while (true) {
                try {
                    opc = sc.nextInt();

                    if (opc < 1 || opc > 2) {
                        System.out.print("Opção inválida\n");
                        continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.print("Inserção inválida\n");
                }
            }

            if (opc == 1) {
                while (true) {
                    System.out.print("Qual ingrediente deseja remover?\n[1] Hamburguer\n[2] Pão\n[3] Salada\n[4] Molho\n[5] Ovo\n[6] Queijo\n[7] Frango\n[8] Pronto\n");

                    while (true) {
                        try {
                            opc1 = sc.nextInt();

                            if (opc1 < 1 || opc1 > 8) {
                                System.out.print("Opção inválida\n");
                                continue;
                            }
                            break;
                        } catch (InputMismatchException e) {
                            System.out.print("Inserção inválida\n");
                        }
                    }

                    if (opc1 == 8) {
                        break;
                    } else if (opc1 == 7) {
                        hamburguer.remove(Ingredientes.values()[opc1]);
                    } else {
                        hamburguer.remove(Ingredientes.values()[opc1 - 1]);
                    }
                }
            }

            produtos.add(hamburguer);
        }

        if (i == 2) {//hamburguer simples de carne
            Hamburguer hamburguer = new Hamburguer(i);

            System.out.print("Deseja remover algum ingrediente?[1] Sim, [2] Concluir\n");

            while (true) {
                try {
                    opc = sc.nextInt();

                    if (opc < 1 || opc > 2) {
                        System.out.print("Opção inválida\n");
                        continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.print("Inserção inválida\n");
                }
            }

            if (opc == 1) {
                while (true) {
                    System.out.print("Qual ingrediente deseja remover?\n[1] Hamburguer\n" +
                            "[2] Pão\n[3] Salada\n[4] Molho\n[5] Ovo\n[6] Queijo\n [7] Carne\n[8] Pronto\n");

                    while (true) {
                        try {
                            opc1 = sc.nextInt();

                            if (opc1 < 1 || opc1 > 8) {
                                System.out.print("Opção inválida\n");
                                continue;
                            }
                            break;
                        } catch (InputMismatchException e) {
                            System.out.print("Inserção inválida\n");
                        }
                    }

                    if (opc1 == 8) {
                        break;
                    } else {
                        hamburguer.remove(Ingredientes.values()[opc1 - 1]);
                    }
                }
            }

            produtos.add(hamburguer);
        }
    }
    static void montaHambDupl(ArrayList<Produtos> produtos, int i){
        Scanner sc = new Scanner(System.in);
        int opc, opc1;

        if (i == 1) {//hamburguer duplo de frango
            HamburguerDuplo hamburguerDuplo = new HamburguerDuplo(i);

            System.out.print("Deseja remover algum ingrediente?[1] Sim, [2] Não\n");

            while (true) {
                try {
                    opc = sc.nextInt();

                    if (opc < 1 || opc > 2) {
                        System.out.print("Opção inválida\n");
                        continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.print("Inserção inválida\n");
                }
            }

            if (opc == 1) {


                while (true) {
                    System.out.print("Qual ingrediente deseja remover?\n[1] Hamburguer 1\n" +
                            "[2] Pão\n[3] Salada\n[4] Molho\n[5] Ovo\n[6] Queijo\n[7] Frango\n[8] Salsicha\n[9] Hamburguer 2\n[10] Pronto\n");

                    while (true) {
                        try {
                            opc1 = sc.nextInt();

                            if (opc1 < 1 || opc1 > 10) {
                                System.out.print("Opção inválida\n");
                                continue;
                            }
                            break;
                        } catch (InputMismatchException e) {
                            System.out.print("Inserção inválida\n");
                        }
                    }

                    if (opc1 == 10) {
                        break;
                    } else if (opc1 == 7 || opc1 == 8 || opc1 == 9) {
                        hamburguerDuplo.remove(Ingredientes.values()[opc1]);
                    } else {
                        hamburguerDuplo.remove(Ingredientes.values()[opc1 - 1]);
                    }
                }

            }
            produtos.add(hamburguerDuplo);
        }

        if (i == 2) {//hamburguer duplo de carne
            HamburguerDuplo hamburguerDuplo = new HamburguerDuplo(i);

            System.out.print("Deseja remover algum ingrediente?[1] Sim, [2] Não\n");

            while (true) {
                try {
                    opc = sc.nextInt();

                    if (opc < 1 || opc > 2) {
                        System.out.print("Opção inválida\n");
                        continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.print("Inserção inválida\n");
                }
            }

            if (opc == 1) {


                while (true) {
                    System.out.print("Qual ingrediente deseja remover?\n[1] Hamburguer 1\n" +
                            "[2] Pão\n[3] Salada\n[4] Molho\n[5] Ovo\n[6] Queijo\n[7] Carne\n[8] Salsicha\n[9] Hamburguer 2\n[10] Pronto\n");

                    while (true) {
                        try {
                            opc1 = sc.nextInt();

                            if (opc1 < 1 || opc1 > 10) {
                                System.out.print("Opção inválida\n");
                                continue;
                            }
                            break;
                        } catch (InputMismatchException e) {
                            System.out.print("Inserção inválida\n");
                        }
                    }

                    if (opc1 == 10) {
                        break;
                    } else if (opc1 == 8 || opc1 == 9) {
                        hamburguerDuplo.remove(Ingredientes.values()[opc1]);
                    } else {
                        hamburguerDuplo.remove(Ingredientes.values()[opc1 - 1]);
                    }
                }

            }
            produtos.add(hamburguerDuplo);
        }
    }
    static void montaHambTrip(ArrayList<Produtos> produtos){
        int opc, opc1;
        Scanner sc = new Scanner(System.in);

        HamburguerTriplo hamburguerTriplo = new HamburguerTriplo();

        System.out.print("Deseja remover algum ingrediente?[1] Sim, [2] Não\n");

        while (true) {
            try {
                opc = sc.nextInt();

                if (opc < 1 || opc > 2) {
                    System.out.print("Opção inválida\n");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.print("Inserção inválida\n");
            }
        }

        if (opc == 1) {

            while (true) {
                System.out.print("Qual ingrediente deseja remover?\n[1] Hamburguer 1\n" +
                        "[2] Pão\n[3] Salada\n[4] Molho\n[5] Ovo\n[6] Queijo\n[7] Carne\n[8] Frango\n" +
                        "[9] Salsicha\n[10] Hamburguer 2\n [11] Hamburguer 3\n[12] Salada 2\n [13] Pronto\n");

                while (true) {
                    try {
                        opc1 = sc.nextInt();

                        if (opc1 < 1 || opc1 > 13) {
                            System.out.print("Opção inválida\n");
                            continue;
                        }
                        break;
                    } catch (InputMismatchException e) {
                        System.out.print("Inserção inválida\n");
                    }
                }

                if (opc1 == 13) {
                    break;
                } else {
                    hamburguerTriplo.remove(Ingredientes.values()[opc1 - 1]);
                }
            }
        }
        produtos.add(hamburguerTriplo);
    }

    static void montaCrocSimp(ArrayList<Produtos> produtos){
        int opc, opc1;
        Scanner sc = new Scanner(System.in);

        CrocSimples croc = new CrocSimples();

        //lista ingredientes e chama função pra remover
        System.out.print("Deseja remover algum ingrediente?[1] Sim, [2] Não\n");

        while (true) {
            try {
                opc = sc.nextInt();

                if (opc < 1 || opc > 2) {
                    System.out.print("Opção inválida\n");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.print("Inserção inválida\n");
            }
        }

        if (opc == 1) {


            while (true) {
                System.out.print("Qual ingrediente deseja remover?\n[1] Pão\n[2]Frango Empanado\n" +
                        "[3] Salada\n[4] Maionese\n[5] Queijo\n[6] Pronto\n");

                while (true) {
                    try {
                        opc1 = sc.nextInt();

                        if (opc1 < 1 || opc1 > 6) {
                            System.out.print("Opção inválida\n");
                            continue;
                        }
                        break;
                    } catch (InputMismatchException e) {
                        System.out.print("Inserção inválida\n");
                    }
                }

                if (opc1 == 6) {
                    break;
                } else {
                    croc.remove(IngredientesCroc.values()[opc1 - 1]);
                }
            }

        }
        produtos.add(croc);
    }
    static void montaCrocParm(ArrayList<Produtos> produtos){
        int opc, opc1;
        Scanner sc = new Scanner(System.in);

        CrocParmegiana parmegiana = new CrocParmegiana();

        //lista ingredientes e chama função pra remover
        System.out.print("Deseja remover algum ingrediente?[1] Sim, [2] Não\n");

        while (true) {
            try {
                opc = sc.nextInt();

                if (opc < 1 || opc > 2) {
                    System.out.print("Opção inválida\n");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.print("Inserção inválida\n");
            }
        }

        if (opc == 1) {


            while (true) {
                System.out.print("Qual ingrediente deseja remover?\n[1] Pão\n" +
                        "[2] Frango empanado\n[3] Salada\n[4] Maionese\n[5] Queijo\n[6] Molho de tomate\n[7] Tomate (adicional)\n[8] Pronto");

                while (true) {
                    try {
                        opc1 = sc.nextInt();

                        if (opc1 < 1 || opc1 > 8) {
                            System.out.print("Opção inválida\n");
                            continue;
                        }
                        break;
                    } catch (InputMismatchException e) {
                        System.out.print("Inserção inválida\n");
                    }
                }

                if (opc1 == 7) {
                    break;
                } else {
                    parmegiana.remove(IngredientesCroc.values()[opc1 - 1]);
                }
            }

        }
        produtos.add(parmegiana);
    }
    static void montaCrocAmer(ArrayList<Produtos> produtos){
        int opc, opc1;
        Scanner sc = new Scanner(System.in);

        CrocAmericano americano = new CrocAmericano();

        //lista ingredientes e chama função pra remover
        System.out.print("Deseja remover algum ingrediente?[1] Sim, [2] Não\n");

        while (true) {
            try {
                opc = sc.nextInt();

                if (opc < 1 || opc > 2) {
                    System.out.print("Opção inválida\n");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.print("Inserção inválida\n");
            }
        }

        if (opc == 1) {


            while (true) {
                System.out.print("Qual ingrediente deseja remover?\n[1] Pão\n[2] Frango Empanado\n" +
                        "[3] Salada\n[4] Maionese\n[5] Queijo\n[6] Salada americana\n[7] Cebola\n[8] Molho defumado\n[9] Pronto\n");

                while (true) {
                    try {
                        opc1 = sc.nextInt();

                        if (opc1 < 1 || opc1 > 9) {
                            System.out.print("Opção inválida\n");
                            continue;
                        }
                        break;
                    } catch (InputMismatchException e) {
                        System.out.print("Inserção inválida\n");
                    }
                }

                if (opc1 == 9) {
                    break;
                } else if (opc1 == 6 || opc1 == 7 || opc1 == 8) {
                    americano.remove(IngredientesCroc.values()[opc1 + 1]);
                } else {
                    americano.remove(IngredientesCroc.values()[opc1 - 1]);
                }
            }

        }
        produtos.add(americano);
    }

    static void montaXsalada(ArrayList<Produtos> produtos){
        int opc, opc1;
        Scanner sc = new Scanner(System.in);

        xSalada Xsalada = new xSalada();

        System.out.print("Deseja remover algum ingrediente?[1] Sim, [2] Não\n");

        while (true) {
            try {
                opc = sc.nextInt();

                if (opc < 1 || opc > 2) {
                    System.out.print("Opção inválida\n");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.print("Inserção inválida\n");
                sc.next();
            }
        }

        if (opc == 1) {

            while (true) {

                System.out.print("Qual ingrediente deseja remover?\n");
                System.out.print("[1] Pão\n[2] Hamburguer\n[3] Queijo Mussarela\n[4] Tomate\n[5] Maionese\n[6] Alface\n [7] Pronto\n");

                while (true) {
                    try {
                        opc1 = sc.nextInt();

                        if (opc1 < 1 || opc1 > 7) {
                            System.out.print("Opção inválida\n");
                            continue;
                        }
                        break;
                    } catch (InputMismatchException e) {
                        System.out.print("Inserção inválida\n");
                        sc.next();
                    }
                }

                if (opc1 == 7) {
                    break;
                } else {
                    Xsalada.remove(IngredientesXSalada.values()[opc1 - 1]);
                    System.out.print("Ingrediente removido.\n");
                }
            }
        }

        produtos.add(Xsalada);
        System.out.print("X-Salada adicionado ao pedido.\n");
    }

    static void montaXegg(ArrayList<Produtos> produtos){
        int opc, opc1;
        Scanner sc = new Scanner(System.in);

        XeggBaconBurguer x_egg = new XeggBaconBurguer();

        //lista ingredientes e chama função pra remover
        System.out.print("Deseja remover algum ingrediente?[1] Sim, [2] Não\n");

        while (true) {
            try {
                opc = sc.nextInt();

                if (opc < 1 || opc > 2) {
                    System.out.print("Opção inválida\n");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.print("Inserção inválida\n");
            }
        }

        if (opc == 1) {
            while (true) {
                System.out.print("Qual ingrediente deseja remover?\n[1] Hamburguer\n" +
                        "[2] Cheddar\n[3] Ovo\n[4] Bacon\n[5] Maionese\n[6] Pão\n[7] Pronto");

                while (true) {
                    try {
                        opc1 = sc.nextInt();

                        if (opc1 < 1 || opc1 > 7) {
                            System.out.print("Opção inválida\n");
                            continue;
                        }
                        break;
                    } catch (InputMismatchException e) {
                        System.out.print("Inserção inválida\n");
                    }
                }

                if (opc1 == 7) {
                    break;
                } else {
                    x_egg.remove(IngredientesXBB.values()[opc1 - 1]);
                }
            }

        }
        produtos.add(x_egg);
    }

    static void montaAmerSimp(ArrayList<Produtos> produtos){
        int opc, opc1;
        Scanner sc = new Scanner(System.in);

        BurguerAmericano americanoSimples = new BurguerAmericano();

        System.out.print("Deseja remover algum ingrediente?[1] Sim, [2] Não\n");

        while (true) {
            try {
                opc = sc.nextInt();
                if (opc < 1 || opc > 2) {
                    System.out.print("Opção inválida\n");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.print("Inserção inválida\n");
                sc.next();
            }
        }

        if (opc == 1) {
            while (true) {
                System.out.print("Qual ingrediente deseja remover?\n[1] Pão\n[2] Hamburguer\n" +
                        "[3] Salada Americana\n[4] Cebola Picada\n[5] Molho Defumado\n[6] Maionese\n[7] Pronto\n");

                while (true) {
                    try {
                        opc1 = sc.nextInt();
                        if (opc1 < 1 || opc1 > 7) {
                            System.out.print("Opção inválida\n");
                            continue;
                        }
                        break;
                    } catch (InputMismatchException e) {
                        System.out.print("Inserção inválida\n");
                        sc.next();
                    }
                }

                if (opc1 == 7) {
                    break;
                } else {
                    americanoSimples.remove(IngredientesBurguerAmericano.values()[opc1 - 1]);
                    System.out.print("Ingrediente removido.\n");
                }
            }
        }
        produtos.add(americanoSimples);
        System.out.print("Burguer Americano Simples adicionado.\n");
    }
    static void montaAmerDupl(ArrayList<Produtos> produtos){
        int opc, opc1;
        Scanner sc = new Scanner(System.in);

        BurguerAmericanoDuplo americanoDuplo = new BurguerAmericanoDuplo();

        System.out.print("Deseja remover algum ingrediente?[1] Sim, [2] Não\n");

        while (true) {
            try {
                opc = sc.nextInt();
                if (opc < 1 || opc > 2) {
                    System.out.print("Opção inválida\n");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.print("Inserção inválida\n");
                sc.next();
            }
        }

        if (opc == 1) {
            while (true) {

                System.out.print("Qual ingrediente deseja remover?\n[1] Pão\n[2] Hamburguer\n" +
                        "[3] Salada Americana\n[4] Cebola Picada\n[5] Molho Defumado\n[6] Maionese\n[7] Hamburguer 2\n[8] Pronto\n");

                while (true) {
                    try {
                        opc1 = sc.nextInt();
                        if (opc1 < 1 || opc1 > 8) {
                            System.out.print("Opção inválida\n");
                            continue;
                        }
                        break;
                    } catch (InputMismatchException e) {
                        System.out.print("Inserção inválida\n");
                        sc.next();
                    }
                }

                if (opc1 == 8) {
                    break;
                } else {

                    americanoDuplo.remove(IngredientesBurguerAmericano.values()[opc1 - 1]);
                    System.out.print("Ingrediente removido.\n");
                }
            }
        }
        produtos.add(americanoDuplo);
        System.out.print("Burguer Americano Duplo adicionado.\n");
    }
    static void montaAmerTrip(ArrayList<Produtos> produtos){
        int opc, opc1;
        Scanner sc = new Scanner(System.in);

        BurguerAmericanoTriplo americanoTriplo = new BurguerAmericanoTriplo();

        System.out.print("Deseja remover algum ingrediente?[1] Sim, [2] Não\n");

        while (true) {
            try {
                opc = sc.nextInt();
                if (opc < 1 || opc > 2) {
                    System.out.print("Opção inválida\n");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.print("Inserção inválida\n");
                sc.next();
            }
        }

        if (opc == 1) {
            while (true) {

                System.out.print("Qual ingrediente deseja remover?\n[1] Pão\n[2] Hamburguer\n" +
                        "[3] Salada Americana\n[4] Cebola Picada\n[5] Molho Defumado\n[6] Maionese\n" +
                        "[7] Hamburguer 2\n[8] Hamburguer 3\n[9] Pronto\n");

                while (true) {
                    try {
                        opc1 = sc.nextInt();
                        if (opc1 < 1 || opc1 > 9) {
                            System.out.print("Opção inválida\n");
                            continue;
                        }
                        break;
                    } catch (InputMismatchException e) {
                        System.out.print("Inserção inválida\n");
                        sc.next();
                    }
                }

                if (opc1 == 9) {
                    break;
                } else {
                    americanoTriplo.remove(IngredientesBurguerAmericano.values()[opc1 - 1]);
                    System.out.print("Ingrediente removido.\n");
                }
            }
        }
        produtos.add(americanoTriplo);
        System.out.print("Burguer Americano Triplo adicionado.\n");
    }

    static void montaSorvete(ArrayList<Produtos> produtos){
        int opc;
        Scanner sc = new Scanner(System.in);

        System.out.print("[1] Chocolate\n[2] Creme\n[3] Misto\n");

        // validando
        while (true) {
            try {
                opc = sc.nextInt();

                if (opc < 1 || opc > 3) {
                    System.out.print("Opção inválida\n");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.print("Inserção inválida\n");
            }
        }

        Sorvete sorvete = new Sorvete(SorveteSabor.values()[opc - 1]);
        produtos.add(sorvete);
    }

    static void montaBatata(ArrayList<Produtos> produtos){
        BatataFrita batata = new BatataFrita();
        produtos.add(batata);
        System.out.print("Batata Frita adicionada.\n");
    }
    static void montaFile(ArrayList<Produtos> produtos){
        FileFrangoEmpanado file = new FileFrangoEmpanado();
        produtos.add(file);
        System.out.print("Filé de Frango Empanado adicionado.\n");
    }

    static void montaRefri(ArrayList<Produtos> produtos, int i){
        Scanner sc = new Scanner(System.in);
        int opc;

        switch (i) {
            case 1://refil
                System.out.print("[1] Fanta uva\n[2] Fanta Laranja\n[3] Guaraná\n[4] Coca-cola\n[5] Pepsi\n");

                while (true){
                    try {
                        opc = sc.nextInt();

                        if (opc < 1 || opc > 5){
                            System.out.print("Opção inválida\n");
                            continue;
                        }
                        break;
                    } catch (InputMismatchException e){
                        System.out.print("Inserção inválida\n");
                    }
                }

                BebidaRefrigeranteRefil refil = new BebidaRefrigeranteRefil(RefriSabores.values()[opc-1]);

                produtos.add(refil);

                System.out.print("Refrigerante Refil adicionado.\n");
            case 2: //refri lata
                System.out.print("[1] Fanta uva\n[2] Fanta Laranja\n[3] Guaraná\n[4] Coca-cola\n[5] Pepsi\n");

                while (true){
                    try {
                        opc = sc.nextInt();

                        if (opc < 1 || opc > 5){
                            System.out.print("Opção inválida\n");
                            continue;
                        }
                        break;
                    } catch (InputMismatchException e){
                        System.out.print("Inserção inválida\n");
                    }
                }

                BebidaRefrigeranteLata lata = new BebidaRefrigeranteLata(RefriSabores.values()[opc-1]);

                produtos.add(lata);

                System.out.print("Refrigerante lata adicionado.\n");
        }
    }

    static void montaSuco(ArrayList<Produtos> produtos){
        Scanner sc = new Scanner(System.in);
        int opc;

        System.out.print("[1] Suco de laranja natural\n[2] Dell Vale Uva\n[3] Dell Vale Laranja)\n");

        while (true) {
            try {
                opc = sc.nextInt();

                if (opc < 1 || opc > 3) {
                    System.out.print("Opção inválida\n");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.print("Inserção inválida\n");
            }
        }

        Suco suco = new Suco(Sucos.values()[opc-1]);
        produtos.add(suco);
    }

    static void montaChaGel(ArrayList<Produtos> produtos){
        Scanner sc = new Scanner(System.in);
        int opc;

        System.out.print("[1] Pessego\n[2] Limão com abacaxi e hortelã\n[3] Maçã\n[4] Maracujá com maçã\n[5] Amora com hortelã\n");

        while (true) {
            try {
                opc = sc.nextInt();

                if (opc < 1 || opc > 5) {
                    System.out.print("Opção inválida\n");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.print("Inserção inválida\n");
            }
        }

        ChaGelado cha = new ChaGelado(ChaSabor.values()[opc -1]);
        produtos.add(cha);
        System.out.print("Chá Gelado adicionado.\n");
    }

    static void montaAgua(ArrayList<Produtos> produtos){
        Scanner sc = new Scanner(System.in);
        int opc;

        System.out.print("[1] Água mineral\n[2] Água com gás\n[3] Água saborizada (limão)\n");

        while (true) {
            try {
                opc = sc.nextInt();

                if (opc < 1 || opc > 3) {
                    System.out.print("Opção inválida\n");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.print("Inserção inválida\n");
            }
        }

        Agua agua = new Agua(Aguas.values()[opc-1]);
        produtos.add(agua);
    }

    static void simpDuplTrip(ArrayList<Produtos> produtos, int i){
        int opc;
        Scanner sc = new Scanner(System.in);

        switch (i) {
            case 1://hamburguer simples
                System.out.print("[1] Frango\n[2] Carne\n");

                while (true) {
                    try {
                        opc = sc.nextInt();

                        if (opc < 1 || opc > 2) {
                            System.out.print("Opção inválida\n");
                            continue;
                        }
                        break;
                    } catch (InputMismatchException e) {
                        System.out.print("Inserção inválida\n");
                    }
                }

                montaHambSimp(produtos, opc);

            case 2://hamburguer duplo
                System.out.print("[1] Frango\n[2] Carne\n");

                while (true) {
                    try {
                        opc = sc.nextInt();

                        if (opc < 1 || opc > 2) {
                            System.out.print("Opção inválida\n");
                            continue;
                        }
                        break;
                    } catch (InputMismatchException e) {
                        System.out.print("Inserção inválida\n");
                    }
                }

                montaHambDupl(produtos, opc);
            case 3: //hamburguer Triplo
                montaHambTrip(produtos);
        }
    }

    static void simpParmAmer(ArrayList<Produtos> produtos, int i){
        switch (i) {
            case 1: //Croc simples
                montaCrocSimp(produtos);
            case 2://Croc parmegiana
                montaCrocParm(produtos);
            case 3: //Croc americano
                montaCrocAmer(produtos);
        }
    }

    static void burSimpDuplTrip(ArrayList<Produtos> produtos, int i){
        switch (i) {
            case 1: //burguer americano simples
                montaAmerSimp(produtos);
            case 2: //burguer americano duplo
                montaAmerDupl(produtos);
            case 3: //burguer americano triplo
                montaAmerTrip(produtos);
        }
    }

    static void batataFile(ArrayList<Produtos> produtos, int i){
        switch (i) {
            case 1://batata
                montaBatata(produtos);
            case 2://filé
                montaFile(produtos);
        }
    }

    static void bebidaOpc(ArrayList<Produtos> produtos, int i) {
        Scanner sc = new Scanner(System.in);
        int opc;

        switch (i) {
            case 1: //refri
                System.out.print("[1] Refil\n[2] Lata\n");

                while (true) {
                    try {
                        opc = sc.nextInt();

                        if (opc < 1 || opc > 2) {
                            System.out.print("Opção inválida\n");
                            continue;
                        }
                        break;
                    } catch (InputMismatchException e) {
                        System.out.print("Inserção inválida\n");
                    }
                }

                montaRefri(produtos, opc);
            case 2: //sucos
                montaSuco(produtos);
            case 3://chá gelado
                montaChaGel(produtos);
            case 4:
                montaAgua(produtos);
        }
    }
}




