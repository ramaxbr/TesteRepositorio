import java.util.Scanner;

public class Aula04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite um numero:");
        double teste = scanner.nextDouble();

        System.out.printf("O numero que voce digitou foi: %.2f.", teste);

    }
}
