import java.util.Scanner;
public class Exercicio7 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero;
        double maior;

        System.out.print("Digite o 1º número: ");
        maior = scanner.nextDouble();

        for (int i = 2; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numero = scanner.nextDouble();

            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("O maior número é: " + maior);

        scanner.close();
    }
}
