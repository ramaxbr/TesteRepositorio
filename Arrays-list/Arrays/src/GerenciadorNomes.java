import java.util.Scanner;
public class GerenciadorNomes{

    Scanner scNomes = new Scanner(System.in);
    String[] nomes = new String[0];

    public void CadastrarUsuario (){
        String nome;
        int quantidadeNomes;

        System.out.println("Digite a quantidade de nomes:");
        quantidadeNomes = scNomes.nextInt();
        nomes = new String[quantidadeNomes];
        System.out.println("Liste os nomes dos usuários abaixo:");


        for (int i = 0; i < quantidadeNomes; i++) {
            nome = scNomes.next();
            nomes[i] = nome;
        }
        System.out.println("Nomes cadastrados!");

    }

    public void ListarNomes (){
        for (String listar : nomes){
            System.out.println(listar);
        }
    }
}

