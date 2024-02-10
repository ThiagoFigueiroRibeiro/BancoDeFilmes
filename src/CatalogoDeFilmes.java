import java.util.ArrayList;
import java.util.Scanner;

public class CatalogoDeFilmes {
    String nome;
    public ArrayList<Filme> listaDeFilmes = new ArrayList<>();

    public CatalogoDeFilmes(String nome) {
        this.nome = nome;
    }

    public void addFilme(Filme filme){
        listaDeFilmes.add(filme);
    }

    void criarFilme(){
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
