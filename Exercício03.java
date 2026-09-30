import java.util.Scanner;
public class Exercicio3 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        char sexo;
        char estadoCivil;

       do {
            System.out.print("Digite o nome: ");
            nome = scanner.nextLine();

            if (nome.length() <= 3) {
                System.out.println("Erro: o nome deve ter mais de 3 caracteres.");
            }

        } while (nome.length() <= 3);

        do {
            System.out.print("Digite a idade: ");
            idade = scanner.nextInt();

            if (idade < 0 || idade > 150) {
                System.out.println("Erro: a idade deve estar entre 0 e 150.");
            }

        } while (idade < 0 || idade > 150);

        do {
            System.out.print("Digite o salário: ");
            salario = scanner.nextDouble();

            if (salario <= 0) {
                System.out.println("Erro: o salário deve ser maior que zero.");
            }

        } while (salario <= 0);

        do {
            System.out.print("Digite o sexo (f/m): ");
            sexo = scanner.next().toLowerCase().charAt(0);

            if (sexo != 'f' && sexo != 'm') {
                System.out.println("Erro: o sexo deve ser 'f' ou 'm'.");
            }

        } while (sexo != 'f' && sexo != 'm');

        do {
            System.out.print("Digite o estado civil (s/c/v/d): ");
            estadoCivil = scanner.next().toLowerCase().charAt(0);

            if (estadoCivil != 's' && estadoCivil != 'c'
                    && estadoCivil != 'v' && estadoCivil != 'd') {
                System.out.println("Erro: o estado civil deve ser 's', 'c', 'v' ou 'd'.");
            }

        } while (estadoCivil != 's' && estadoCivil != 'c'
                && estadoCivil != 'v' && estadoCivil != 'd');

        System.out.println("\nDados cadastrados com sucesso!");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);

        scanner.close();
    }
}
