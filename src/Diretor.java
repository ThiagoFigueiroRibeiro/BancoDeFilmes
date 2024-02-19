import java.util.ArrayList;
class Diretor extends Pessoa{
     ArrayList<Filme> filmesDesseDiretor = new ArrayList<>();
     Diretor(String nome){super(nome);}
     void getFilmesDesseDiretor() {
        for (Filme filme : filmesDesseDiretor) {
            System.out.println("Filme: " + filme.getNome());
        }
    }
     void addFilmeAoDiretor(Filme filme) {
        filmesDesseDiretor.add(filme);
    }

}
