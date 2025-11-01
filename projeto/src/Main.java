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
                                                    System.out.print("Qual ingrediente deseja remover?\n[1] Hamburguer\n[2] Pão\n[3] Salada\n[4] Molho\n[5] Ovo\n[6] Queijo\n [7] Carne\n[8] Pronto\n");

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
                                                        "[2] Pão\n[3] Salada\n[4] Molho\n[5] Ovo\n[6] Queijo\n[7] Carne\n[8]Frango\n" +
                                                        "[8] Salsicha\n[9] Hamburguer 2\n [10] Hamburguer 3\n[11] Salada 2\n [12] Pronto\n");

                                                while (true) {
                                                    try {
                                                        opc5 = sc.nextInt();

                                                        if (opc5 < 1 || opc5 > 12) {
                                                            System.out.print("Opção inválida\n");
                                                            continue;
                                                        }
                                                        break;
                                                    } catch (InputMismatchException e) {
                                                        System.out.print("Inserção inválida\n");
                                                    }
                                                }

                                                if (opc5 == 12) {
                                                    break;
                                                } else {
                                                    hamburguerTriplo.remove(Ingredientes.values()[opc5 - 1]);
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
                                                    croc.remove(IngredientesCroc.values()[opc6 - 1]);
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
                                                    parmegiana.remove(IngredientesCroc.values()[opc6 - 1]);
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
                                                    americano.remove(IngredientesCroc.values()[opc6 + 1]);
                                                } else {
                                                    americano.remove(IngredientesCroc.values()[opc6 - 1]);
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

                                        System.out.print("Qual ingrediente deseja remover?\n");
                                        System.out.print("[1] Pão\n[2] Hamburguer\n[3] Queijo Mussarela\n[4] Tomate\n[5] Maionese\n[6] Alface\n [7] Pronto\n");

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
                                            Xsalada.remove(IngredientesXSalada.values()[opc5 - 1]);
                                            System.out.print("Ingrediente removido.\n");
                                        }
                                    }
                                }

                                produtosPedidoAtual.add(Xsalada);
                                System.out.print("X-Salada adicionado ao pedido.\n");

                                //lista ingredientes e chama função pra remover
                                System.out.print("Deseja remover algum ingrediente?[1] Sim, [2] Não\n");
                            case 4:
                                //X-egg bacon burguer

                                //lista ingredientes e chama função pra remover
                                System.out.print("Deseja remover algum ingrediente?[1] Sim, [2] Não\n");
                            case 5:
                                //Burguer Americano


                                //lista ingredientes e chama função pra remover
                                System.out.print("Deseja remover algum ingrediente?[1] Sim, [2] Não\n");
                            case 6:
                                //Box Combo

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
                                System.out.print("[1] Refrigerante (refil/lata)\n[2] Sucos (laranja/dell vale)\n[3] Chá gelado\n[4] Água saborizada\n[5] Água\n");

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
                                                //refri refil
                                                BebidaRefrigeranteRefil refil = new BebidaRefrigeranteRefil();
                                                produtosPedidoAtual.add(refil);
                                                System.out.print("Refrigerante Refil adicionado.\n");
                                            case 2: //refri lata
                                                System.out.print("[1] Guaraná\n[2] Coca Cola\n[3] Fanta Uva\n");

                                                while (true) {
                                                    try {
                                                        opc5 = sc.nextInt();

                                                        if (opc5 < 1 || opc5 > 3) {
                                                            System.out.print("Opção inválida\n");
                                                            continue;
                                                        }
                                                        break;
                                                    } catch (InputMismatchException e) {
                                                        System.out.print("Inserção inválida\n");
                                                    }
                                                }

                                                switch (opc5) {
                                                    case 1:
                                                        //lata de guarana
                                                        BebidaRefrigeranteLata guarana = new BebidaRefrigeranteLata("Guaraná");
                                                        produtosPedidoAtual.add(guarana);
                                                        System.out.print("Lata de Guaraná adicionada.\n");
                                                    case 2:
                                                        //lata de coca
                                                        BebidaRefrigeranteLata coca = new BebidaRefrigeranteLata("Coca-Cola");
                                                        produtosPedidoAtual.add(coca);
                                                        System.out.print("Lata de Coca-Cola adicionada.\n");
                                                    case 3:
                                                        //lata de fanta
                                                        BebidaRefrigeranteLata fanta = new BebidaRefrigeranteLata("Fanta Uva");
                                                        produtosPedidoAtual.add(fanta);
                                                        System.out.print("Lata de Fanta Uva adicionada.\n");
                                                }
                                                break;
                                        }
                                        break;

                                    case 2: //sucos
                                        System.out.print("[1] Suco de laranja natural\n[2] Dell Vale (uva/laranja)\n");

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
                                                //suco de laranja
                                                Suco sucoLaranja = new Suco("Laranja Natural");
                                                produtosPedidoAtual.add(sucoLaranja);
                                                System.out.print("Suco de Laranja Natural adicionado.\n");
                                            case 2: //dell vale
                                                System.out.print("[1] Uva\n[2] Laranja\n");

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

                                                switch (opc5) {
                                                    case 1:
                                                        //dell uva
                                                        Suco dellUva = new Suco("Dell Vale Uva");
                                                        produtosPedidoAtual.add(dellUva);
                                                        System.out.print("Suco Dell Vale Uva adicionado.\n");
                                                    case 2:
                                                        //dell laranja
                                                        Suco dellLaranja = new Suco("Dell Vale Laranja");
                                                        produtosPedidoAtual.add(dellLaranja);
                                                        System.out.print("Suco Dell Vale Laranja adicionado.\n");
                                                }
                                                break;
                                        }
                                        break;

                                    case 3:
                                        //chá gelado
                                        ChaGelado cha = new ChaGelado();
                                        produtosPedidoAtual.add(cha);
                                        System.out.print("Chá Gelado adicionado.\n");
                                        break;
                                    case 4:
                                        //água saborizada
                                        AguaSaborizada aguaSabor = new AguaSaborizada();
                                        produtosPedidoAtual.add(aguaSabor);
                                        System.out.print("Água Saborizada adicionada.\n");
                                        break;
                                    case 5:
                                        //água
                                        BebidaAgua agua = new BebidaAgua();
                                        produtosPedidoAtual.add(agua);
                                        System.out.print("Água adicionada.\n");
                                        break;
                                }
                                break;
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
