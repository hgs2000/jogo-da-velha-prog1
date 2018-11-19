package jogodavelha.Backend;

/**
 *
 * @author vicbona
 */
public class Jogo {

    private String tabuleiro[][] = new String[3][3];
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

    public boolean temPeca(int linha, int coluna) {

        return true;
    }

    public void colocarPeca(Peca peca, int linha, int coluna) {

    }

    public Jogador obterJogador() {
        Jogador vencedor = null;

        return vencedor;
    }

    public boolean terminouJogo() {

        return true;
    }

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

    public void hasIa() {
        this.ia = true;
        Jogador ia = new Jogador("Computador", (jogadores[0].getFaceEscolhida() == Face.X) ? Face.O : Face.X);
        incluirJogador(ia);
    }

    //Getters e Setters
    public String[][] getTabuleiro() {
        return tabuleiro;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setTabuleiro(String[][] tabuleiro) {
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
