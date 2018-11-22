package jogodavelha.backend;

import java.util.ArrayList;

/**
 * Motor de inferencia da IA do jogo.
 *
 * @author vicbona (Victor Bona) & hstarosky (Henrique Starosky)
 */
public class MotorIA {

    private int max = 0;
    private int mix = 0;
    private int nodeIndex = 0;
    ArrayList<Node> nodes = new ArrayList();

    /**
     *
     * @param table
     * @param finalNode
     * @return
     */
    public Node DepthSearch(Peca table[][], Node finalNode) {
        Peca tabuleiro[][] = table;
        Node node = null;

        return node;
    }

    /**
     *
     * @param table
     * @return
     */
    public boolean verificaVelha(Peca table[][]) {

        Peca tabuleiro[][] = table;
        boolean velha = false;
        int contador = 0;

        for (Peca[] peca : tabuleiro) {
            for (Peca p : peca) {
                if (p != null) {
                    contador++;
                }
            }
        }
        //condição de velha
        if (contador == 9) {
            velha = true;
        }
        return velha;
    }

    /**
     *
     * @param table
     * @return
     */
    public boolean verificaVitoria(Peca table[][]) {

        Peca tabuleiro[][] = table;
        boolean venceu = false;

        Peca x = new Peca();
        x.setFace(Face.X);
        Peca o = new Peca();
        x.setFace(Face.O);
        // condições horizontais
        if ((tabuleiro[0][0] == x && tabuleiro[0][1] == x && tabuleiro[0][2] == x)
                || (tabuleiro[0][0] == o && tabuleiro[0][1] == o && tabuleiro[0][2] == o)) {
            venceu = true;
        }
        if ((tabuleiro[1][0] == x && tabuleiro[1][1] == x && tabuleiro[1][2] == x)
                || (tabuleiro[1][0] == o && tabuleiro[1][1] == o && tabuleiro[1][2] == o)) {
            venceu = true;
        }
        if ((tabuleiro[2][0] == x && tabuleiro[2][1] == x && tabuleiro[2][2] == x)
                || (tabuleiro[2][0] == o && tabuleiro[2][1] == o && tabuleiro[2][2] == o)) {
            venceu = true;
        }

        //condições verticais
        if ((tabuleiro[0][0] == x && tabuleiro[1][0] == x && tabuleiro[2][0] == x)
                || (tabuleiro[0][0] == o && tabuleiro[1][0] == o && tabuleiro[2][0] == o)) {
            venceu = true;
        }
        if ((tabuleiro[0][1] == x && tabuleiro[1][1] == x && tabuleiro[2][1] == x)
                || (tabuleiro[0][1] == o && tabuleiro[1][1] == o && tabuleiro[2][1] == o)) {
            venceu = true;
        }
        if ((tabuleiro[0][2] == x && tabuleiro[1][2] == x && tabuleiro[2][2] == x)
                || (tabuleiro[0][2] == o && tabuleiro[1][2] == o && tabuleiro[2][2] == o)) {
            venceu = true;
        }

        //condições diagonais
        if ((tabuleiro[0][0] == x && tabuleiro[1][1] == x && tabuleiro[2][2] == x)
                || (tabuleiro[0][0] == o && tabuleiro[1][1] == o && tabuleiro[2][2] == o)) {
            venceu = true;
        }
        if ((tabuleiro[0][2] == x && tabuleiro[1][1] == x && tabuleiro[2][0] == x)
                || (tabuleiro[0][2] == o && tabuleiro[1][1] == o && tabuleiro[2][0] == o)) {
            venceu = true;
        }
        return venceu;
    }

}
