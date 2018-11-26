package jogodavelha.frontend;

import javax.swing.*;

public class SelecaoFace extends JDialog {

    private JPanel escolhaPanel;
    private JButton xButton;
    private JButton oButton;

    public SelecaoFace() {
        add(rootPane);
        setModal(true);
        setSize(250, 100);
        setVisible(true);
    }

}
