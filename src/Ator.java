import java.util.ArrayList;

class Ator {
    final private String nome;

    protected ArrayList<Filme> filmesDesseAtor = new ArrayList<>();

    protected void getFilmesDesseAtor() {
        for (Filme filme : filmesDesseAtor) {
            System.out.println("Filme: " + filme.getNome());
        }
    }
    protected void addFilmesDesseAtor(Filme filme) {
        filmesDesseAtor.add(filme);
    }

    protected Ator(String nome) {
        this.nome = nome;
    }

    protected String getNome() {
        return nome;
    }

}
