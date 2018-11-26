package jogodavelha.frontend;

import jogodavelha.backend.*;

import javax.swing.*;

//TODO adicionar as classes do backend afim de processar as jogadas.
public class MainMenu extends JFrame {
    //<editor-fold desc="Elementos da UI">
    private JPanel menuPrincipal;
    private JButton iniciarJogoVSJogadorButton;
    private JButton iniciarJogoVSComputadorButton;
    private JLabel titleLabel;
    //</editor-fold>

    private Jogo jogo;

    MainMenu() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(menuPrincipal);
        setTitle("TelaJogo da Velha");
        setSize(640, 480);
    }

    private void enterGame(boolean cpu) {
        if (cpu) {
            //START GAME WITH CPU
            //  Chamar a outra tela com parametro do PC
            new SelecaoFace();
            dispose();
        } else {
            //START GAME WITHOUT CPU
            //  Chamar a outra tela com parametro do player
            add(new SelecaoFace().getContentPane());
            dispose();
        }
    }
}
