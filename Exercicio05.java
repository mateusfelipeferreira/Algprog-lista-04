import java.util.Scanner;
public class Exercicio5 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char continuar;

        do {
            double populacaoA;
            double populacaoB;
            double taxaA;
            double taxaB;
            int anos = 0;

            do {
                System.out.print("Digite a população do país A: ");
                populacaoA = scanner.nextDouble();

                if (populacaoA <= 0) {
                    System.out.println("Erro: a população deve ser maior que zero.");
                }

            } while (populacaoA <= 0);

            do {
                System.out.print("Digite a população do país B: ");
                populacaoB = scanner.nextDouble();

                if (populacaoB <= 0) {
                    System.out.println("Erro: a população deve ser maior que zero.");
                }

            } while (populacaoB <= 0);

            do {
                System.out.print("Digite a taxa de crescimento do país A (%): ");
                taxaA = scanner.nextDouble();

                if (taxaA < 0) {
                    System.out.println("Erro: a taxa de crescimento não pode ser negativa.");
                }

            } while (taxaA < 0);

            do {
                System.out.print("Digite a taxa de crescimento do país B (%): ");
                taxaB = scanner.nextDouble();

                if (taxaB < 0) {
                    System.out.println("Erro: a taxa de crescimento não pode ser negativa.");
                }

            } while (taxaB < 0);

            taxaA = taxaA / 100;
            taxaB = taxaB / 100;

            while (populacaoA < populacaoB) {
                populacaoA = populacaoA + (populacaoA * taxaA);
                populacaoB = populacaoB + (populacaoB * taxaB);

                anos++;

                if (taxaA <= taxaB && populacaoA < populacaoB) {
                    break;
                }
            }

            if (populacaoA >= populacaoB) {
                System.out.println("\nSerão necessários " + anos + " anos.");
                System.out.println("População final de A: " + (int) populacaoA);
                System.out.println("População final de B: " + (int) populacaoB);
            } else {
                System.out.println("\nO país A não conseguirá ultrapassar o país B.");
            }

            System.out.print("\nDeseja realizar outra operação? (s/n): ");
            continuar = scanner.next().toLowerCase().charAt(0);

        } while (continuar == 's');

        System.out.println("Programa encerrado.");

        scanner.close();
    }
}
