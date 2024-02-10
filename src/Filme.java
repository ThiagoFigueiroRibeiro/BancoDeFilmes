import java.util.ArrayList;

public class Filme {
     String nome;
     Diretor diretor;
     ArrayList<Ator> listaDeAtores = new ArrayList<>();

    public ArrayList<Ator> getListaDeAtores() {
        return listaDeAtores;
    }

    //public void addAtor(Ator ator){
    //    listaDeAtores.add(ator);
    //    for (int i = 0 ; i <  listaDeAtores.size(); i++) {
    //        System.out.println(listaDeAtores.get(i).getNome());
    //    }
    //}

    // public void setListaDeAtores(ArrayList<Ator> listaDeAtores) {
    //    this.listaDeAtores = listaDeAtores;
    //}

    Filme(String nome) {
        this.nome = nome;
    }

    String getNome() {
        return nome;
    }

    //void setNome(String nome) {
    //    this.nome = nome;
    //}

     Diretor getDiretor() {
        return diretor;
    }

    void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    //void status(){
    //    System.out.println("Nome do filme: " + getNome());
    //    System.out.println("Nome do diretor: " + getDiretor().getNome());
    //    System.out.print("Nome dos atores: ");
    //    for (int i = 0 ; i <  listaDeAtores.size(); i++) {
    //         System.out.print( listaDeAtores.get(i).nome+ " ");
    //    }
    //    System.out.println("");
    //}

}
