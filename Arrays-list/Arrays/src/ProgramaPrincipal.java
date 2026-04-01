import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        GerenciadorNomes gNomes = new GerenciadorNomes();
        Scanner scPrincipal = new Scanner(System.in);

        boolean rodarPrograma = true;
        int opcaoUsuario;

        System.out.println("Bem vindo ao meu programa!");
        do {

            System.out.println("1- Cadastrar usuário.");
            System.out.println("2- Listar usuário.");
            System.out.println("0- Sair do programa.");
            System.out.println("Digite uma das opções abaixo: ");
            opcaoUsuario = scPrincipal.nextInt();

            switch (opcaoUsuario){
                case 1:
                    gNomes.CadastrarUsuario();
                    break;
                case 2:
                    gNomes.ListarNomes();
                    break;
                case 0:
                    rodarPrograma = false;
                    System.out.println("Programa encerrado!");
                    break;
                default:
                    System.out.println("Opção incorreta, tente novamente!");
            }
        }while (rodarPrograma == true);

        scPrincipal.close();
    }
}
