package jogodavelha.backend;

/**
 *
 * @author vicbona (Victor Bona) & hstarosky (Henrique Starosky)
 */
public class Node {

    private int linha;
    private int coluna;
    private int pontuacaoNode;

    /**
     * Construtor
     *
     * @param linha
     * @param coluna
     */
    public Node(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public int getPontuacaoNode() {
        return pontuacaoNode;
    }

    public void setPontuacaoNode(int pontuacaoNode) {
        this.pontuacaoNode = pontuacaoNode;
    }
    

}
