import java.util.Scanner;

public class Aula05_loops {
    public static void main(String[] args) {

//     https://www.notion.so/senaisp/Fundamentos-de-Java-2319251860df80e7ac72eda462891bc7


        // WHILE - DO WHILE - FOR

        //WHILE
        //while (condição -> expressão (>, <, <=, ==, !=) ) -> TRUE {
        // CÓDIGO, AÇÃO, BLOCO LÓGICO A SER EXECUTADO]
        //}
//        while (false){
//            System.out.println("Olá mundo!"); //loop infito
//        }

        //DO WHILE
//        do {
//            //rodar pelo menos uma única vez
//            //bloco lógico
//            System.out.println("olá mundo!");
//        } while (true);
/*
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        double media;
        double soma = 0;

        while (contador < 4) {
            System.out.printf("informe a %sª nota: ", contador+1);
            double notaUsuario = sc.nextDouble();

            soma = notaUsuario + soma;
            contador++; // = contador = contador + 1;
        }

        media = soma / contador;
        System.out.println("A média do aluno é de: " + media);

        //De acordo com a média do aluno, verifique:
        //  se a média maior que 7 => Aprovado
        //  se a média for entre 4 e 6 => recuperação
        //  se a média for menor que 4 => reprovado
        */
/*
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        int resultado = 0;

        for(int i = 1; i <= 10; i++){
            resultado = numero * i;
            System.out.printf("\n %s * %s = %s", numero, i, resultado);
        }*/


        int[] numeros = new int[5];

        int[] lista = {10, 20, 30, 40, 50};

        int[] nome = {12, 10, 30, 50};

        System.out.println(nome[3]);








    }
}

