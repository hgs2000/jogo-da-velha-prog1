package jogodavelha.backend;

/**
 * Classe principal do backend do jogo
 * @author vicbona (Victor Bona) e hstarosky (Henrique Starosky)
 */
public class Jogo {

    private Peca tabuleiro[][] = new Peca[3][3];
    private Jogador jogadores[] = new Jogador[2];
    private boolean ia = false;

    public Jogo() {
    }

    public void incluirJogador(Jogador jogador) {
        if (jogadores[0] != null) {
            jogadores[0] = jogador;
        } else {
            jogadores[1] = jogador;
        }
    }

    /**
     * O método temPeca() avalia se há uma peça no tabuleiro, conforme
     * coordenadas do tabuleiro informadas.
     *
     * @param linha
     * @param coluna
     * @return
     */
    public boolean temPeca(int linha, int coluna) {
        boolean temPeca = false;
        if (tabuleiro[linha][coluna] != null) {
            temPeca = true;
        }
        return temPeca;
    }

    /**
     * O método colocarPeca() coloca uma peça no tabuleiro. Se já houver uma
     * peça naquela posição, o método lança uma exceção(IllegalArgumentException).
     * @param peca
     * @param linha
     * @param coluna 
     */
    public void colocarPeca(Peca peca, int linha, int coluna) {
        if (tabuleiro[linha][coluna] != null) {
            throw new IllegalArgumentException("Posição do tabuleiro ja ocupada por uma peça");

        } else {
            tabuleiro[linha][coluna] = peca;
        }
    }

    /**
     * O método obterVencedor() analisa se há algum ganhador, devolvendo a
     * instância de jogador que representa este jogador;
     *
     * @return
     */
    public Jogador obterVencedor() {
        Jogador vencedor = null;

        return vencedor;
    }

    public boolean terminouJogo() {

        return true;
    }

    /**
     * O método identificarQuemJoga() retorna qual jogador tem a vez de jogar.
     *
     * @return
     */
    public Jogador identificaQuemJoga() {
        try {
            if (jogadores[0].isQuemJoga() == true) {
                return jogadores[0];
            } else {
                return jogadores[1];
            }
        } catch (Exception x) {

        }
        return null;
    }

    /**
     * o método hasIa tem como finalidade definir as configurações para que o
     * jogo opere no modo jogador vs maquina habilitando a IA do jogo e
     * definindo seus parametros
     */
    public void hasIa() {
        this.ia = true;
        Jogador ia = new Jogador("Computador", (jogadores[0].getFaceEscolhida() == Face.X) ? Face.O : Face.X);
        incluirJogador(ia);
    }

    /**
     * O método getTabuleiro() retorna o conteúdo do tabuleiro.
     * @return
     */
    public Peca[][] getTabuleiro() {
        return tabuleiro;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setTabuleiro(Peca[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public boolean isIa() {
        return ia;
    }

    public void setIa(boolean ia) {
        this.ia = ia;
    }

}
