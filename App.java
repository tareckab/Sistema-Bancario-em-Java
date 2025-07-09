import java.util.Scanner;
import java.util.function.Function;

public class App{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);


        //Variaveis:

        String nome = "Tareck Barghouthi";
        String tipoConta = "Corrente";
        Double saldo = 2500.0;
        Boolean continuar = true;

        //Dados iniciais do sistema:

        
        
        System.out.println("***************");
        System.out.println();
        System.out.println("Dados do Cliente: ");
        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo Inicial: R$" + saldo);
        System.out.println();
        System.out.println("***************");

        
        //Opções com as suas determinadas ações:

        while (continuar == true) {
            
        
        System.out.println("Operações: ");
        System.out.println();
        System.err.println("1- Consultar dados");
        System.out.println("2- Receber valor");
        System.out.println("3- Transferir valor");
        System.out.println("4- Sair");
        System.out.println();
        System.out.println("Digite a opção desejada: ");
        int opcao = scanner.nextInt();

        
            // loop para o menu principal
            switch (opcao) {

            //Consultar dados:
            case 1:

            System.out.println("***************");
            System.out.println();
            System.out.println("Dados do Cliente: ");
            System.out.println();
            System.out.println("Nome: " + nome);
            System.out.println("Tipo de Conta: " + tipoConta);
            System.out.println("Saldo Inicial: R$" + saldo);
            System.out.println();
            System.out.println("***************");

            break;
            
            //Receber valor:
            case 2:

            System.out.println("Digite o valor que deseja receber: ");
            Double valorReceber = scanner.nextDouble();

            saldo += valorReceber;

            System.out.println("Saldo Atualizado: R$" + saldo);
            System.out.println();
            break;
                
            //Transferir valor:
            case 3:
            System.out.println("Informe o valor que deseja transferir: ");
            Double valorTransferencia = scanner.nextDouble();

            if(valorTransferencia > saldo){
                System.out.println("Saldo insuficiente");
                System.out.println();
                break;
            }
            saldo -= valorTransferencia;
            System.out.println("Saldo Atualizado: R$" + saldo);
            System.out.println();
            break;

            //Sair:
            case 4:
            System.out.println("Saindo...");
            continuar = false;
            break;

            default:
            System.out.println("Opção invalida.Tente novamente");
            System.out.println();
        }
        
        
    }
    }

}