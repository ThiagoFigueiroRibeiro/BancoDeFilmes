import java.util.Scanner;
class Menu {
    protected CatalogoDeFilmes catalogo;
    // Variáveis para o método busca
    protected boolean achou = false;
    protected int posicao = 0;
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    protected  Menu(CatalogoDeFilmes catalogo) {
        this.catalogo = catalogo;
    }
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
                        String nomeDoFilme = newScan.nextLine().toUpperCase();
                        achou = false;
                        buscaFilme(nomeDoFilme);
                        if (achou) {
                            System.out.println(ANSI_YELLOW + "Posição: "  + posicao + ANSI_RESET);
                            status(posicao);
                            System.out.println();
                        } else {
                            System.out.println(ANSI_YELLOW + "Não achei esse filme." + ANSI_RESET);
                            System.out.println();
                        }
                    }
                    case "3" -> {
                        System.out.println("Qual é o nome do ator que você procura? ");
                        Scanner scanAtor = new Scanner(System.in);
                        String nomeDoAtor = scanAtor.nextLine().toUpperCase();
                        achou = false;
                        for (int i = 0; i < catalogo.listaDeAtoresGeral.size(); i++) {
                            if (catalogo.listaDeAtoresGeral.get(i).getNome().equals(nomeDoAtor)) {
                                catalogo.listaDeAtoresGeral.get(i).getFilmesDesseAtor();
                                achou = true;
                                System.out.println();
                            }
                        }
                        if (!achou) {
                            System.out.println(ANSI_YELLOW + "Não achei esse ator." + ANSI_RESET);
                            System.out.println();
                        }
                    }
                    case "4" -> {
                        System.out.println("Qual é o nome do diretor que você procura? ");
                        Scanner scanDiretor = new Scanner(System.in);
                        String nomeDoDiretor = scanDiretor.nextLine().toUpperCase();
                        achou = false;
                        for (int i = 0; i < catalogo.listaDeDiretoresGeral.size(); i++) {
                            if (catalogo.listaDeDiretoresGeral.get(i).getNome().equals(nomeDoDiretor)) {
                                catalogo.listaDeDiretoresGeral.get(i).getFilmesDesseDiretor();
                                achou = true;
                                System.out.println();
                            }
                        }
                        if (!achou) {
                            System.out.println(ANSI_YELLOW + "Não achei esse diretor." + ANSI_RESET);
                            System.out.println();
                        }
                    }
                    case "5" -> statusAll();
                    case "0" -> {
                        scan.close();
                        System.exit(0);
                    }
                    default -> System.out.println(ANSI_YELLOW + "Tente novamente." + ANSI_RESET);

                }
            }catch(Exception E){
                System.out.println(ANSI_YELLOW + "Tente novamente." + ANSI_RESET);
                System.out.println();
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
            System.out.println(ANSI_YELLOW + "ID: " + i + ANSI_RESET);
            System.out.println("Filme: " + catalogo.listaDeFilmes.get(i).getNome());
            System.out.println("Diretor: " + catalogo.listaDeFilmes.get(i).getDiretor().getNome());

            for (int j = 0; j <  catalogo.listaDeFilmes.get(i).getListaDeAtores().size(); j++) {
                System.out.println("Ator: " + catalogo.listaDeFilmes.get(i).getListaDeAtores().get(j).getNome() + " ");
            }
            System.out.println();
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
