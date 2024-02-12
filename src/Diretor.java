import java.util.ArrayList;

class Diretor {
    final private String nome;

    protected ArrayList<Filme> filmesDesseDiretor = new ArrayList<>();

    protected Diretor(String nome) {
        this.nome = nome;
    }

    protected String getNome() {
        return nome;
    }

    protected void getFilmesDesseDiretor() {
        for (Filme filme : filmesDesseDiretor) {
            System.out.println("Filme: " + filme.getNome());
        }
    }

    protected void addFilmesDesseDiretor(Filme filme) {
        filmesDesseDiretor.add(filme);
    }

}
