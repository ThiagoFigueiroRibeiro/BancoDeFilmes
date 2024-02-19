class Main {
    public static void main(String[] args) {
        CatalogoDeFilmes catalogo = new CatalogoDeFilmes();
        Menu menu = new Menu(catalogo);
        menu.program();
    }
}
