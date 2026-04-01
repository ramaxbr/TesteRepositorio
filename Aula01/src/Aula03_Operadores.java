public class Aula03_Operadores {

    public static void main(String[] args) {
        //Operadores de comparação.

        int a = 10 + 5 * 2 - (2 * 2) / 2;
        // 10 + 5 * 2 - 4 / 2
        // 10 + 10 - 4 / 2
        // 10 + 10 - 2
        // 20 - 2
        // 18


        double b = 5 - 4 / 2 + (16 * 0.5);
        // 5 - 4 / 2 + 8
        // 5 - 2 + 8
        // 3 + 8
        // 11


        System.out.println(a);
        System.out.println(b);
        //true
        System.out.println(a > b);

        //false
        System.out.println(a == b);

        //false
        System.out.println(a < b);

        //True
        System.out.println(a >= b);

       //false
        System.out.println(a <= b);

        //true
        System.out.println(a != b);

        //false
        System.out.println("Rafhael" == "rafhael");

        //Comparação de Strings
        String valor1 = "Abc";
        String valor2 = "abc";

        //false
        System.out.println(valor1.equals(valor2));

        // ! = Negação, inverte o resultado booleano
        // || = Ou, faz a comparação entre os valores.

    boolean resultado = (10 > 5) && (3 < 8) || (2 > 10);
    //true
        System.out.println(resultado);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        //Nesta atividade, voce irá praticar operadores relacionais e lógicos em Java,
        //utilizando um exemplo simples com cálculo de diâmetro.

        //Você deverá armazenar o valor do raio de uma circunferência, calcular o diâmetro e,
        // em seguida, verificar algumas condições utilizando expressões booleanas.

        //considere raio = 10.0
        double raio = 10;
        double diametro = raio * 2;

        //diametro entre 10 e 20
        System.out.println(diametro >= 10 && diametro <= 20);
        //true

        //diametro maior 20;
        System.out.println(diametro > 20);
        //false

        //diametro menor que 5 ou maiior que 15
        System.out.println(diametro < 5 || diametro > 15);
        //true











    }
}
