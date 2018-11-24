package jogodavelha.backend;

import java.util.ArrayList;
import java.util.Random;

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
     * @param finalNodes
     * @param jogador
     * @return 
     */
    public Node fazJogadaIa(Peca table[][], ArrayList<Node> finalNodes, Jogador jogador) {
        Peca peca = new Peca();
        peca.setFace(jogador.getFaceEscolhida());
        Peca inimigo = new Peca();
        inimigo.setFace((peca.getFace() == Face.X) ? Face.O : Face.X);
        ArrayList<Node> nodes = finalNodes;
        Peca tabuleiro[][] = table;

        Node node = procuraJogadaPossivel(table);
        table[node.getLinha()][node.getColuna()] = peca;
        if (!verificaVitoria(table, jogador) && !verificaVelha(table)) {
            node.setPontuacaoNode(node.getPontuacaoNode() + 1);
            finalNodes.add(node);
            Node jogadaInimiga = procuraJogadaPossivel(table);
            table[jogadaInimiga.getLinha()][jogadaInimiga.getColuna()] = inimigo;
            fazJogadaIa(table, finalNodes, jogador);
        }else if (verificaVitoria(table, jogador)) {
            
        }
        return nodes.get(0);
    }

    /**
     *
     * @param table
     * @return
     */
    public Node procuraJogadaPossivel(Peca table[][]) {
        Node node = null;
        int coluna = 0;
        int linha = 0;
        Random random = new Random();
        do {
            coluna = random.nextInt(2);
            linha = random.nextInt(2);
        } while (table[coluna][linha] != null);
        node = new Node(linha, coluna);
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
    public boolean verificaVitoria(Peca table[][], Jogador jogador) {

        Peca tabuleiro[][] = table;
        boolean venceu = false;

        Peca peca = new Peca();
        peca.setFace(jogador.getFaceEscolhida());
        // condições horizontais
        if ((tabuleiro[0][0] == peca && tabuleiro[0][1] == peca && tabuleiro[0][2] == peca)) {
            venceu = true;
        }
        if ((tabuleiro[1][0] == peca && tabuleiro[1][1] == peca && tabuleiro[1][2] == peca)) {
            venceu = true;
        }
        if ((tabuleiro[2][0] == peca && tabuleiro[2][1] == peca && tabuleiro[2][2] == peca)) {
            venceu = true;
        }

        //condições verticais
        if ((tabuleiro[0][0] == peca && tabuleiro[1][0] == peca && tabuleiro[2][0] == peca)) {
            venceu = true;
        }
        if ((tabuleiro[0][1] == peca && tabuleiro[1][1] == peca && tabuleiro[2][1] == peca)) {
            venceu = true;
        }
        if ((tabuleiro[0][2] == peca && tabuleiro[1][2] == peca && tabuleiro[2][2] == peca)) {
            venceu = true;
        }

        //condições diagonais
        if ((tabuleiro[0][0] == peca && tabuleiro[1][1] == peca && tabuleiro[2][2] == peca)) {
            venceu = true;
        }
        if ((tabuleiro[0][2] == peca && tabuleiro[1][1] == peca && tabuleiro[2][0] == peca)) {
            venceu = true;
        }
        return venceu;
    }

}
