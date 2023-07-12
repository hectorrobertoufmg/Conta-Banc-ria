import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
        // Declarando as variáveis!
        boolean exit = false;
        Scanner leitura = new Scanner(System.in);
        String nome = "";
        String tipoDeConta = "";
        double saldo = 0;
        int tipoContaOpcao;
        int opcao;
        double valor;

        String menuTipoConta =  """
                1) Corrente.
                2) Poupança.
                Digite o tipo da conta:
                """;

        String descricaoConta =
                """
                Nome:           %s
                Tipo de conta:  %s
                Saldo inicial:  %f
                """.formatted(nome, tipoDeConta, saldo);
        String menuCOnta =
                """
                .
                1) Depositar.
                2) Sacar.
                3) Mostrar Conta.
                4) Sair.
                Escolha uma opção:               
                """;

        while(!exit)
        {
            System.out.println(menuCOnta);
            opcao = leitura.nextInt();
            // recebe o \n do input anterior
            leitura.nextLine();
            switch(opcao)
            {

                case 1:
                    System.out.println("Digite o valor que deseja depositar: ");
                    while (true)
                    {
                        valor = leitura.nextDouble();
                        if (valor < 0)
                        {
                            System.out.println("Valor inválido \n Tente novamente!");
                        }else
                        {
                            saldo += valor;
                            System.out.println("Valor foi depositado com sucesso! saldo = "+ saldo);
                            break;
                        }

                    }
                    break;
                case 2:
                    System.out.println("Digite o valor que deseja sacar");
                    while (true)
                    {
                        valor = leitura.nextDouble();
                        if (valor < 0)
                        {
                            System.out.println("Valor inválido \n Tente novamente!");
                        }else if (saldo < valor)
                        {
                            System.out.println("Você não tem esse dinheiro! \n tente outrovalor!");
                        }else
                        {
                            saldo -= valor;
                            System.out.println("Valor sacado comsucesso!");
                            break;
                        }
                    }
                case 3:
                    System.out.println(descricaoConta);
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    continue;






            }
        }

    }
    }
