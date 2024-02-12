import java.util.ArrayList;

class Ator {
    final private String nome;

    ArrayList<Filme> filmesDesseAtor = new ArrayList<>();

    public void getFilmesDesseAtor() {
        for (int i = 0; i < filmesDesseAtor.size(); i++) {
            System.out.println("Filme: "+ filmesDesseAtor.get(i).getNome());
        }
    }

    public void setFilmesDesseAtor(ArrayList<Filme> filmesDesseAtor) {
        this.filmesDesseAtor = filmesDesseAtor;
    }

    public void addFilmesDesseAtor(Filme filme) {
        filmesDesseAtor.add(filme);
    }

    protected Ator(String nome) {
        this.nome = nome;
    }

    protected String getNome() {
        return nome;
    }

}
