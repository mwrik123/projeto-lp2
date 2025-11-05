
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
            int opc5 = 0;
            int opc6 = 0;

            switch (opc){
                case 1:
                    ArrayList <Produtos> produtosPedidoAtual = new ArrayList<>();
                    id++;
                    System.out.print("Nome do pedido:\n");
                    String nome = sc.next();

                    System.out.print("Adicione produtos ao carrinho:\n");
                    while(true){
                        System.out.print("[1] Hamburguer (simples/ duplo/ triplo)\n[2] Croc (simples/ parmegiana/ americano)\n" +
                                "[3] X-salada\n[4] X-egg bacon burguer\n[5] Burguer americano\n[6]Box-combo\n" +
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

                                switch (opc3) {
                                    case 1://hamburguer simples
                                        //lista ingredientes e chama função pra remover
                                        System.out.print("[1] Frango\n[2] Carne\n");

                                        while (true) {
                                            try {
                                                opc4 = sc.nextInt();

                                                if (opc4 < 1 || opc4 > 2) {
                                                    System.out.print("Opção inválida\n");
                                                    continue;
                                                }
                                                break;
                                            } catch (InputMismatchException e) {
                                                System.out.print("Inserção inválida\n");
                                            }
                                        }

                                        if (opc4 == 1) {//hamburguer simples de frango
                                            Hamburguer hamburguer = new Hamburguer(opc4);

                                            System.out.print("Deseja remover algum ingrediente?[1] Sim, [2] Concluir\n");

                                            while (true) {
                                                try {
                                                    opc5 = sc.nextInt();

                                                    if (opc5 < 1 || opc5 > 2) {
                                                        System.out.print("Opção inválida\n");
                                                        continue;
                                                    }
                                                    break;
                                                } catch (InputMismatchException e) {
                                                    System.out.print("Inserção inválida\n");
                                                }
                                            }

                                            if (opc5 == 1) {
                                                while (true) {
                                                    System.out.print("Qual ingrediente deseja remover?\n[1] Hamburguer\n[2] Pão\n[3] Salada\n[4] Molho\n[5] Ovo\n[6] Queijo\n[7] Frango\n[8] Pronto\n");

                                                    while (true) {
                                                        try {
                                                            opc6 = sc.nextInt();

                                                            if (opc6 < 1 || opc6 > 8) {
                                                                System.out.print("Opção inválida\n");
                                                                continue;
                                                            }
                                                            break;
                                                        } catch (InputMismatchException e) {
                                                            System.out.print("Inserção inválida\n");
                                                        }
                                                    }

                                                    if (opc6 == 8) {
                                                        break;
                                                    } else if (opc6 == 7) {
                                                        hamburguer.remove(Ingredientes.values()[opc6]);
                                                    } else {
                                                        hamburguer.remove(Ingredientes.values()[opc6 - 1]);
                                                    }
                                                }
                                            }

                                            produtosPedidoAtual.add(hamburguer);
                                        }

                                        if (opc4 == 2) {//hamburguer simples de carne
                                            Hamburguer hamburguer = new Hamburguer(opc4);

                                            System.out.print("Deseja remover algum ingrediente?[1] Sim, [2] Concluir\n");

                                            while (true) {
                                                try {
                                                    opc5 = sc.nextInt();

                                                    if (opc5 < 1 || opc5 > 2) {
                                                        System.out.print("Opção inválida\n");
                                                        continue;
                                                    }
                                                    break;
                                                } catch (InputMismatchException e) {
                                                    System.out.print("Inserção inválida\n");
                                                }
                                            }

                                            if (opc5 == 1) {
                                                while (true) {
                                                    System.out.print("Qual ingrediente deseja remover?\n[1] Hamburguer\n" +
                                                            "[2] Pão\n[3] Salada\n[4] Molho\n[5] Ovo\n[6] Queijo\n [7] Carne\n[8] Pronto\n");

                                                    while (true) {
                                                        try {
                                                            opc6 = sc.nextInt();

                                                            if (opc6 < 1 || opc6 > 8) {
                                                                System.out.print("Opção inválida\n");
                                                                continue;
                                                            }
                                                            break;
                                                        } catch (InputMismatchException e) {
                                                            System.out.print("Inserção inválida\n");
                                                        }
                                                    }

                                                    if (opc6 == 8) {
                                                        break;
                                                    } else {
                                                        hamburguer.remove(Ingredientes.values()[opc6 - 1]);
                                                    }
                                                }
                                            }

                                            produtosPedidoAtual.add(hamburguer);
                                        }

                                    case 2://hamburguer duplo
                                        //lista ingredientes e chama função pra remover
                                        System.out.print("[1] Frango\n[2] Carne\n");

                                        while (true) {
                                            try {
                                                opc4 = sc.nextInt();

                                                if (opc4 < 1 || opc4 > 2) {
                                                    System.out.print("Opção inválida\n");
                                                    continue;
                                                }
                                                break;
                                            } catch (InputMismatchException e) {
                                                System.out.print("Inserção inválida\n");
                                            }
                                        }

                                        if (opc4 == 1) {//hamburguer duplo de frango
                                            HamburguerDuplo hamburguerDuplo = new HamburguerDuplo(opc4);

                                            System.out.print("Deseja remover algum ingrediente?[1] Sim, [2] Não\n");

                                            while (true) {
                                                try {
                                                    opc5 = sc.nextInt();

                                                    if (opc5 < 1 || opc5 > 2) {
                                                        System.out.print("Opção inválida\n");
                                                        continue;
                                                    }
                                                    break;
                                                } catch (InputMismatchException e) {
                                                    System.out.print("Inserção inválida\n");
                                                }
                                            }

                                            if (opc5 == 1) {


                                                while (true) {
                                                    System.out.print("Qual ingrediente deseja remover?\n[1] Hamburguer 1\n" +
                                                            "[2] Pão\n[3] Salada\n[4] Molho\n[5] Ovo\n[6] Queijo\n[7] Frango\n[8] Salsicha\n[9] Hamburguer 2\n[10] Pronto\n");

                                                    while (true) {
                                                        try {
                                                            opc6 = sc.nextInt();

                                                            if (opc6 < 1 || opc6 > 10) {
                                                                System.out.print("Opção inválida\n");
                                                                continue;
                                                            }
                                                            break;
                                                        } catch (InputMismatchException e) {
                                                            System.out.print("Inserção inválida\n");
                                                        }
                                                    }

                                                    if (opc6 == 10) {
                                                        break;
                                                    } else if (opc6 == 7 || opc6 == 8 || opc6 == 9) {
                                                        hamburguerDuplo.remove(Ingredientes.values()[opc6]);
                                                    } else {
                                                        hamburguerDuplo.remove(Ingredientes.values()[opc6 - 1]);
                                                    }
                                                }

                                            }
                                            produtosPedidoAtual.add(hamburguerDuplo);
                                        }

                                        if (opc4 == 2) {//hamburguer duplo de carne
                                            HamburguerDuplo hamburguerDuplo = new HamburguerDuplo(opc4);

                                            System.out.print("Deseja remover algum ingrediente?[1] Sim, [2] Não\n");

                                            while (true) {
                                                try {
                                                    opc5 = sc.nextInt();

                                                    if (opc5 < 1 || opc5 > 2) {
                                                        System.out.print("Opção inválida\n");
                                                        continue;
                                                    }
                                                    break;
                                                } catch (InputMismatchException e) {
                                                    System.out.print("Inserção inválida\n");
                                                }
                                            }

                                            if (opc5 == 1) {


                                                while (true) {
                                                    System.out.print("Qual ingrediente deseja remover?\n[1] Hamburguer 1\n" +
                                                            "[2] Pão\n[3] Salada\n[4] Molho\n[5] Ovo\n[6] Queijo\n[7] Carne\n[8] Salsicha\n[9] Hamburguer 2\n[10] Pronto\n");

                                                    while (true) {
                                                        try {
                                                            opc6 = sc.nextInt();

                                                            if (opc6 < 1 || opc6 > 10) {
                                                                System.out.print("Opção inválida\n");
                                                                continue;
                                                            }
                                                            break;
                                                        } catch (InputMismatchException e) {
                                                            System.out.print("Inserção inválida\n");
                                                        }
                                                    }

                                                    if (opc6 == 10) {
                                                        break;
                                                    } else if (opc6 == 8 || opc6 == 9) {
                                                        hamburguerDuplo.remove(Ingredientes.values()[opc6]);
                                                    } else {
                                                        hamburguerDuplo.remove(Ingredientes.values()[opc6 - 1]);
                                                    }
                                                }

                                            }
                                            produtosPedidoAtual.add(hamburguerDuplo);
                                        }
                                    case 3: //hamburguer Triplo

                                        HamburguerTriplo hamburguerTriplo = new HamburguerTriplo();

                                        System.out.print("Deseja remover algum ingrediente?[1] Sim, [2] Não\n");

                                        while (true) {
                                            try {
                                                opc4 = sc.nextInt();

                                                if (opc4 < 1 || opc4 > 2) {
                                                    System.out.print("Opção inválida\n");
                                                    continue;
                                                }
                                                break;
                                            } catch (InputMismatchException e) {
                                                System.out.print("Inserção inválida\n");
                                            }
                                        }

                                        if (opc4 == 1) {

                                            while (true) {
                                                System.out.print("Qual ingrediente deseja remover?\n[1] Hamburguer 1\n" +
                                                        "[2] Pão\n[3] Salada\n[4] Molho\n[5] Ovo\n[6] Queijo\n[7] Carne\n[8] Frango\n" +
                                                        "[9] Salsicha\n[10] Hamburguer 2\n [11] Hamburguer 3\n[12] Salada 2\n [13] Pronto\n");

                                                while (true) {
                                                    try {
                                                        opc5 = sc.nextInt();

                                                        if (opc5 < 1 || opc5 > 13) {
                                                            System.out.print("Opção inválida\n");
                                                            continue;
                                                        }
                                                        break;
                                                    } catch (InputMismatchException e) {
                                                        System.out.print("Inserção inválida\n");
                                                    }
                                                }

                                                if (opc5 == 13) {
                                                    break;
                                                } else {
                                                    hamburguerTriplo.remove(Ingredientes.values()[opc6 - 1]);
                                                }
                                            }
                                        }
                                        produtosPedidoAtual.add(hamburguerTriplo);
                                }
                                        
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

                                switch (opc3) {
                                    case 1: //Croc simples
                                        CrocSimples croc = new CrocSimples();

                                        //lista ingredientes e chama função pra remover
                                        System.out.print("Deseja remover algum ingrediente?[1] Sim, [2] Não\n");

                                        while (true) {
                                            try {
                                                opc4 = sc.nextInt();

                                                if (opc4 < 1 || opc4 > 2) {
                                                    System.out.print("Opção inválida\n");
                                                    continue;
                                                }
                                                break;
                                            } catch (InputMismatchException e) {
                                                System.out.print("Inserção inválida\n");
                                            }
                                        }

                                        if (opc4 == 1) {


                                            while (true) {
                                                System.out.print("Qual ingrediente deseja remover?\n[1] Pão\n[2]Frango Empanado\n" +
                                                        "[3] Salada\n[4] Maionese\n[5] Queijo\n[6] Pronto\n");

                                                while (true) {
                                                    try {
                                                        opc5 = sc.nextInt();

                                                        if (opc5 < 1 || opc5 > 6) {
                                                            System.out.print("Opção inválida\n");
                                                            continue;
                                                        }
                                                        break;
                                                    } catch (InputMismatchException e) {
                                                        System.out.print("Inserção inválida\n");
                                                    }
                                                }

                                                if (opc5 == 6) {
                                                    break;
                                                } else {
                                                    croc.remove(IngredientesCroc.values()[opc5 - 1]);
                                                }
                                            }

                                        }
                                        produtosPedidoAtual.add(croc);
                                    case 2://Croc parmegiana
                                        CrocParmegiana parmegiana = new CrocParmegiana();

                                        //lista ingredientes e chama função pra remover
                                        System.out.print("Deseja remover algum ingrediente?[1] Sim, [2] Não\n");

                                        while (true) {
                                            try {
                                                opc4 = sc.nextInt();

                                                if (opc4 < 1 || opc4 > 2) {
                                                    System.out.print("Opção inválida\n");
                                                    continue;
                                                }
                                                break;
                                            } catch (InputMismatchException e) {
                                                System.out.print("Inserção inválida\n");
                                            }
                                        }

                                        if (opc4 == 1) {


                                            while (true) {
                                                System.out.print("Qual ingrediente deseja remover?\n[1] Pão\n" +
                                                        "[2] Frango empanado\n[3] Salada\n[4] Maionese\n[5] Queijo\n[6] Molho de tomate\n[7] Tomate (adicional)\n[8] Pronto");

                                                while (true) {
                                                    try {
                                                        opc5 = sc.nextInt();

                                                        if (opc5 < 1 || opc5 > 8) {
                                                            System.out.print("Opção inválida\n");
                                                            continue;
                                                        }
                                                        break;
                                                    } catch (InputMismatchException e) {
                                                        System.out.print("Inserção inválida\n");
                                                    }
                                                }

                                                if (opc5 == 7) {
                                                    break;
                                                } else {
                                                    parmegiana.remove(IngredientesCroc.values()[opc5 - 1]);
                                                }
                                            }

                                        }
                                        produtosPedidoAtual.add(parmegiana);
                                    case 3: //Croc americano
                                        CrocAmericano americano = new CrocAmericano();

                                        //lista ingredientes e chama função pra remover
                                        System.out.print("Deseja remover algum ingrediente?[1] Sim, [2] Não\n");

                                        while (true) {
                                            try {
                                                opc4 = sc.nextInt();

                                                if (opc4 < 1 || opc4 > 2) {
                                                    System.out.print("Opção inválida\n");
                                                    continue;
                                                }
                                                break;
                                            } catch (InputMismatchException e) {
                                                System.out.print("Inserção inválida\n");
                                            }
                                        }

                                        if (opc4 == 1) {


                                            while (true) {
                                                System.out.print("Qual ingrediente deseja remover?\n[1] Pão\n[2] Frango Empanado\n" +
                                                        "[3] Salada\n[4] Maionese\n[5] Queijo\n[6] Salada americana\n[7] Cebola\n[8] Molho defumado\n[9] Pronto\n");

                                                while (true) {
                                                    try {
                                                        opc5 = sc.nextInt();

                                                        if (opc5 < 1 || opc5 > 9) {
                                                            System.out.print("Opção inválida\n");
                                                            continue;
                                                        }
                                                        break;
                                                    } catch (InputMismatchException e) {
                                                        System.out.print("Inserção inválida\n");
                                                    }
                                                }

                                                if (opc5 == 9) {
                                                    break;
                                                } else if (opc5 == 6 || opc5 == 7 || opc5 == 8) {
                                                    americano.remove(IngredientesCroc.values()[opc5 + 1]);
                                                } else {
                                                    americano.remove(IngredientesCroc.values()[opc5 - 1]);
                                                }
                                            }

                                        }
                                        produtosPedidoAtual.add(americano);
                                }
                            case 3: //X-Salada
                                xSalada Xsalada = new xSalada();

                                System.out.print("Deseja remover algum ingrediente?[1] Sim, [2] Não\n");

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

                                if (opc3 == 1) {

                                    while (true) {

                                        System.out.print("Qual ingrediente deseja remover?\n");
                                        System.out.print("[1] Pão\n[2] Hamburguer\n[3] Queijo Mussarela\n[4] Tomate\n[5] Maionese\n[6] Alface\n [7] Pronto\n");

                                        while (true) {
                                            try {
                                                opc4 = sc.nextInt();

                                                if (opc4 < 1 || opc4 > 7) {
                                                    System.out.print("Opção inválida\n");
                                                    continue;
                                                }
                                                break;
                                            } catch (InputMismatchException e) {
                                                System.out.print("Inserção inválida\n");
                                                sc.next();
                                            }
                                        }

                                        if (opc4 == 7) {
                                            break;
                                        } else {
                                            Xsalada.remove(IngredientesXSalada.values()[opc4 - 1]);
                                            System.out.print("Ingrediente removido.\n");
                                        }
                                    }
                                }

                                produtosPedidoAtual.add(Xsalada);
                                System.out.print("X-Salada adicionado ao pedido.\n");

                            case 4:
                                //X-egg bacon burguer
                                XeggBaconBurguer x_egg = new XeggBaconBurguer();

                                //lista ingredientes e chama função pra remover
                                System.out.print("Deseja remover algum ingrediente?[1] Sim, [2] Não\n");

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

                                if (opc3 == 1) {
                                        while (true) {
                                            System.out.print("Qual ingrediente deseja remover?\n[1] Hamburguer\n" +
                                                    "[2] Cheddar\n[3] Ovo\n[4] Bacon\n[5] Maionese\n[6] Pão\n[7] Pronto");

                                            while (true) {
                                                try {
                                                    opc4 = sc.nextInt();

                                                    if (opc4 < 1 || opc4 > 7) {
                                                        System.out.print("Opção inválida\n");
                                                        continue;
                                                    }
                                                    break;
                                                } catch (InputMismatchException e) {
                                                    System.out.print("Inserção inválida\n");
                                                }
                                            }

                                            if (opc4 == 7) {
                                                break;
                                            } else {
                                                x_egg.remove(IngredientesXBB.values()[opc4 - 1]);
                                            }
                                        }

                                }
                                produtosPedidoAtual.add(x_egg);
                            case 5:
                                //Burguer Americano

                                System.out.print("Qual Burguer você deseja? [1] Simples\n[2] Duplo\n[3] Triplo\n");

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

                                switch (opc3) {
                                    case 1: //burguer americano simples
                                        BurguerAmericano americanoSimples = new BurguerAmericano();

                                        System.out.print("Deseja remover algum ingrediente?[1] Sim, [2] Não\n");

                                        while (true) {
                                            try {
                                                opc4 = sc.nextInt();
                                                if (opc4 < 1 || opc4 > 2) {
                                                    System.out.print("Opção inválida\n");
                                                    continue;
                                                }
                                                break;
                                            } catch (InputMismatchException e) {
                                                System.out.print("Inserção inválida\n");
                                                sc.next();
                                            }
                                        }

                                        if (opc4 == 1) {
                                            while (true) {
                                                System.out.print("Qual ingrediente deseja remover?\n[1] Pão\n[2] Hamburguer\n" +
                                                        "[3] Salada Americana\n[4] Cebola Picada\n[5] Molho Defumado\n[6] Maionese\n[7] Pronto\n");

                                                while (true) {
                                                    try {
                                                        opc5 = sc.nextInt();
                                                        if (opc5 < 1 || opc5 > 7) {
                                                            System.out.print("Opção inválida\n");
                                                            continue;
                                                        }
                                                        break;
                                                    } catch (InputMismatchException e) {
                                                        System.out.print("Inserção inválida\n");
                                                        sc.next();
                                                    }
                                                }

                                                if (opc5 == 7) {
                                                    break;
                                                } else {
                                                    americanoSimples.remove(IngredientesBurguerAmericano.values()[opc5 - 1]);
                                                    System.out.print("Ingrediente removido.\n");
                                                }
                                            }
                                        }
                                        produtosPedidoAtual.add(americanoSimples);
                                        System.out.print("Burguer Americano Simples adicionado.\n");

                                    case 2: //burguer americano duplo
                                        BurguerAmericanoDuplo americanoDuplo = new BurguerAmericanoDuplo();

                                        System.out.print("Deseja remover algum ingrediente?[1] Sim, [2] Não\n");

                                        while (true) {
                                            try {
                                                opc4 = sc.nextInt();
                                                if (opc4 < 1 || opc4 > 2) {
                                                    System.out.print("Opção inválida\n");
                                                    continue;
                                                }
                                                break;
                                            } catch (InputMismatchException e) {
                                                System.out.print("Inserção inválida\n");
                                                sc.next();
                                            }
                                        }

                                        if (opc4 == 1) {
                                            while (true) {

                                                System.out.print("Qual ingrediente deseja remover?\n[1] Pão\n[2] Hamburguer\n" +
                                                        "[3] Salada Americana\n[4] Cebola Picada\n[5] Molho Defumado\n[6] Maionese\n[7] Hamburguer 2\n[8] Pronto\n");

                                                while (true) {
                                                    try {
                                                        opc5 = sc.nextInt();
                                                        if (opc5 < 1 || opc5 > 8) {
                                                            System.out.print("Opção inválida\n");
                                                            continue;
                                                        }
                                                        break;
                                                    } catch (InputMismatchException e) {
                                                        System.out.print("Inserção inválida\n");
                                                        sc.next();
                                                    }
                                                }

                                                if (opc5 == 8) {
                                                    break;
                                                } else {

                                                    americanoDuplo.remove(IngredientesBurguerAmericano.values()[opc5 - 1]);
                                                    System.out.print("Ingrediente removido.\n");
                                                }
                                            }
                                        }
                                        produtosPedidoAtual.add(americanoDuplo);
                                        System.out.print("Burguer Americano Duplo adicionado.\n");

                                    case 3: //burguer americano triplo
                                        BurguerAmericanoTriplo americanoTriplo = new BurguerAmericanoTriplo();

                                        System.out.print("Deseja remover algum ingrediente?[1] Sim, [2] Não\n");

                                        while (true) {
                                            try {
                                                opc4 = sc.nextInt();
                                                if (opc4 < 1 || opc4 > 2) {
                                                    System.out.print("Opção inválida\n");
                                                    continue;
                                                }
                                                break;
                                            } catch (InputMismatchException e) {
                                                System.out.print("Inserção inválida\n");
                                                sc.next();
                                            }
                                        }

                                        if (opc4 == 1) {
                                            while (true) {

                                                System.out.print("Qual ingrediente deseja remover?\n[1] Pão\n[2] Hamburguer\n" +
                                                        "[3] Salada Americana\n[4] Cebola Picada\n[5] Molho Defumado\n[6] Maionese\n" +
                                                        "[7] Hamburguer 2\n[8] Hamburguer 3\n[9] Pronto\n");

                                                while (true) {
                                                    try {
                                                        opc5 = sc.nextInt();
                                                        if (opc5 < 1 || opc5 > 9) {
                                                            System.out.print("Opção inválida\n");
                                                            continue;
                                                        }
                                                        break;
                                                    } catch (InputMismatchException e) {
                                                        System.out.print("Inserção inválida\n");
                                                        sc.next();
                                                    }
                                                }

                                                if (opc5 == 9) {
                                                    break;
                                                } else {
                                                    americanoTriplo.remove(IngredientesBurguerAmericano.values()[opc5 - 1]);
                                                    System.out.print("Ingrediente removido.\n");
                                                }
                                            }
                                        }
                                        produtosPedidoAtual.add(americanoTriplo);
                                        System.out.print("Burguer Americano Triplo adicionado.\n");
                                }
                            case 6:
                                //Box Combo
                                System.out.print("Hamburguer 1:\n[1] Hamburguer (simples/ duplo/ triplo)\n[2] Croc (simples/ parmegiana/ americano)\n"
                                                +"\n[3] X-salada\n[4] X-egg bacon burguer\n[5] Burguer americano\n[6] Vazio\n");

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

                                montaHamb1(opc3);
                                //implementa montagem do combo a partir do que da pra colocar
                            case 7:
                                //Sorvete
                                System.out.print("[1] Chocolate\n[2] Misto\n[3] Creme\n");

                                // validando
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
                                    }
                                }

                                switch (opc3) {
                                    case 1:
                                        //sorvete de chocolate
                                        Sorvete sorveteChoc = new Sorvete("Chocolate");
                                        produtosPedidoAtual.add(sorveteChoc);
                                        System.out.print("Sorvete de Chocolate adicionado.\n");
                                    case 2:
                                        //sorvete misto
                                        Sorvete sorveteMisto = new Sorvete("Misto");
                                        produtosPedidoAtual.add(sorveteMisto);
                                        System.out.print("Sorvete Misto adicionado.\n");
                                    case 3:
                                        //sorvete de creme
                                        Sorvete sorveteCreme = new Sorvete("Creme");
                                        produtosPedidoAtual.add(sorveteCreme);
                                        System.out.print("Sorvete de Creme adicionado.\n");
                                }
                                break;

                            case 8:
                                //batata frita
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

                                switch (opc3) {
                                    case 1:
                                        //batata
                                        BatataFrita batata = new BatataFrita();
                                        produtosPedidoAtual.add(batata);
                                        System.out.print("Batata Frita adicionada.\n");
                                    case 2:
                                        //filé
                                        FileFrangoEmpanado file = new FileFrangoEmpanado();
                                        produtosPedidoAtual.add(file);
                                        System.out.print("Filé de Frango Empanado adicionado.\n");
                                }
                                break;

                            case 9:
                                //bebidas
                                    while (true){
                                        System.out.print("[1] Refrigerante (refil/lata)\n[2] Sucos (laranja/dell vale)\n[3] Chá gelado\n[4] Água\n[5] Pronto");

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

                                        switch (opc3) {
                                            case 1: //refri
                                                System.out.print("[1] Refil\n[2] Lata\n");

                                                while (true) {
                                                    try {
                                                        opc4 = sc.nextInt();

                                                        if (opc4 < 1 || opc4 > 2) {
                                                            System.out.print("Opção inválida\n");
                                                            continue;
                                                        }
                                                        break;
                                                    } catch (InputMismatchException e) {
                                                        System.out.print("Inserção inválida\n");
                                                    }
                                                }

                                                switch (opc4) {
                                                    case 1:
                                                        System.out.print("[1] Fanta uva\n[2] Fanta Laranja\n[3] Guaraná\n[4] Coca-cola\n[5] Pepsi\n");

                                                        while (true){
                                                            try {
                                                                opc5 = sc.nextInt();

                                                                if (opc5 < 1 || opc5 > 5){
                                                                    System.out.print("Opção inválida\n");
                                                                    continue;
                                                                }
                                                                break;
                                                            } catch (InputMismatchException e){
                                                                System.out.print("Inserção inválida\n");
                                                            }
                                                        }

                                                        BebidaRefrigeranteRefil refil = new BebidaRefrigeranteRefil(RefriSabores.values()[opc5-1]);

                                                        produtosPedidoAtual.add(refil);

                                                        System.out.print("Refrigerante Refil adicionado.\n");
                                                    case 2: //refri lata
                                                        System.out.print("[1] Fanta uva\n[2] Fanta Laranja\n[3] Guaraná\n[4] Coca-cola\n[5] Pepsi\n");

                                                        while (true){
                                                            try {
                                                                opc5 = sc.nextInt();

                                                                if (opc5 < 1 || opc5 > 5){
                                                                    System.out.print("Opção inválida\n");
                                                                    continue;
                                                                }
                                                                break;
                                                            } catch (InputMismatchException e){
                                                                System.out.print("Inserção inválida\n");
                                                            }
                                                        }

                                                        BebidaRefrigeranteLata lata = new BebidaRefrigeranteLata(RefriSabores.values()[opc5-1]);

                                                        produtosPedidoAtual.add(lata);

                                                        System.out.print("Refrigerante lata adicionado.\n");
                                                }
                                            case 2: //sucos
                                                System.out.print("[1] Suco de laranja natural\n[2] Dell Vale Uva\n[3] Dell Vale Laranja)\n");

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
                                                    }
                                                }

                                                Suco suco = new Suco(Sucos.values()[opc4-1]);
                                                produtosPedidoAtual.add(suco);

                                            case 3:
                                                //chá gelado
                                                System.out.print("[1] Pessego\n[2] Limão com abacaxi e hortelã\n[3] Maçã\n[4] Maracujá com maçã\n[5] Amora com hortelã\n");

                                                while (true) {
                                                    try {
                                                        opc4 = sc.nextInt();

                                                        if (opc4 < 1 || opc4 > 5) {
                                                            System.out.print("Opção inválida\n");
                                                            continue;
                                                        }
                                                        break;
                                                    } catch (InputMismatchException e) {
                                                        System.out.print("Inserção inválida\n");
                                                    }
                                                }

                                                ChaGelado cha = new ChaGelado(ChaSabor.values()[opc4 -1]);
                                                produtosPedidoAtual.add(cha);
                                                System.out.print("Chá Gelado adicionado.\n");

                                            case 4:
                                                System.out.print("[1] Água mineral\n[2] Água com gás\n[3] Água saborizada (limão)\n");

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
                                                    }
                                                }

                                                Agua agua = new Agua(Aguas.values()[opc4-1]);
                                                produtosPedidoAtual.add(agua);
                                            case 5:
                                                break;
                                        }
                                    }

                            case 10:
                                //Sair


                                //add arrays de produtos ao pedido e fecha o carrinho

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





