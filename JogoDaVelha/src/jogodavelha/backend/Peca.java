package jogodavelha.backend;

/**
 *
 * @author vicbona (Victor Bona) e hstarosky (Henrique Starosky)
 */
public class Peca {
    
    Face face;

    public Peca(Face face) {
        this.face = face;
    }

    public Peca() {
    }
    
    //Getters e Setters
    
    public Face getFace() {
        return face;
    }

    public void setFace(Face face) {
        this.face = face;
    }
    
}
