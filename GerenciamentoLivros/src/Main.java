import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ArrayList<String> teste = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//
//        String nomeUsuario = sc.next();
//
//        teste.add(nomeUsuario);
//        teste.add(0, "nomeTeste");
//        teste.add("Fernanda");
//        teste.add("Diego");
//        teste.add("Romulo");
//        teste.add("Neymar");
//
//        System.out.println(teste.size());
//
//        teste.remove("Neymar");
//        teste.remove(0);
//
//        System.out.println(teste.size());
//
//        for (String nomes : teste){
//            System.out.println(nomes);
//        }
//
//        if (teste.contains("Fernanda")){
//            System.out.println("O nome está presente na lista!");
//
//            teste.remove("Fernanda");
//        } else {
//            System.out.println("o nome não está presente na lista! ");
//        }
//
//        for (String nomes : teste){
//            System.out.println(nomes);
//        }
//
//        System.out.println("você quer remover todos os valores da lista ?");
//        String opcaoUsuario = sc.next();
//
//        if (opcaoUsuario.equals("sim")){
//            teste.clear();
//
//            System.out.println("Lista resetada com sucesso: " + teste.size());
//
//            for (String nomes : teste){
//                System.out.println(nomes);
//            }
//        }


//    C.R.U.D

        Scanner sc = new Scanner(System.in);
        GerenciadorLivros gLivros = new GerenciadorLivros();
        boolean continuarPrograma = true;
        int opcaoUsuario;
        String nomeLivro;

        do {
            System.out.println("Bem vindo ao sistema de genrenciamento dos Livros. ");
            System.out.println("1- Cadastrar Livros.");
            System.out.println("2- Listar Livros.");
            System.out.println("3- Atualizar Livros.");
            System.out.println("4- Deletar Livros.");
            System.out.println("0- Sair do programa");
            opcaoUsuario = sc.nextInt();
            int quantidadeLivros;

            switch (opcaoUsuario) {
                case 1:
                    System.out.println("Digite a quantidade de livros a inserir.");
                    quantidadeLivros = sc.nextInt();

                    sc.nextLine();

                    for (int i = 0; i < quantidadeLivros; i++) {
                        System.out.printf("Informe o %s nome", i+1);
                        nomeLivro = sc.nextLine();
                        gLivros.CadastrarLivro(nomeLivro);
                    }
                    break;
                case 2:
                    gLivros.ListarLivro();
                    break;
                case 3:
                    for (int i = 0; i < gLivros.listarLivros.size(); i++) {
                        System.out.printf("\n[%d] %s", i, gLivros.listarLivros.get(i));
                    }
                    System.out.printf("\nDigite a posição do livro na qual você quer SUBSTITUIR.");
                    sc.nextLine();
                    int posicao = sc.nextInt();

                    System.out.printf("Digite o nome do livro que queira atualizar. \n");
                    sc.nextLine();
                    nomeLivro = sc.nextLine();
                    gLivros.AtualizarLivro(posicao, nomeLivro);
                    break;
                case 4:
                    gLivros.DeletarLivro();
                    break;
                case 0:
                    continuarPrograma = false;
                    break;
                default:
                    System.out.println("Opção incorreta! Tente novamente.");
            }

        } while (continuarPrograma);

        sc.close();

    }
}
