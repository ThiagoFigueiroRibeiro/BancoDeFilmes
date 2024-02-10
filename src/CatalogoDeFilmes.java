import java.util.ArrayList;
import java.util.Scanner;

class CatalogoDeFilmes {
    protected ArrayList<Filme> listaDeFilmes = new ArrayList<>();

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
        String nomeNome = scan.nextLine();
        Diretor novoDiretor = new Diretor(nomeNome);
        filme.setDiretor(novoDiretor);

        System.out.println("Qual é o nome de um ator? ");
        String nomeDoAtor = scan.nextLine();
        filme.listaDeAtores.add(new Ator(nomeDoAtor));

        System.out.println("Qual é o nome de um ator? ");
        String nomeDoAtor2 = scan.nextLine();
        filme.listaDeAtores.add(new Ator(nomeDoAtor2));
    }
}
