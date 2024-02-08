public class Buscador {
    static class Retorno{
        static boolean achou;
        static int posicao;

        public Retorno(boolean achou, int posicao) {
            this.achou = achou;
            this.posicao = posicao;
        }

        public static boolean isAchou() {
            return achou;
        }

        public void setAchou(boolean achou) {
            this.achou = achou;
        }

        public int getPosicao() {
            return posicao;
        }

        public void setPosicao(int posicao) {
            this.posicao = posicao;
        }
    }
    public static Retorno busca(String nome){
        Retorno retorno = new Retorno(false, 0);
        boolean achou = false;
        int posicao = 0;
        for (int i = 0; i < CatalogoDeFilmes.listaDeFilmes.size(); i++) {
            if(CatalogoDeFilmes.listaDeFilmes.get(i).getNome().contains(nome)){
                posicao = i;
                achou = true;
                break;
            }
        }
        retorno.setPosicao(posicao);
        retorno.setAchou(achou);
        return retorno;
    }
}
