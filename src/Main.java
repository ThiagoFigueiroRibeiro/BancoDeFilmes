
public class Main {

    public static void main(String[] args) {
        CatalogoDeFilmes catalogo = new CatalogoDeFilmes("Catálogo");
        Menu menu = new Menu("Menu principal", catalogo);
        menu.program();
    }
}
