public class Aula01 {
    //psv public static void main
    public static void main(String[] args) {

        System.out.println(5 + 5); //Processamento de dados
        System.out.println("Rafhael" + "a idade" + 23); //Concatenação
//        CTRL + SHIFT + / COMENTAR /* */
        String nome = "Rafhael";

        int idade = 23;
        System.out.printf("Meu nome é %s e minha idade é %s", nome, idade); //interpolacao
          /*%s = String
            %d = inteiros
            %f = double
            */

/*  PowerShell comandos para controle de diretórios;
                cd - Seleciona os arquivos
                cd + tab lista os arquivos contidos no caminho
                cd.. retorna o diretorio

    Para executar um comando via Powershell:
        cd .\IdeaProjects\
        cd .\Aula01\
        cd .\src\
        java.exe .\Aula01.jav*/

        //Entrada de dados -> Processamento de dados -> saída de dados

        double num1 = 6.7;
        int num2 = 10;
        double resultado = num1 + num2;

        System.out.printf("\n" + resultado); //Concatenado
        System.out.printf("\n" + "O resultado de num1 e num2 e %f", resultado);




    }



}
