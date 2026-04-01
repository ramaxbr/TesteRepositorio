//Exercicio01

/*criar um programa que:
    1 - peca dois numeros
    2 - mostre: soma, subtracao, multiplicacao, divisao
    3 - Leia duas notas exiba a media
    4 - DESAFIO: Leia o nome, idade e altura de uma pessoa e exiba no formato
        nome: ana | idade: 20 anos | Altura: 1.65 m"*/


import java.util.Scanner;

public class Aula03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite dois numeros abaixo:" + "\n");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        double divisao = num1 / num2;
        double media = soma / 2;


        System.out.printf("Somando os numeros o resultado e: " + soma + "\n");
        System.out.printf("Subtraindo os numeros o resultado e: " + subtracao + "\n");
        System.out.printf("Multiplicando os numeros o resultado e: " + multiplicacao + "\n");
        System.out.printf("Dividindo os numeros o resultado e: " + divisao + "\n");
        System.out.printf("A media do resultado e: " + media + "\n");


        System.out.println();
        System.out.println();
        System.out.println();
       /* 4 - DESAFIO: Leia o nome, idade e altura de uma pessoa e exiba no formato
        nome: ana | idade: 20 anos | Altura: 1.65 m"*/

        System.out.printf("Digite o seu nome: " + "\n");
        String nome = scanner.next();

        System.out.printf("Digite a sua idade: " + "\n");
        int idade = scanner.nextInt();

        System.out.printf("Digite a sua altura: " + "\n");
        double altura = scanner.nextDouble();

        System.out.printf("\n" + "Nome: %s | idade: %d anos | Altura: %.2f m", nome, idade, altura);


        //CALCULAR O IMC DO USUARIO DO SEU PROGRAMA

        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("Vamos calcular o seu IMC!");
        System.out.printf("Digite o seu peso: ");

        int peso = scanner.nextInt();

        System.out.printf("Digite a sua altura: ");

        double alturaImc = scanner.nextDouble();

        double imc = peso / (alturaImc * alturaImc);

        System.out.printf("O seu IMC e %.1f ", imc);






    }
}
