import java.util.ArrayList;

class Filme {
     final private String nome;
     private Diretor diretor;
     protected ArrayList<Ator> listaDeAtores = new ArrayList<>();

    protected ArrayList<Ator> getListaDeAtores() {
        return listaDeAtores;
    }

    protected Filme(String nome) {
        this.nome = nome;
    }

    protected String getNome() {
        return nome;
    }

    protected Diretor getDiretor() {
        return diretor;
    }

    protected void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

}
