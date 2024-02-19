//
// Projeto Catálogo IMDB - Santander Coders 2023.2
// Autor: Thiago Figueiró Ribeiro
//
// O código abaixo simula um catálogo de filmes.
// Nele podemos adicionar filmes, seu diretor, seus atores.
// Após cadastro, podemos procurar as informações dos filmes, diretores e atores,
// tais como qual filmes o ator X participou, quais filmes o diretor Y dirigiu.
//
class Main {
    public static void main(String[] args) {
        CatalogoDeFilmes catalogo = new CatalogoDeFilmes();
        Menu menu = new Menu(catalogo);
        menu.program();
    }
}
