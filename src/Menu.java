import java.util.Scanner;

class Menu {
    protected CatalogoDeFilmes catalogo;

    protected  Menu(CatalogoDeFilmes catalogo) {
        this.catalogo = catalogo;
    }

    // Variáveis para o método busca
    protected boolean achou = false;
    protected int posicao = 0;
    // ===============

    protected void program(){
        Scanner scan = new Scanner(System.in);
        while (true){
            Interface();
            String escolha = scan.nextLine();
            try {
                switch (escolha) {
                    case "1" -> catalogo.criarFilme();
                    case "2" -> {
                        System.out.println("Qual é o nome do filme que você procura? ");
                        Scanner newScan = new Scanner(System.in);
                        String nomeDoFilme = newScan.nextLine();
                        achou = false;
                        buscaFilme(nomeDoFilme);
                        if (achou) {
                            System.out.println("Posição: " + posicao);
                            status(posicao);
                        } else {
                            System.out.println("Não achei esse filme.");
                        }
                    }
                    case "3" -> {
                        System.out.println("Qual é o nome do ator que você procura? ");
                        Scanner scanAtor = new Scanner(System.in);
                        String nomeDoAtor = scanAtor.nextLine();
                        achou = false;
                        for (int i = 0; i < catalogo.listaDeAtoresGeral.size(); i++) {
                            if (catalogo.listaDeAtoresGeral.get(i).getNome().equals(nomeDoAtor)) {
                                catalogo.listaDeAtoresGeral.get(i).getFilmesDesseAtor();
                                achou = true;
                            }
                        }
                        if (!achou) {
                            System.out.println("Não achei esse ator.");
                        }
                    }
                    case "4" -> {
                        System.out.println("Qual é o nome do diretor que você procura? ");
                        Scanner scanDiretor = new Scanner(System.in);
                        String nomeDoDiretor = scanDiretor.nextLine();
                        achou = false;
                        for (int i = 0; i < catalogo.listaDeDiretoresGeral.size(); i++) {
                            if (catalogo.listaDeDiretoresGeral.get(i).getNome().equals(nomeDoDiretor)) {
                                catalogo.listaDeDiretoresGeral.get(i).getFilmesDesseDiretor();
                                achou = true;
                            }
                        }
                        if (!achou) {
                            System.out.println("Não achei esse diretor.");
                        }
                    }
                    case "5" -> statusAll();
                    case "0" -> {
                        scan.close();
                        System.exit(0);
                    }
                    default -> System.out.println("Tente novamente.");
                }
            }catch(Exception E){
                System.out.println("Tente novamente.");
            }
        }
    }
    protected void Interface(){
         System.out.println("1 - Cadastrar Filme ");
         System.out.println("2 - Procurar Filme ");
         System.out.println("3 - Procurar Ator ");
         System.out.println("4 - Procurar Diretor ");
         System.out.println("5 - Ver as informações de todos os filmes cadastrados ");
         System.out.println("0 - Sair do Programa ");
         System.out.println("Atores cadastrados: " + catalogo.listaDeAtoresGeral.size());
         System.out.println("Filmes cadastrados: " + catalogo.listaDeFilmes.size());
         System.out.println("Diretores cadastrados: " + catalogo.listaDeDiretoresGeral.size());
         System.out.print("Digite a opção desejada: ");

     }

    protected void statusAll(){
        for (int i = 0; i < catalogo.listaDeFilmes.size(); i++) {
            System.out.println("ID: " + i);
            System.out.println("Filme: " + catalogo.listaDeFilmes.get(i).getNome());
            System.out.println("Diretor: " + catalogo.listaDeFilmes.get(i).getDiretor().getNome());

            for (int j = 0; j <  catalogo.listaDeFilmes.get(i).getListaDeAtores().size(); j++) {
                System.out.println("Ator: " + catalogo.listaDeFilmes.get(i).getListaDeAtores().get(j).getNome() + " ");
            }
        }
    }
    protected void status(int i){
        System.out.println("Filme: " + catalogo.listaDeFilmes.get(i).getNome());
        System.out.println("Diretor: " + catalogo.listaDeFilmes.get(i).getDiretor().getNome());

        for (int j = 0; j <  catalogo.listaDeFilmes.get(i).getListaDeAtores().size(); j++) {
            System.out.println("Ator: " + catalogo.listaDeFilmes.get(i).getListaDeAtores().get(j).getNome() + " ");
        }
    }

    protected  void buscaFilme(String nome){
        for (int i = 0; i < catalogo.listaDeFilmes.size(); i++) {
            if(catalogo.listaDeFilmes.get(i).getNome().contains(nome)){
                posicao = i;
                achou = true;
                break;
            }
        }
    }

}
