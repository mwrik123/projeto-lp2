classDiagram
        class Produtos{
            <<interface>>
            +void imprime()
            +void exibirNome()
            +double getValor()

        }
        class Pedido{
            #id:int
            #nome:string
            #ArrayList<Produtos>: produtos
            #double:valorFinal
            +Pedido(int id, string nome, ArrayList<Produtos> produtos)
            +double calculaValorFinal()
        }
        class Caixa{
            #ArrayList<Pedido>:pedidos
            #double:valorTotal
            +Caixa()
            +void exibePedidos()
            +void exibePedidosTeste()
            +void addAoValorTotal(Pedido pedido)
            +double getValorTotal()
        }
        class Agua{
            #static double:preco
            #Aguas:agua
            +Agua(Aguas agua, int i)
        }
        class Aguas{
            <<enumeration>>
            MINERAL,
            COM_GAS,
            SABORIZADA_LIMAO
        }
        class BatataFrita{
            #static double:preco
            #String:nome
            +BatataFrita()
        }
        class FileFrangoEmpanado{
            #static double:preco
            #String:nome
            +FileFrangoEmpanado()
        }
        class BebidaRefrigeranteLata{
            #static double:preco
            #RefriSabores:sabor
            +BebidaRefrigeranteLata(RefriSabores saborRefri)
        }
        class BebidaRefrigeranteRefil{
            #static double:preco
            #RefriSabores:sabor
            +BebidaRefrigeranteRefil(RefriSabores sabor)
        }
        class RefriSabores{
            <<enumeration>>
            FANTA_UVA,
            FANTA_LARANJA,
            GUARANA,
            COCA_COLA,
            PEPSI
        }
        class Box{
            #ArrayList<Produtos>:produtos_box
            #static double preco
            +Box(ArrayList<Produtos> produtos)
        }
        class BurguerAmericano{
            #ArrayList<IngredientesBurguerAmericano>:ingredientes
            #static double:preco
            +BurguerAmericano()
            +void remove(IngredientesBurguerAmericano ingrediente)
            +void novoPreco(int versao)
        }
        class BurguerAmericanoDuplo{
            +BurguerAmericanoDuplo()
        }
        class BurguerAmericanoTriplo{
            +BurguerAmericanoTriplo()
        }
        class IngredientesBurguerAmericano{
            <<enumeration>>
            PAO,
            HAMBURGUER,
            SALADA_AMERICANA,
            CEBOLA_PICADA,
            MOLHO_DEFUMADO,
            MAIONESE,
            HAMBURGUER_2,
            HAMBURGUER_3
        }
        class ChaGelado{
            #static double:preco
            #ChaSabor:sabor

            +ChaGelado(ChaSabor sabor)
        }
        class ChaSabor{
            <<enumeration>>
            PESSEGO,
            LIMAO_ABACAXI_HORTELA,
            MACA,
            MARACUJA_MACA,
            AMORA_HORTELA
        }
        class CrocSimples{
            #ArrayList<IngredientesCroc>:ingredientesCrocs
            #static double:preco

            +CrocSimples()
            +void remove(IngredientesCroc ingrediente)
            +void novoPreco(int i)
        }
        class CrocParmegiana{
            +CrocParmegiana()
        }
        class CrocAmericano{
            +CrocAmericano()
        }
        class IngredientesCroc{
            <<enumeration>>
            PAO,
            FRANGO_EMPANADO,
            SALADA,
            MAIONESE,
            QUEIJO,
            MOLHO_DE_TOMATE,
            TOMATE,
            SALADA_AMERICANA,
            CEBOLA,
            MOLHO_DEFUMADO
        }
        class  Hamburguer{
            #ArrayList<Ingredientes> ingredientes
            #static double:preco
            +Hamburguer(int opc)
            +Hamburguer()
            +void remove(Ingredientes ingrediente)
            +void novoPreco(int i)
        }
        class HamburguerDuplo{
            +HamburguerDuplo(int opc)
        }
        class HamburguerTriplo{
            +HamburguerTriplo()
        }
        class Ingredientes{
            <<enumeration>>
            HAMB,
            PAO,
            SALADA,
            MOLHO,
            OVO,
            QUEIJO,
            CARNE,
            FRANGO,
            SALSICHA,
            HAMB2,
            HAMB3,
            SALADA2
        }
        class Sorvete{
            #static double:preco
            #SorveteSabor sabor
            +Sorvete(SorveteSabor sabor)
        }
        class SorveteSabor{
            <<enumeration>>
            CHOCOLATE,
            CREME,
            MISTO
        }
        class Suco{
            #static double:preco
            #Sucos sabor
            +Suco(Sucos saborSuco)
        }
        class Sucos{
            <<enumeration>>
            LARANJA_NATURAL,
            DELL_UVA,
            DELL_LARANJA
        }
        class XeggBaconBurguer{
            #ArrayList<IngredientesXBB>:ingredientes
            #static double:preco
            +XeggBaconBurguer()
            +void remove(IngredientesXBB a)
        }
        class IngredientesXBB{
            <<enumeration>>
            HAMBURGUER,
            CHEDDAR,
            OVO,
            BACON,
            MAIONESE,
            PAO
        }
        class xSalada{
            #ArrayList<IngredientesXSalada> ingredientesXSalada
            #static double:preco
            +xSalada()
            +void remove(IngredientesXSalada ingrediente)
        }
        class IngredientesXSalada{
            <<enumeration>>
            PAO,
            HAMBURGUER,
            QEUIJO_MUSSARELA,
            TOMATE,
            ALFACE,
            MAIONESE
        }
        Hamburguer <|-- HamburguerDuplo
        Hamburguer<|--HamburguerTriplo
        BurguerAmericano<|--BurguerAmericanoDuplo
        BurguerAmericano<|--BurguerAmericanoTriplo
        CrocSimples<|--CrocAmericano
        CrocSimples<|--CrocParmegiana
        Produtos<|..Agua
        Produtos<|..BatataFrita
        Produtos<|..BebidaRefrigeranteLata
        Produtos<|..BebidaRefrigeranteRefil
        Produtos<|..Box
        Produtos<|..BurguerAmericano
        Produtos<|..BurguerAmericanoDuplo
        Produtos<|..BurguerAmericanoTriplo
        Produtos<|..ChaGelado
        Produtos<|..CrocAmericano
        Produtos<|..CrocParmegiana
        Produtos<|..CrocSimples
        Produtos<|..FileFrangoEmpanado
        Produtos<|..Hamburguer
        Produtos<|..HamburguerDuplo
        Produtos<|..HamburguerTriplo
        Produtos<|..Sorvete
        Produtos<|..Suco
        Produtos<|..XeggBaconBurguer
        Produtos<|..xSalada
        xSalada-->IngredientesXSalada
        XeggBaconBurguer-->IngredientesXBB
        Suco-->Sucos
        Sorvete-->SorveteSabor
        Pedido-->Produtos
        HamburguerTriplo-->Ingredientes
        HamburguerDuplo-->Ingredientes
        Hamburguer-->Ingredientes
        CrocSimples-->IngredientesCroc
        CrocParmegiana-->IngredientesCroc
        CrocAmericano-->IngredientesCroc
        ChaGelado-->ChaSabor
        Agua-->Aguas
        BebidaRefrigeranteLata-->RefriSabores
        BebidaRefrigeranteRefil-->RefriSabores
        BurguerAmericano-->IngredientesBurguerAmericano
        BurguerAmericanoDuplo-->IngredientesBurguerAmericano
        BurguerAmericanoTriplo-->IngredientesBurguerAmericano
        Caixa-->Pedido

