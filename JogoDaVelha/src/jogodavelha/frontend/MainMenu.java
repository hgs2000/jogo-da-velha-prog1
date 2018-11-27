package jogodavelha.frontend;

import java.awt.Frame;
import jogodavelha.backend.Jogador;

/**
 *
 * @author vicbona (Victor Bona) & hstarosky (Henrique Starosky)
 */
public class MainMenu extends javax.swing.JFrame {

    private boolean hasIa = false;
    private Jogador jogadores[] = new Jogador[2];
    private EscolhaPlayers pvpDialog = new EscolhaPlayers(this, true);
    private EscolhaPlayerVsIA pvcDialog = new EscolhaPlayerVsIA(this, true);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pvp, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(pvc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(201, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(pvp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pvc)
                .addContainerGap(190, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pvpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pvpActionPerformed

        jogadores = pvpDialog.getJogadores();
        frameJogo = new FrameJogo(jogadores, false);
        frameJogo.setVisible(true);
        pvpDialog.setVisible(false);


    }//GEN-LAST:event_pvpActionPerformed

    private void pvcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pvcActionPerformed

        jogadores[0] = pvcDialog.getP1();
        frameJogo = new FrameJogo(jogadores, true);
        frameJogo.setVisible(true);
        pvcDialog.setVisible(false);

    }//GEN-LAST:event_pvcActionPerformed

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
    private javax.swing.JButton pvc;
    private javax.swing.JButton pvp;
    // End of variables declaration//GEN-END:variables
}
