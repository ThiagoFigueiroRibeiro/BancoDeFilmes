import java.util.ArrayList;
import java.util.Scanner;

public class CatalogoDeFilmes {
    String nome;
     static ArrayList<Filme> listaDeFilmes = new ArrayList<>();

    public static void addFilme(Filme filme){
        listaDeFilmes.add(filme);
    }

    public CatalogoDeFilmes(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Filme> getFilme() {
        return listaDeFilmes;
    }

    public void setFilme(ArrayList<Filme> filme) {
        listaDeFilmes = filme;
    }

    static void criarFilme(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual é o nome do filme? ");
        String nome = scan.nextLine();
        Filme filme = new Filme(nome);

        CatalogoDeFilmes.addFilme(filme);

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
