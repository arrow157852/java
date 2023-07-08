import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o numero da conta");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o numero da agencia sem o digito final");
        int agenciaSemDigto = scanner.nextInt();
        System.out.println("Por favor, digite o digito final");
        int digito = scanner.nextInt();
        System.out.println("Por favor, digite o  seu nome ");
        String nomeCliente = scanner.next();

        double saldo = 237.48;
        String agencia = "0" + agenciaSemDigto + "-" + digito;

        System.out.println("Olá" + " " + nomeCliente + " "
                + ",obrigado por criar uma conta em nosso banco, sua agência é " + " " + " " + agencia + ",conta" + " "
                + numeroConta + " " + "e seu saldo " + saldo + " " + "já está disponível para saque");
    }
}
