import java.util.Scanner;

public class Aula02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Instanciando a funcao
        System.out.println("Olá, informe o seu nome:");
        String nomeUsuario = scanner.nextLine().toUpperCase();

        System.out.printf("Agora informe a sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Agora informe a sua altura:");
        double altura = scanner.nextDouble();


        System.out.printf("\n Seja bem vindo ao sistema %s, a sua idade e %d e sua altura e %f", nomeUsuario, idade, altura);

        scanner.close();




    }

}
