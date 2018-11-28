package jogodavelha.frontend;

import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import jogodavelha.backend.Face;
import jogodavelha.backend.Jogador;
import jogodavelha.backend.Jogo;

/**
 *
 * @author vicbona (Victor Bona) & hstarosky (Henrique Starosky)
 */
public class FrameJogo extends javax.swing.JFrame {

    private Jogador[] jogadores;
    private Jogo jogo;
    boolean hasIa;
    JToggleButton tabuleiro[][];

    public FrameJogo(Jogador[] jogadores, boolean hasIa) {
        this.tabuleiro = new JToggleButton[3][3];
        initComponents();
        this.setLocationRelativeTo(null);
        this.jogadores = jogadores;
        jogo = new Jogo();
        this.hasIa = hasIa;
        jogo.incluirJogador(jogadores[0]);
        if (this.hasIa) {
            jogo.hasIa();
        } else {
            jogo.incluirJogador(jogadores[1]);
        }
        nome1.setText(jogo.getJogadores()[0].getNome());
        face1.setText(jogo.getJogadores()[0].getFaceEscolhida().toString());
        nome2.setText(jogo.getJogadores()[1].getNome());
        face2.setText(jogo.getJogadores()[1].getFaceEscolhida().toString());
        tabuleiro[0][0] = b00;
        tabuleiro[0][1] = b01;
        tabuleiro[0][2] = b02;
        tabuleiro[1][0] = b10;
        tabuleiro[1][1] = b11;
        tabuleiro[1][2] = b12;
        tabuleiro[2][0] = b20;
        tabuleiro[2][1] = b21;
        tabuleiro[2][2] = b22;
        if (hasIa && jogo.getJogadores()[1].getFaceEscolhida() == Face.X) {
            jogadaIa();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nome1 = new javax.swing.JLabel();
        face1 = new javax.swing.JLabel();
        nome2 = new javax.swing.JLabel();
        face2 = new javax.swing.JLabel();
        b00 = new javax.swing.JToggleButton();
        b01 = new javax.swing.JToggleButton();
        b02 = new javax.swing.JToggleButton();
        b10 = new javax.swing.JToggleButton();
        b11 = new javax.swing.JToggleButton();
        b12 = new javax.swing.JToggleButton();
        b20 = new javax.swing.JToggleButton();
        b21 = new javax.swing.JToggleButton();
        b22 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("JOGO DA VELHA");

        nome1.setText("NOME 1");

        face1.setText("FACE 1");

        nome2.setText("NOME 2");

        face2.setText("FACE 2");

        b00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b00ActionPerformed(evt);
            }
        });

        b01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b01ActionPerformed(evt);
            }
        });

        b02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b02ActionPerformed(evt);
            }
        });

        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });

        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });

        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });

        b20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b20ActionPerformed(evt);
            }
        });

        b21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b21ActionPerformed(evt);
            }
        });

        b22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(face1)
                            .addComponent(nome1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(159, 159, 159)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(face2)
                            .addComponent(nome2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 210, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b20, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b21, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b22, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b00, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b01, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b02, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nome1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(face1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nome2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(face2)))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b00, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b01, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b02, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b20, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b21, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b22, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     *
     * @param evt
     */
    private void b00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b00ActionPerformed

        Jogador daVez = jogo.identificaQuemJoga();
        if (b00.getText().isEmpty()) {
            b00.setText(daVez.getFaceEscolhida().toString());
            b00.setEnabled(false);
            if (jogo.fazJogada(0, 0, daVez)) {
                TerminouoOJogo();
            }
            jogadaIa();
        }

    }//GEN-LAST:event_b00ActionPerformed
    /**
     *
     * @param evt
     */
    private void b01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b01ActionPerformed

        Jogador daVez = jogo.identificaQuemJoga();
        if (b01.getText().isEmpty()) {
            b01.setText(daVez.getFaceEscolhida().toString());
            b01.setEnabled(false);
            if (jogo.fazJogada(0, 1, daVez)) {
                TerminouoOJogo();
            }
            jogadaIa();

        }

    }//GEN-LAST:event_b01ActionPerformed
    /**
     *
     * @param evt
     */
    private void b02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b02ActionPerformed

        Jogador daVez = jogo.identificaQuemJoga();
        if (b02.getText().isEmpty()) {
            b02.setText(daVez.getFaceEscolhida().toString());
            b02.setEnabled(false);
            if (jogo.fazJogada(0, 2, daVez)) {
                TerminouoOJogo();
            }
            jogadaIa();

        }

    }//GEN-LAST:event_b02ActionPerformed
    /**
     *
     * @param evt
     */
    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed

        Jogador daVez = jogo.identificaQuemJoga();
        if (b10.getText().isEmpty()) {
            b10.setText(daVez.getFaceEscolhida().toString());
            b10.setEnabled(false);
            if (jogo.fazJogada(1, 0, daVez)) {
                TerminouoOJogo();
            }
            jogadaIa();

        }

    }//GEN-LAST:event_b10ActionPerformed
    /**
     *
     * @param evt
     */
    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed

        Jogador daVez = jogo.identificaQuemJoga();
        if (b11.getText().isEmpty()) {
            b11.setText(daVez.getFaceEscolhida().toString());
            b11.setEnabled(false);
            if (jogo.fazJogada(1, 1, daVez)) {
                TerminouoOJogo();
            }
            jogadaIa();

        }

    }//GEN-LAST:event_b11ActionPerformed
    /**
     *
     * @param evt
     */
    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed

        Jogador daVez = jogo.identificaQuemJoga();
        if (b12.getText().isEmpty()) {
            b12.setText(daVez.getFaceEscolhida().toString());
            b12.setEnabled(false);
            if (jogo.fazJogada(1, 2, daVez)) {
                TerminouoOJogo();
            }
            jogadaIa();

        }

    }//GEN-LAST:event_b12ActionPerformed
    /**
     *
     * @param evt
     */
    private void b20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b20ActionPerformed

        Jogador daVez = jogo.identificaQuemJoga();
        if (b20.getText().isEmpty()) {
            b20.setText(daVez.getFaceEscolhida().toString());
            b20.setEnabled(false);
            if (jogo.fazJogada(2, 0, daVez)) {
                TerminouoOJogo();
            }
            jogadaIa();

        }

    }//GEN-LAST:event_b20ActionPerformed
    /**
     *
     * @param evt
     */
    private void b21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b21ActionPerformed

        Jogador daVez = jogo.identificaQuemJoga();
        if (b21.getText().isEmpty()) {
            b21.setText(daVez.getFaceEscolhida().toString());
            b21.setEnabled(false);
            if (jogo.fazJogada(2, 1, daVez)) {
                TerminouoOJogo();
            }
            jogadaIa();
        }

    }//GEN-LAST:event_b21ActionPerformed
    /**
     *
     * @param evt
     */
    private void b22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b22ActionPerformed

        Jogador daVez = jogo.identificaQuemJoga();
        if (b22.getText().isEmpty()) {
            b22.setText(daVez.getFaceEscolhida().toString());
            b22.setEnabled(false);
            if (jogo.fazJogada(2, 2, daVez)) {
                TerminouoOJogo();
            }
            jogadaIa();
        }

    }//GEN-LAST:event_b22ActionPerformed

    public void jogadaIa() {
        if (hasIa) {
            Jogador daVez = jogo.identificaQuemJoga();
            int num[][] = jogo.getPosicaoIa();
            tabuleiro[num[0][0]][num[0][1]].setText(daVez.getFaceEscolhida().toString());
            tabuleiro[num[0][0]][num[0][1]].setEnabled(false);
            if (jogo.terminouJogo()) {
                TerminouoOJogo();
            }
        }
    }

    /**
     *
     */
    public void TerminouoOJogo() {
        if (msgConf("O jogo acabou, o jogador: " + jogo.obterVencedor().getNome() + "\n foi vitorioso!!!!")) {
            MainMenu menu = new MainMenu();
            menu.setVisible(true);
            this.setVisible(false);
        } else {
            this.setVisible(false);
        }
    }

    public boolean msgConf(String mensagem) {
        return JOptionPane.showConfirmDialog(null, mensagem,
                "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
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
            java.util.logging.Logger.getLogger(FrameJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameJogo(null, false).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton b00;
    private javax.swing.JToggleButton b01;
    private javax.swing.JToggleButton b02;
    private javax.swing.JToggleButton b10;
    private javax.swing.JToggleButton b11;
    private javax.swing.JToggleButton b12;
    private javax.swing.JToggleButton b20;
    private javax.swing.JToggleButton b21;
    private javax.swing.JToggleButton b22;
    private javax.swing.JLabel face1;
    private javax.swing.JLabel face2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nome1;
    private javax.swing.JLabel nome2;
    // End of variables declaration//GEN-END:variables
}
