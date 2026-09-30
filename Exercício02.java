import java.util.Scanner;
public class Exercicio2 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeUsuario;
        String senha;

        do {
            System.out.print("Digite o nome de usuário: ");
            nomeUsuario = scanner.nextLine();

            System.out.print("Digite a senha: ");
            senha = scanner.nextLine();

            if (senha.equals(nomeUsuario)) {
                System.out.println("Erro: a senha não pode ser igual ao nome de usuário.");
                System.out.println("Digite as informações novamente.\n");
            }

        } while (senha.equals(nomeUsuario));

        System.out.println("Cadastro realizado com sucesso!");

        scanner.close();
    }
}
