import java.util.Scanner;
public class Exercicio8 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero;
        double soma = 0;
        double media;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numero = scanner.nextDouble();

            soma = soma + numero;
        }

        media = soma / 5;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        scanner.close();
    }
}
