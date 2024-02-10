import java.util.Scanner;

public class Menu {
    String nome;
    CatalogoDeFilmes catalogo;

    public Menu(String nome, CatalogoDeFilmes catalogo) {
        this.nome = nome;
        this.catalogo = catalogo;
    }

    // Variáveis para o método busca
    boolean achou = false;
    int posicao = 0;
    // ===============

    void program(){
        Scanner scan = new Scanner(System.in);
        while (true){
            Interface();
            int escolha = scan.nextInt();
            try {
                if      (escolha == 1) {catalogo.criarFilme();}
                else if (escolha == 2) {
                    System.out.println("Qual é o nome do filme que você procura? " );
                    Scanner newScan = new Scanner(System.in);
                    String nomeDoFilme = newScan.nextLine();
                    achou = false;
                    busca(nomeDoFilme);
                    if (achou){
                        System.out.println("Posição: " + posicao);
                        status(posicao);
                    }
                    else {
                        System.out.println("Não achei esse filme.");
                    }
                }
                else if (escolha == 3){
                    statusAll();
                }
                else if (escolha == 4){
                    System.exit(0);
                }
            }catch(Exception exception){
                System.out.println("Tente novamente.");
            }
        }
    }
     void Interface(){
         System.out.println("1 - Cadastrar Filme ");
         System.out.println("2 - Procurar Filme ");
         System.out.println("3 - Ver as informações de todos os filmes cadastrados ");
         System.out.print("Digite a opção desejada: ");
     }

    void statusAll(){
        for (int i = 0; i < catalogo.listaDeFilmes.size(); i++) {
            System.out.println("ID: " + i);
            System.out.println("Filme: " + catalogo.listaDeFilmes.get(i).getNome());
            System.out.println("Diretor: " + catalogo.listaDeFilmes.get(i).getDiretor().getNome());

            for (int j = 0; j <  catalogo.listaDeFilmes.get(i).getListaDeAtores().size(); j++) {
                System.out.println("Ator: " + catalogo.listaDeFilmes.get(i).getListaDeAtores().get(j).getNome() + " ");
            }
        }
    }
    void status(int i){
        System.out.println("Filme: " + catalogo.listaDeFilmes.get(i).getNome());
        System.out.println("Diretor: " + catalogo.listaDeFilmes.get(i).getDiretor().getNome());

        for (int j = 0; j <  catalogo.listaDeFilmes.get(i).getListaDeAtores().size(); j++) {
            System.out.println("Ator: " + catalogo.listaDeFilmes.get(i).getListaDeAtores().get(j).getNome() + " ");
        }
    }

    public void busca(String nome){
        for (int i = 0; i < catalogo.listaDeFilmes.size(); i++) {
            if(catalogo.listaDeFilmes.get(i).getNome().contains(nome)){
                posicao = i;
                achou = true;
                break;
            }
        }
    }
}
