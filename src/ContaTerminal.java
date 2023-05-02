import java.util.Scanner;

import static java.lang.System.in;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Integer numeroConta;
        String agencia;
        String nomeCliente;
        Double saldo;

        System.out.println("Por favor, digite o número da Agência': ");
        agencia = scan.next();

        System.out.println("Por favor, digite o número da Conta': ");
        numeroConta = scan.nextInt();

        System.out.println("Por favor, digite o nome do cliente': ");
        nomeCliente = scan.next();

        System.out.println("Por favor, digite o saldo': ");
        saldo = Double.valueOf(scan.next());


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "+ numeroConta + " e seu saldo " +
                saldo + " já está disponível para saque!");
    }
}