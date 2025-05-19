import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.print("-=-=-=-=-= BEM VINDO AO BANCO DIO -=-=-=-=-=\n");

        System.out.print("Por favor digite o número da sua conta: ");
        int Numero = scan.nextInt();
        scan.nextLine();

        System.out.print("Digite o número da sua Agência: ");
        String Agencia = scan.nextLine();

        System.out.print("Digite o seu nome: ");
        String NomeCliente = scan.nextLine();
        
        System.out.print("Digite o seu saldo: ");
        double Saldo = scan.nextDouble();

        System.out.println("-=-=-=-=-= SUA CONTA CORRENTE DIO -=-=-=-=-=");
        System.out.println("Numero da conta: " + Numero);
        System.out.println("Numero da agência: " + Agencia);
        System.out.println("Nome do cliente: " + NomeCliente);
        System.out.println("Saldo da sua conta R$: " + Saldo);

        scan.close();


    }
}
