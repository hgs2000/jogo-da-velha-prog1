package jogodavelha.backend;

/**
 * @author vicbona (Victor Bona) e hstarosky (Henrique Starosky)
 */
public class Jogador {

    private String nome;
    private Face faceEscolhida;
    private boolean quemJoga = false;

    public Jogador(String nome, Face faceEscolhida) {
        this.nome = nome;
        this.faceEscolhida = faceEscolhida;
    }

    /**
     * Getter de nome
     *
     * @return nome do Jogador
     */
    public String getNome() {
        return nome;
    }

    /**
     * Setter de nome
     *
     * @param nome o nome a ser definido
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Getter de face
     *
     * @return face do jogador
     */
    public Face getFaceEscolhida() {
        return faceEscolhida;
    }

    /**
     * Setter de faceEscolhida
     *
     * @param faceEscolhida a face que o jogador usará
     */
    public void setFaceEscolhida(Face faceEscolhida) {
        this.faceEscolhida = faceEscolhida;
    }

    /**
     * Getter de quemJoga
     *
     * @return
     */
    public boolean isQuemJoga() {
        return quemJoga;
    }

    /**
     * setter de quemJoga
     *
     * @param quemJoga
     */
    public void setQuemJoga(boolean quemJoga) {
        this.quemJoga = quemJoga;
    }

}
