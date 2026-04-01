import java.util.Scanner;

public class Aula04_condicionais {
    public static void main(String[] args) {

        //Condicionais -> simples; compostas; encadeadas;

        int idade = 18;
        boolean documentos = true;

        if(idade > 18 && documentos == true) {

            System.out.println("A pessoa é maior de idade");
            //Simples.
        }else {
            System.out.println("A pessoa é menor de idade");
            //Composta.
        }

        System.out.println();
        System.out.println();
        System.out.println();
    //peca um numero para o usuário e informe se esse número é possitivo, negativo ou se é zero

    Scanner sc = new Scanner(System.in);

  /*  System.out.printf("Informe um numero para validação: ");
    int numeroUsuario = sc.nextInt();

    //Processamento de dados -> estrutura condicional alinhada (Encadeada)

    if (numeroUsuario > 0 ){
        System.out.printf("O número é positivo");
    }else if (numeroUsuario < 0){
        System.out.printf("O número é negativo");
    } else{
        System.out.printf("O número é %d", numeroUsuario);
    }
*/
    //Entrada de dados.
        System.out.println("Digite a sua altura: ");
    double altura = sc.nextDouble();
        System.out.println("Digite o seu peso: ");
    double peso = sc.nextDouble();

    //Processamento de dados
    double imc = peso / (altura * altura);

    if(imc < 18.5){
        System.out.printf("Abaixo do peso, seu IMC é %f: " , imc);
    }else if(imc >= 18.5 && imc <= 24.9){
        System.out.printf("Você está saudável, o seu IMC é %f: ", imc);
    }else if(imc > 24.9 && imc <= 29.9){
        System.out.printf("Você está com sobrepeso, o seu IMC é %f: ", imc);
    }else if (imc > 29.9 && imc <= 34.9){
        System.out.printf("Você está com obesidade grau 1, e seu IMC é %f: ", imc);
    } else if (imc > 34.9 && imc <= 39.9 ){
            System.out.printf("Você está com obesidade grau 2, e seu IMC é %f: ", imc);
        } else{
        System.out.printf("Você está com obesidade grau 3, e seu IMC é %f: ", imc);
    }
    }
}
