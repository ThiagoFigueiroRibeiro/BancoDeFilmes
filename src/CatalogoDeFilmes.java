import java.util.ArrayList;
import java.util.Scanner;

class CatalogoDeFilmes {
    protected ArrayList<Filme> listaDeFilmes = new ArrayList<>();
    protected ArrayList<Ator> listaDeAtoresGeral = new ArrayList<>();
    protected ArrayList<Diretor> listaDeDiretoresGeral = new ArrayList<>();
    protected CatalogoDeFilmes(){}
    protected void addFilme(Filme filme){
        listaDeFilmes.add(filme);
    }
    protected void criarFilme(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual é o nome do filme? ");
        String nome = scan.nextLine().toUpperCase();
        Filme filme = new Filme(nome);
        addFilme(filme);

        System.out.println("Qual é o nome do diretor? ");
        String nomeDiretor = scan.nextLine().toUpperCase();
        Diretor novoDiretor = new Diretor(nomeDiretor);
        filme.setDiretor(novoDiretor);
        listaDeDiretoresGeral.add(novoDiretor);
        novoDiretor.addFilmeAoDiretor(filme);
        if(listaDeDiretoresGeral.size() > 1) {
            for (int i = 0; i < listaDeDiretoresGeral.size() - 1; i++) {
                if (listaDeDiretoresGeral.get(i).getNome().equals(novoDiretor.getNome()) && !listaDeDiretoresGeral.isEmpty()) {
                    listaDeDiretoresGeral.get(i).addFilmeAoDiretor(filme);
                    listaDeDiretoresGeral.removeLast();
                    break;
                }
            }
        }

        System.out.println("Quantos atores você deseja cadastrar pra esse filme?");
        Scanner scanInt = new Scanner(System.in);
        int numeroDeAtores = scanInt.nextInt();
        for (int j = 0; j< numeroDeAtores; j++){
            System.out.println("Qual é o nome do ator? ");
            String nomeDoAtor = scan.nextLine().toUpperCase();
            Ator atorAtual = new Ator(nomeDoAtor);
            filme.listaDeAtores.add(atorAtual);
            listaDeAtoresGeral.add(atorAtual);
            listaDeAtoresGeral.getLast().addFilmesDesseAtor(filme);

            if(listaDeAtoresGeral.size() > 1) {
                for (int i = 0; i < listaDeAtoresGeral.size() - 1; i++) {
                    if (listaDeAtoresGeral.get(i).getNome().equals(atorAtual.getNome()) && !listaDeAtoresGeral.isEmpty()) {
                        listaDeAtoresGeral.get(i).addFilmesDesseAtor(filme);
                        listaDeAtoresGeral.removeLast();
                        break;
                    }
                }
            }
        }
    }
}