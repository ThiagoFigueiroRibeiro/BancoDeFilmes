import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class CatalogoDeFilmes {
    protected ArrayList<Filme> listaDeFilmes = new ArrayList<>();
    protected ArrayList<Ator> listaDeAtoresGeral = new ArrayList<>();

    protected CatalogoDeFilmes() {
    }

    protected void addFilme(Filme filme){
        listaDeFilmes.add(filme);
    }

    protected void criarFilme(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual é o nome do filme? ");
        String nome = scan.nextLine();
        Filme filme = new Filme(nome);
        addFilme(filme);

        System.out.println("Qual é o nome do diretor? ");
        String nomeDiretor = scan.nextLine();
        Diretor novoDiretor = new Diretor(nomeDiretor);
        filme.setDiretor(novoDiretor);

        System.out.println("Quantos atores você deseja cadastrar pra esse filme?");
        //try{
        //    int numeroDeAtores = scan.nextInt();
        //}
        //catch (Throwable t){
        //    System.out.println("Por favor, escreva um número");
        //}

        System.out.println("Qual é o nome de um ator? ");
        String nomeDoAtor = scan.nextLine();
        Ator atorAtual = new Ator(nomeDoAtor);
        filme.listaDeAtores.add(atorAtual);
        listaDeAtoresGeral.add(atorAtual);
        listaDeAtoresGeral.getLast().addFilmesDesseAtor(filme);

        if(listaDeAtoresGeral.size() > 1) {
            for (int i = 0; i < listaDeAtoresGeral.size() - 1; i++) {
                if (listaDeAtoresGeral.get(i).getNome().equals(atorAtual.getNome()) && !listaDeAtoresGeral.isEmpty()) {
                    listaDeAtoresGeral.get(i).addFilmesDesseAtor(filme);
                    listaDeAtoresGeral.removeLast();
                    break;
                }
            }
        }
    }
}
