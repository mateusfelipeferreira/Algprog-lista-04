public class Exercicio4 {
public static void main(String[] args) {
        double populacaoA = 80000;
        double populacaoB = 200000;

        double taxaA = 0.03;
        double taxaB = 0.015;

        int anos = 0;

        while (populacaoA < populacaoB) {
            populacaoA = populacaoA + (populacaoA * taxaA);
            populacaoB = populacaoB + (populacaoB * taxaB);

            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos.");
        System.out.println("População do país A: " + (int) populacaoA);
        System.out.println("População do país B: " + (int) populacaoB);
    }
}
