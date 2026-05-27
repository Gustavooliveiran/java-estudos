import java.util.ArrayList;
import java.util.Scanner;

class Quarto {

    int numero;
    String tipo;
    boolean ocupado;

    public Quarto(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.ocupado = false;
    }

    public void reservar() {

        if (!ocupado) {
            ocupado = true;
            System.out.println("Quarto reservado com sucesso!");
        } else {
            System.out.println("Quarto já está ocupado.");
        }
    }

    public void liberar() {

        if (ocupado) {
            ocupado = false;
            System.out.println("Quarto liberado.");
        } else {
            System.out.println("O quarto já está disponível.");
        }
    }

    public void exibirDetalhes() {

        System.out.println("\nQuarto: " + numero);
        System.out.println("Tipo: " + tipo);
        System.out.println("Status: " + (ocupado ? "Ocupado" : "Disponível"));
    }
}

public class SistemaHotel {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Quarto> quartos = new ArrayList<>();

        quartos.add(new Quarto(101, "Simples"));
        quartos.add(new Quarto(102, "Luxo"));
        quartos.add(new Quarto(103, "Premium"));

        while (true) {

            System.out.println("\n===== SISTEMA HOTEL =====");
            System.out.println("1 - Listar quartos");
            System.out.println("2 - Reservar quarto");
            System.out.println("3 - Liberar quarto");
            System.out.println("4 - Sair");

            int opcao = scanner.nextInt();

            if (opcao == 1) {

                for (Quarto quarto : quartos) {
                    quarto.exibirDetalhes();
                }

            } else if (opcao == 2) {

                System.out.print("Digite o número do quarto: ");
                int numero = scanner.nextInt();

                for (Quarto quarto : quartos) {

                    if (quarto.numero == numero) {
                        quarto.reservar();
                    }
                }

            } else if (opcao == 3) {

                System.out.print("Digite o número do quarto: ");
                int numero = scanner.nextInt();

                for (Quarto quarto : quartos) {

                    if (quarto.numero == numero) {
                        quarto.liberar();
                    }
                }

            } else if (opcao == 4) {

                System.out.println("Sistema encerrado.");
                break;

            } else {

                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
