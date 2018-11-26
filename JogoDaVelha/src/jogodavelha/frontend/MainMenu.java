package jogodavelha.frontend;

import javax.swing.*;

//TODO adicionar as classes do backend afim de processar as jogadas.
public class MainMenu extends JFrame {
    private JPanel menuPrincipal;
    private JButton iniciarJogoVSJogadorButton;
    private JButton iniciarJogoVSComputadorButton;
    private JLabel titleLabel;
    private Jogo jogo;

    MainMenu() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(menuPrincipal);
        setTitle("Jogo da Velha");
        setSize(640, 480);
    }
}
