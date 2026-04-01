import java.util.Random;
import java.util.Scanner;

public class Atividades_Aula05 {
        public static void main(String[] args) {
        /*//Exercício01
        System.out.println();
        System.out.println("==================");
        System.out.println("Exercício01:");


        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }*/
            //Exercício02
/*        System.out.println();
        System.out.println("==================");
        System.out.println("Exercício02:");

        int num1Ex02 = 10;
        int contador = 0;
        int resultado = 0;

        while(contador <= num1Ex02){

            resultado = num1Ex02 - contador;
            contador++;
            System.out.println(resultado);
        }
        //Exercício03
        System.out.println();
        System.out.println("==================");
        System.out.println("Exercício03:");

      for(int i = 0; i <= 20; i = i + 2){
          System.out.println("i = " + i);
      }
        //Exercício04*/
/*
        System.out.println();
        System.out.println("==================");
        System.out.println("Exercício04:");

        int num1Ex04 = 0;
        for(int i = 0; i <= 100; i++) {
         num1Ex04 = num1Ex04 + i;
        }
        System.out.printf("O resultado é: %s ", num1Ex04);
*/

/*        //Exercício05
        System.out.println();
        System.out.println("==================");
        System.out.println("Exercício05:");


        Scanner sc = new Scanner(System.in);

        int numero = 5;
        int resultado = 0;

        for(int i = 1; i <= 10; i++){
            resultado = numero * i;
            System.out.printf("\n %s * %s = %s", numero, i, resultado);
        }*/
        /*//Exercício06
        System.out.println();
        System.out.println("==================");
        System.out.println("Exercício06:");

        int numEx06 = 0;
        int contador = 0;
        do{
            contador++;
            System.out.println(contador);
        }while(contador < 5);
*/
/*
        //Exercício07
        System.out.println();
        System.out.println("==================");
        System.out.println("Exercício07:");

       int numEx07 = 0;

        for(int i = 0; i <= 50; i = i + 2){
            numEx07 = numEx07 + i;
            System.out.println(numEx07);
        }
        System.out.printf("O resultado é %s: ", numEx07);
*/

/*        //Exercício08
        System.out.println();
        System.out.println("==================");
        System.out.println("Exercício08:");

        int numFatorial = 5;
        int resultado = 1;

        for(int i = numFatorial; i >= 1; i--){
            resultado = resultado * i;
        }
        System.out.printf("\n %s", resultado);*/


/*
        //Exercício09
        System.out.println();
        System.out.println("==================");
        System.out.println("Exercício09:");

        int quantidade = 10;
        int soma = 0;


        for(int i = 0; i <= quantidade; i++){
            soma += i;
            System.out.printf("\n %s", soma);
        }
        double media = soma / quantidade;
        System.out.printf("\n O total é: %s e a média é: %f", soma, media);*/

/*
        //Exercício10
        System.out.println();
        System.out.println("==================");
        System.out.println("Exercício10:");

        int numEx10 = 50;

        for(int i = 0; i <= numEx10; i++){
             if (i % 3 == 0){
                     System.out.println(i);
             }
        }

*/
/*

        //Desafio01
        System.out.println();
        System.out.println("==================");
        System.out.println("Desafio01:");

        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        do {
            opcao = sc.nextInt();

        } while (opcao != 0);
    }
*/


/*//Desafio02
        System.out.println();
        System.out.println("==================");
        System.out.println("Desafio02:");

        int opcaoDesa02;
        int numDesa02 = 0;
        int total;

        System.out.println("Digite um número diferente de 0 para realizar a soma, depois encerre com '0'.");
        Scanner desa02 = new Scanner(System.in);
        do{
            opcaoDesa02 = desa02.nextInt();
            total = numDesa02 += opcaoDesa02;

        }while (opcaoDesa02 != 0);

        if (opcaoDesa02 == 0){
            System.out.printf("O programa foi encerrado e o total é: %s.", total);
        }*/


/*//Desafio03
        System.out.println();
        System.out.println("==================");
        System.out.println("Desafio03:");

        Random rc = new Random();
        Scanner scDesa03 = new Scanner(System.in);

        System.out.println("Digite uma das opções abaixo: ");
        System.out.println("1 - Mensagem.");
        System.out.println("2 - Número aleatório.");
        System.out.println("0 - Parar programa.");

        int numDesa03;
        int opcaoDesa03;

        do{
            opcaoDesa03 = scDesa03.nextInt();

        switch (opcaoDesa03) {
            case 1:
                System.out.println("Olá");
                break;
            case 2:
                if (opcaoDesa03 == 2) {
                    numDesa03 = rc.nextInt(100);
                    System.out.printf("Número aleatório: %s \n", numDesa03);

                }else{
                        opcaoDesa03 = 9;
                    }
                break;
            case 0:
                break;
            default:
                System.out.println("Opção incorreta.");
            }
        }while (opcaoDesa03 != 0);

        if (opcaoDesa03 == 0){
            System.out.println("Programa Encerrado.");
        }*/

            //Desafio04
            System.out.println();
            System.out.println("==================");
            System.out.println("Desafio04:");

            Scanner scDesa04 = new Scanner(System.in);
            int numFixo = 7;
            int numUsuario;
            int tentativas = 0;

            System.out.println("Tente acertar o número para encerrar o programa: ");
            numUsuario = scDesa04.nextInt();

            while (numUsuario != numFixo){
                System.out.println("Tente novamente!");
                numUsuario = scDesa04.nextInt();
                tentativas++;
            }
            if (numUsuario == numFixo){
                System.out.printf("Acertou, parabéns! Com um total de %s tentativas.", tentativas);
            }








        }
    }



