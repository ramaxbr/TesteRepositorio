import java.util.Arrays;
import java.util.Scanner;

public class Atividades_Aula04 {
    public static void main(String[] args) {
/*//Exercicio01
        System.out.println();
        System.out.println("==================");
        System.out.println("Exercício01:");

        int numEx01 = 0;

        if(numEx01 > 0){
            System.out.printf("Este número é positivo.");
        }else if(numEx01 < 0){
            System.out.printf("Este número é negativo.");
        }else{
            System.out.printf("Este número é %d.", numEx01);
        }*/
//Exercício02
        System.out.println();
        System.out.println("==================");
        System.out.println("Exercício02:");

        Scanner Ex02 = new Scanner(System.in);

        System.out.print("Digite um número.");
        double num1Ex02 = Ex02.nextDouble();
        if(num1Ex02 % 2 == 0){
            System.out.print("O número é par.");
        }else{
            System.out.println("O número é impar");
        }

/*
//Exercício03
        System.out.println();
        System.out.println("==================");
        System.out.println("Exercício03:");
        int idade = 18;

        if(idade >= 18){
            System.out.printf("Você é de maior.");
        }else{
            System.out.printf("Você é menor de idade.");
        }
//Exercício04:
        System.out.println();
        System.out.println("==================");
        System.out.println("Exercício04:");
        int nota = 7;

        if(nota >= 7){
            System.out.printf("Aprovado.");
        }else if(nota < 7 && nota >= 5){
            System.out.printf("Recuperação.");
        }else{
            System.out.printf("Reprovado.");
        }*/
/*//Exercício05:
        System.out.println();
        System.out.println("==================");
        System.out.println("Exercício05:");

        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite dois números abaixo: ");
        double num1Ex05 = sc.nextDouble();
        double num2Ex05 = sc.nextDouble();

        if(num1Ex05 > num2Ex05){
            System.out.println("O primeiro número é maior que o segundo.");
        }else if(num1Ex05 == num2Ex05){
            System.out.println("Os números são iguais.");
        }else{
            System.out.printf("O Segundo número é maior que o primeiro.");
        }*/

/*
//Exercício06:
        System.out.println();
        System.out.println("==================");
        System.out.println("Exercício06:");

        int opcao = 0;

        switch (opcao){
            case 1:
                System.out.printf("Cadastrar.");
                break;
            case 2:
                System.out.printf("Editar.");
                break;
            case 3:
                System.out.printf("Excluir.");
                break;
            case 4:
                System.out.printf("Sair.");
                System.out.printf("Opção inválida.");
            default:
                System.out.printf("Opção inválida.");
        }
*/

/*//Exercício07:
        System.out.println();
        System.out.println("==================");
        System.out.println("Exercício07:");

        int diaDaSemana = 0;
        switch (diaDaSemana){
            case 1:
                System.out.printf("Domingo");
                break;
            case 2:
                System.out.printf("Segunda-feira");
                break;
            case 3:
                System.out.printf("Terça-feira");
                break;
            case 4:
                System.out.printf("Quarta-feira");
                break;
            case 5:
                System.out.printf("Quinta-feira");
                break;
            case 6:
                System.out.printf("Sexta-feira");
                break;
            case 7:
                System.out.printf("Sábado");
                break;
            default:
                System.out.printf("Digite um numero de 1 a 7.");
        }*/
/*        //Exercício08:
        System.out.println();
        System.out.println("==================");
        System.out.println("Exercício08:");


        Scanner ex08 = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1Ex08 = ex08.nextDouble();
        System.out.println("Digite o segundo número:");
        double num2Ex08 = ex08.nextDouble();
        System.out.printf("Digite entre: 'Soma', 'Subtracao', 'Multiplicacao' e 'Divisao'");
        String operador = ex08.next();

        double soma = num1Ex08 + num2Ex08;
        double subtracao = num1Ex08 - num2Ex08;
        double multiplicacao = num1Ex08 * num2Ex08;
        double divisao = num2Ex08 / num2Ex08;

        switch (operador){
            case "Soma":
                System.out.printf("A soma é: %f", soma);
                break;
            case "Subtracao":
                System.out.printf("A subtracao é: %f", subtracao);
                break;
            case "Multiplicacao":
                System.out.printf("A multiplicacao é: %f", multiplicacao);
                break;
            case "Divisao":
                System.out.printf("A divisao é: %f", divisao);
                break;
            default:
                System.out.printf("Digite entre: 'Soma', 'Subtracao', 'Multiplicacao' e 'Divisao'");
        }*/
        //Exercício09:
/*        System.out.println();
        System.out.println("==================");
        System.out.println("Exercício09:");

        int temperatura = 6;

        if(temperatura >= 35){
            System.out.printf("Muito Quente.");
        }else if(temperatura >= 25 && temperatura < 35){
            System.out.printf("Agradável.");
        }else if(temperatura >= 15 && temperatura < 25){
            System.out.printf("Frio.");
        }else{
            System.out.printf("Muito Frio.");
        }*/

/*        //Exercício10:
        System.out.println();
        System.out.println("==================");
        System.out.println("Exercício10:");

        Scanner ex10 = new Scanner (System.in);

        System.out.printf("Digite o usuário: ");
        String usuario = ex10.next();

        System.out.printf("Digite a senha: ");
        int senha = ex10.nextInt();
        String usuarioCorreto = "admin";

        if(usuario.equals(usuarioCorreto) && senha == 1234){
            System.out.printf("Login correto!");
        }else{
            System.out.printf("Login incorreto!");
        }*/

/*        //Desafio01:
        System.out.println();
        System.out.println("==================");
        System.out.println("Desafio01:");

        int idadeDesa01 = 18;
        boolean carteira = true;

        if(idadeDesa01 >= 18 && carteira == true){
            System.out.printf("Pode dirigir.");
        }else{
            System.out.printf("Não pode dirigir.");
        }*/


        /*//Desafio02:
        System.out.println();
        System.out.println("==================");
        System.out.println("Desafio02:");

        double notaDesa02 = 0;
        int contador = 1;

        while (contador != 0) {
            Scanner sDesafio02 = new Scanner(System.in);
            System.out.println();
            System.out.println("Digite umas das opcões:");
            System.out.println("1 - Inserir nota.");
            System.out.println("2 - Mostrar o resultado.");
            System.out.println("3 - Sair do programa.");
            int opcaoDesa02 = sDesafio02.nextInt();

            switch (opcaoDesa02) {
                case 1:
                    System.out.print("Insira uma nota: ");
                    notaDesa02 = sDesafio02.nextDouble();
                    opcaoDesa02 = 0;
                    break;
                case 2:
                    if (notaDesa02 >= 7) {
                        System.out.printf("Aprovado. Sua nota é: %f", notaDesa02);
                    } else if (notaDesa02 < 7 && notaDesa02 >= 5) {
                        System.out.printf("Recuperação. Sua nota é: %f", notaDesa02);
                    } else {
                        System.out.printf("Reprovado. Sua nota é: %f", notaDesa02);
                    }
                    break;
                case 3:
                    contador = 0;
                default:
                    System.out.printf("Nenhuma opção escolhida.");
            }
        }



*/












    }
}
