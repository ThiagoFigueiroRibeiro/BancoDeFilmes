public class Status {

    static void statusAll(){
        for (int i = 0; i < Main.catalogo.listaDeFilmes.size(); i++) {
            System.out.println("ID: " + i);
            System.out.println("Filme: " + Main.catalogo.listaDeFilmes.get(i).getNome());
            System.out.println("Diretor: " + Main.catalogo.listaDeFilmes.get(i).getDiretor().getNome());

            for (int j = 0; j <  Main.catalogo.listaDeFilmes.get(i).getListaDeAtores().size(); j++) {
                System.out.println("Ator: " + Main.catalogo.listaDeFilmes.get(i).getListaDeAtores().get(j).getNome() + " ");
            }
        }
    }
    static void status(int i){
        System.out.println("Filme: " + Main.catalogo.listaDeFilmes.get(i).getNome());
        System.out.println("Diretor: " + Main.catalogo.listaDeFilmes.get(i).getDiretor().getNome());

        for (int j = 0; j <  Main.catalogo.listaDeFilmes.get(i).getListaDeAtores().size(); j++) {
            System.out.println("Ator: " + Main.catalogo.listaDeFilmes.get(i).getListaDeAtores().get(j).getNome() + " ");
        }
    }
}
