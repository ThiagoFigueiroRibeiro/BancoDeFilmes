import java.util.ArrayList;
class Ator extends Pessoa{
     ArrayList<Filme> filmesDesseAtor = new ArrayList<>();
     Ator(String nome){super(nome);}
     void getFilmesDesseAtor() {
        for (Filme filme : filmesDesseAtor) {
            System.out.println("Filme: " + filme.getNome());
        }
    }
     void addFilmesDesseAtor(Filme filme) {
        filmesDesseAtor.add(filme);
    }
}
