package jogodavelha.backend;

/**
 *
 * @author vicbona
 */
public class Jogador {

    private String nome;
    private Face faceEscolhida;
    private boolean quemJoga;

    public Jogador(String nome, Face faceEscolhida) {
        this.nome = nome;
        this.faceEscolhida = faceEscolhida;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Face getFaceEscolhida() {
        return faceEscolhida;
    }

    public void setFaceEscolhida(Face faceEscolhida) {
        this.faceEscolhida = faceEscolhida;
    }

    public boolean isQuemJoga() {
        return quemJoga;
    }

    public void setQuemJoga(boolean quemJoga) {
        this.quemJoga = quemJoga;
    }
    

}
