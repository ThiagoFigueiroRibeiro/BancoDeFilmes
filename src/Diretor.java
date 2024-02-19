import java.util.ArrayList;
class Diretor extends Pessoa{
    protected ArrayList<Filme> filmesDesseDiretor = new ArrayList<>();
    protected Diretor(String nome){super(nome);}
    protected void getFilmesDesseDiretor() {
        for (Filme filme : filmesDesseDiretor) {
            System.out.println("Filme: " + filme.getNome());
        }
    }
    protected void addFilmeAoDiretor(Filme filme) {
        filmesDesseDiretor.add(filme);
    }

}
