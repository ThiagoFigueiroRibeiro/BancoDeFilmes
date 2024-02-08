import java.util.Scanner;

public class Menu {
    static void program(){
        Scanner scan = new Scanner(System.in);
        while (true){
            Interface();
            int escolha = scan.nextInt();
            try {
                if      (escolha == 1) {CatalogoDeFilmes.criarFilme();}
                else if (escolha == 2) {
                    System.out.println("Qual é o nome do filme que você procura? " );
                    Scanner newScan = new Scanner(System.in);
                    String nomeDoFilme = newScan.nextLine();
                    //Buscador.procurar(nomeDoFilme);
                    Buscador.busca(nomeDoFilme);
                    if (Buscador.Retorno.isAchou()){
                        System.out.println("Posição: " + Buscador.Retorno.posicao);
                        Status.status(Buscador.Retorno.posicao);
                    }
                }
                else if (escolha == 3){
                    Status.statusAll();
                }
            }catch(Exception exception){
                System.out.println("Tente novamente.");
            }
        }
    }
     static void Interface(){
         System.out.println("1 - Cadastrar Filme ");
         System.out.println("2 - Procurar Filme ");
         System.out.println("3 - Ver as informações de todos os filmes cadastrados ");
         System.out.print("Digite a opção desejada: ");
     }

}
