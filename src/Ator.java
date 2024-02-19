import java.util.ArrayList;
class Ator extends Pessoa{
    protected ArrayList<Filme> filmesDesseAtor = new ArrayList<>();
    protected Ator(String nome){super(nome);}
    protected void getFilmesDesseAtor() {
        for (Filme filme : filmesDesseAtor) {
            System.out.println("Filme: " + filme.getNome());
        }
    }
    protected void addFilmesDesseAtor(Filme filme) {
        filmesDesseAtor.add(filme);
    }
}
