package jogodavelha.frontend;

import javax.swing.*;

public class SelecaoFace extends JDialog {

    private JPanel escolhaPanel;
    private JButton xButton;
    private JButton oButton;

    SelecaoFace() {
        setModal(true);
        setSize(250, 100);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

}
