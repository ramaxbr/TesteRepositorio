import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorLivros {

    ArrayList <String> listarLivros = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void CadastrarLivro (String nomeLivro){
        listarLivros.add(nomeLivro);
        System.out.println("Nome inserido.");

    }

    public void ListarLivro (){
        try{
            for (String listarLivro: listarLivros) {
                System.out.println(listarLivro);
            }
            System.out.println("Livros listados com sucesso.");
        }catch (Exception erroListar){
            System.out.println("Erro ao executar " + erroListar);
        }
    }

    public void AtualizarLivro ( int posicao, String nomeLivro){
        if (posicao < 0 || posicao > listarLivros.size()){
            System.out.println("Índice incorreto!");
        }else{
            listarLivros.set(posicao, nomeLivro);
            System.out.println("Livro atualizado, digite 2 para listar os livros.");
        }
    }


    public void DeletarLivro (){

        System.out.println("Digite a posição do livro na qual você quer REMOVER.");
        for (int i = 0; i < listarLivros.size(); i++) {
            System.out.printf("\n [%d] %s", i, listarLivros.get(i));
        }
        int posicao = sc.nextInt();

        if (posicao < 0 || posicao > listarLivros.size()){
            System.out.println("Índice incorreto!");
        }else{
            listarLivros.remove(posicao);
            System.out.println("Livro removido com sucesso!");
        }
    }


    }











