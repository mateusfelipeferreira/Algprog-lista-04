import java.util.Scanner;
public class Exercicio10 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.print("Digite o primeiro número inteiro: ");
        numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        numero2 = scanner.nextInt();

        System.out.println("Números no intervalo:");

        if (numero1 <= numero2) {
            for (int i = numero1; i <= numero2; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = numero1; i >= numero2; i--) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
