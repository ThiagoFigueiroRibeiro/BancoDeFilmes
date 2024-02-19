import java.util.ArrayList;
class Filme {
    final private String nome;
    private Diretor diretor;
     ArrayList<Ator> listaDeAtores = new ArrayList<>();
     Filme(String nome){this.nome = nome;}
     String getNome(){return nome;}
     Diretor getDiretor(){return diretor;}
     ArrayList<Ator> getListaDeAtores(){return listaDeAtores;}
     void setDiretor(Diretor diretor){this.diretor = diretor;}
}
