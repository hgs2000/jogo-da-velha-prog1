package jogodavelha.frontend;

import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import jogodavelha.backend.Jogador;

/**
 *
 * @author vicbona (Victor Bona) & hstarosky (Henrique Starosky)
 */
public class MainMenu extends javax.swing.JFrame {

    private boolean hasIa = false;
    private Jogador jogadores[] = new Jogador[2];
    private EscolhaPlayers pvpDialog;
    private EscolhaPlayerVsIA pvcDialog;
    private FrameJogo frameJogo;

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pvp = new javax.swing.JButton();
        pvc = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jogarBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        modoDeJogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pvp.setText("PLAYER VS PLAYER");
        pvp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pvpActionPerformed(evt);
            }
        });

        pvc.setText("PLAYER VS PC");
        pvc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pvcActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("JOGO DA VELHA");

        jogarBtn.setText("JOGAR");
        jogarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogarBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Modo de jogo:");

        modoDeJogo.setText("NÃO SELECIONADO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(modoDeJogo))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pvp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pvc, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jogarBtn)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(pvp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pvc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(modoDeJogo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jogarBtn)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pvpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pvpActionPerformed

        pvpDialog = new EscolhaPlayers(new JFrame(), true);
        jogadores = pvpDialog.getJogadores();
        modoDeJogo.setText("PVP");
        pvpDialog.setVisible(true);


    }//GEN-LAST:event_pvpActionPerformed


    private void pvcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pvcActionPerformed

        pvcDialog = new EscolhaPlayerVsIA(new JFrame(), true);
        jogadores[0] = pvcDialog.getP1();
        modoDeJogo.setText("PVC");
        pvcDialog.setVisible(true);

    }//GEN-LAST:event_pvcActionPerformed

    private void jogarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogarBtnActionPerformed

        if (modoDeJogo.getText() == "PVP") {
            jogadores = pvpDialog.getJogadores();
            hasIa = false;
        } else if (modoDeJogo.getText() == "PVC") {
            jogadores = pvcDialog.getJogadores();
            hasIa = true;
        }
        if ((jogadores[0] == null) && modoDeJogo.getText() != "NÃO SELECIONADO") {
            msgErro("As configurações do modo de jogo escolhido estão incorretas \n"
                    + "favor incluir o nome dos jogadores!!!! ");
        } else if (jogadores[0] == null) {
            msgErro("Deve ser selecionado de jogo acima");
        } else {
            frameJogo = new FrameJogo(jogadores, hasIa);
            frameJogo.setVisible(true);
            this.setVisible(false);
        }

    }//GEN-LAST:event_jogarBtnActionPerformed

    /**
     * Mensagem de erro
     *
     * @param mensagem
     */
    public void msgErro(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem,
                "Erro", JOptionPane.ERROR_MESSAGE);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jogarBtn;
    private javax.swing.JLabel modoDeJogo;
    private javax.swing.JButton pvc;
    private javax.swing.JButton pvp;
    // End of variables declaration//GEN-END:variables
}
