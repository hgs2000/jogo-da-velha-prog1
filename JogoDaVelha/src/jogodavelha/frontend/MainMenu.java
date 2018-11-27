package jogodavelha.frontend;

import jogodavelha.backend.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//TODO adicionar as classes do backend afim de processar as jogadas.
public class MainMenu extends JFrame {
    //<editor-fold desc="Elementos da UI">
    private JPanel menuPrincipal;
    private JButton iniciarJogoVSJogadorButton;
    private JButton iniciarJogoVSComputadorButton;
    private JLabel titleLabel;
    //</editor-fold>

    private Jogo jogo;

    private boolean cpu = false;

    MainMenu() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(menuPrincipal);
        setTitle("TelaJogo da Velha");
        setSize(640, 480);
        iniciarJogoVSJogadorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Botão apertado: VS Jogador");
                //TODO adicionar mudança de tela onClick
                clicked();
            }
        });
        iniciarJogoVSComputadorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Botão apertado: VS CPU");
                //TODO adicionar mudança de tela onClick
                cpu = true;
                clicked();
            }
        });
    }

    private void clicked() {
        SelecaoFace sf = new SelecaoFace();
        sf.setVisible(true);
    }
}
