/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcp.music_player;

/**
 *
 * @author lelec
 */
public class interface_principal extends javax.swing.JFrame {

    /**
     * Creates new form interface_principal
     */
    public interface_principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ajuste_volume = new javax.swing.JSpinner();
        ajuste_Oitavas = new javax.swing.JSpinner();
        ajuste_BPM = new javax.swing.JSpinner();
        Label_Volume = new javax.swing.JLabel();
        Label_BPM = new javax.swing.JLabel();
        Label_Oitavas = new javax.swing.JLabel();
        Label_Valores_Iniciais = new javax.swing.JLabel();
        Label_GeradorDeMusica = new javax.swing.JLabel();
        Button_play = new javax.swing.JButton();
        Button_pause = new javax.swing.JButton();
        Button_cancel = new javax.swing.JButton();
        Button_return = new javax.swing.JButton();
        Select_Instrumento = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        Caixa_de_Texto = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Label_Volume.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_Volume.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Volume.setText("Volume");

        Label_BPM.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_BPM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_BPM.setText("BPM");

        Label_Oitavas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_Oitavas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Oitavas.setText("Oitavas");

        Label_Valores_Iniciais.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_Valores_Iniciais.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Valores_Iniciais.setText("Valores Iniciais");

        Label_GeradorDeMusica.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        Label_GeradorDeMusica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_GeradorDeMusica.setText("?????? Gerador de m??sica ?????? ");

        Button_play.setText("???");

        Button_pause.setText("???");

        Button_cancel.setText("???");

        Button_return.setText("????");

        Select_Instrumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Instrumento", "Viol??o", "Piano", "Flauta", "Violino" }));

        Caixa_de_Texto.setColumns(20);
        Caixa_de_Texto.setRows(5);
        Caixa_de_Texto.setText("Digite seu texto aqui ????????");
        jScrollPane4.setViewportView(Caixa_de_Texto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Label_GeradorDeMusica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Label_Volume, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                    .addComponent(Label_BPM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Label_Oitavas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ajuste_BPM, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ajuste_volume, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ajuste_Oitavas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Label_Valores_Iniciais, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Select_Instrumento, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(Button_play)
                        .addGap(34, 34, 34)
                        .addComponent(Button_pause, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(Button_cancel)
                        .addGap(30, 30, 30)
                        .addComponent(Button_return)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Label_GeradorDeMusica)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label_Valores_Iniciais, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_Volume)
                            .addComponent(ajuste_volume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ajuste_BPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_BPM))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_Oitavas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ajuste_Oitavas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Button_play)
                        .addComponent(Button_pause)
                        .addComponent(Button_cancel)
                        .addComponent(Button_return))
                    .addComponent(Select_Instrumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(interface_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interface_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interface_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interface_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interface_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_cancel;
    private javax.swing.JButton Button_pause;
    private javax.swing.JButton Button_play;
    private javax.swing.JButton Button_return;
    private javax.swing.JTextArea Caixa_de_Texto;
    private javax.swing.JLabel Label_BPM;
    private javax.swing.JLabel Label_GeradorDeMusica;
    private javax.swing.JLabel Label_Oitavas;
    private javax.swing.JLabel Label_Valores_Iniciais;
    private javax.swing.JLabel Label_Volume;
    private javax.swing.JComboBox<String> Select_Instrumento;
    private javax.swing.JSpinner ajuste_BPM;
    private javax.swing.JSpinner ajuste_Oitavas;
    private javax.swing.JSpinner ajuste_volume;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
