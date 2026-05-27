import java.util.ArrayList;
import java.util.Scanner;

class Conta {

    String titular;
    int numeroConta;
    double saldo;

    public Conta(String titular, int numeroConta, double saldoInicial) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
    }

    public void sacar(double valor) {

        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void exibirConta() {
        System.out.println("\nTitular: " + titular);
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo: R$ " + saldo);
    }
}

public class SistemaBanco {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Conta> contas = new ArrayList<>();

        while (true) {

            System.out.println("\n===== SISTEMA BANCÁRIO =====");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Listar contas");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Sair");

            int opcao = scanner.nextInt();

            if (opcao == 1) {

                scanner.nextLine();

                System.out.print("Nome do titular: ");
                String nome = scanner.nextLine();

                System.out.print("Número da conta: ");
                int numero = scanner.nextInt();

                System.out.print("Saldo inicial: ");
                double saldo = scanner.nextDouble();

                Conta novaConta = new Conta(nome, numero, saldo);

                contas.add(novaConta);

                System.out.println("Conta criada com sucesso!");

            } else if (opcao == 2) {

                System.out.println("\n=== CONTAS CADASTRADAS ===");

                for (Conta conta : contas) {
                    conta.exibirConta();
                }

            } else if (opcao == 3) {

                System.out.print("Número da conta: ");
                int numero = scanner.nextInt();

                System.out.print("Valor do depósito: ");
                double valor = scanner.nextDouble();

                for (Conta conta : contas) {

                    if (conta.numeroConta == numero) {
                        conta.depositar(valor);
                    }
                }

            } else if (opcao == 4) {

                System.out.print("Número da conta: ");
                int numero = scanner.nextInt();

                System.out.print("Valor do saque: ");
                double valor = scanner.nextDouble();

                for (Conta conta : contas) {

                    if (conta.numeroConta == numero) {
                        conta.sacar(valor);
                    }
                }

            } else if (opcao == 5) {

                System.out.println("Sistema encerrado.");
                break;

            } else {

                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
