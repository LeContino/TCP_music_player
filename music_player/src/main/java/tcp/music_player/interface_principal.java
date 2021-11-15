/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcp.music_player;
import org.jfugue.*;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


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

        panelEscolherArquivo = new javax.swing.JPanel();
        frameEscolherArquivo = new javax.swing.JFileChooser();
        spinnerVolume = new javax.swing.JSpinner();
        spinnerOitava = new javax.swing.JSpinner();
        Label_Volume = new javax.swing.JLabel();
        Label_Oitavas = new javax.swing.JLabel();
        Label_Valores_Iniciais = new javax.swing.JLabel();
        Label_GeradorDeMusica = new javax.swing.JLabel();
        buttonPlay = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        selectInstrumento = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        textAreaMusica = new javax.swing.JTextArea();
        toggleVisibilidadeControles = new javax.swing.JToggleButton();
        selectBPM = new javax.swing.JComboBox<>();
        Label_Oitavas1 = new javax.swing.JLabel();
        Label_Oitavas2 = new javax.swing.JLabel();
        buttonSalvarMIDI = new javax.swing.JButton();
        buttonCarregarArquivoTexto = new javax.swing.JButton();

        javax.swing.GroupLayout panelEscolherArquivoLayout = new javax.swing.GroupLayout(panelEscolherArquivo);
        panelEscolherArquivo.setLayout(panelEscolherArquivoLayout);
        panelEscolherArquivoLayout.setHorizontalGroup(
            panelEscolherArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEscolherArquivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(frameEscolherArquivo, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        panelEscolherArquivoLayout.setVerticalGroup(
            panelEscolherArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEscolherArquivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(frameEscolherArquivo, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        spinnerVolume.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerVolumeStateChanged(evt);
            }
        });

        spinnerOitava.setValue(spinnerOitava.getValue());
        spinnerOitava.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerOitavaStateChanged(evt);
            }
        });

        Label_Volume.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_Volume.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Volume.setText("Volume");

        Label_Oitavas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_Oitavas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Oitavas.setText("BPM");

        Label_Valores_Iniciais.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_Valores_Iniciais.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Valores_Iniciais.setText("Valores Iniciais");

        Label_GeradorDeMusica.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        Label_GeradorDeMusica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_GeradorDeMusica.setText("♫♫ Musicotron 2000 ♫♫ ");

        buttonPlay.setText("▶");
        buttonPlay.setToolTipText("Reproduzir");
        buttonPlay.setBorder(null);
        buttonPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonPlayMouseClicked(evt);
            }
        });

        buttonCancel.setText("◼");
        buttonCancel.setToolTipText("Parar");
        buttonCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCancelMouseClicked(evt);
            }
        });

        selectInstrumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Violin", "Piano", "Agogo", "Harpsichord", "Tubular Bells", "Pan Flute", "Church Organ" }));
        selectInstrumento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selectInstrumentoItemStateChanged(evt);
            }
        });

        textAreaMusica.setColumns(20);
        textAreaMusica.setRows(5);
        textAreaMusica.setToolTipText("Digite seu texto aqui 🎤🎼");
        jScrollPane4.setViewportView(textAreaMusica);

        toggleVisibilidadeControles.setSelected(true);
        toggleVisibilidadeControles.setText("Desabilitar controles");
        toggleVisibilidadeControles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toggleVisibilidadeControlesMouseClicked(evt);
            }
        });
        toggleVisibilidadeControles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleVisibilidadeControlesActionPerformed(evt);
            }
        });

        selectBPM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grave (40)", "Largo (45)", "Larghetto (50)", "Lento (55)", "Adagio (60)", "Adagietto (65)", "Andante (70)", "Andantino (80)", "Moderato (95)", "Allegretto (110)", "Allegro (120)", "Vivace (145)", "Presto (180)", "Pretissimo (220)" }));
        selectBPM.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selectBPMItemStateChanged(evt);
            }
        });

        Label_Oitavas1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_Oitavas1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Oitavas1.setText("Oitavas");

        Label_Oitavas2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_Oitavas2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Oitavas2.setText("Instrumento");

        buttonSalvarMIDI.setText("Salvar MIDI");
        buttonSalvarMIDI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonSalvarMIDIMouseClicked(evt);
            }
        });

        buttonCarregarArquivoTexto.setText("Carregar arquivo de texto");
        buttonCarregarArquivoTexto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCarregarArquivoTextoMouseClicked(evt);
            }
        });
        buttonCarregarArquivoTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCarregarArquivoTextoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Label_GeradorDeMusica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_Oitavas, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_Volume, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_Oitavas1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_Oitavas2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(selectBPM, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(spinnerVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29))
                                .addComponent(spinnerOitava, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(selectInstrumento, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(Label_Valores_Iniciais, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonCarregarArquivoTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttonPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(buttonSalvarMIDI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(toggleVisibilidadeControles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Label_GeradorDeMusica)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label_Valores_Iniciais, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_Volume)
                            .addComponent(spinnerVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerOitava, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(Label_Oitavas1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selectBPM, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(Label_Oitavas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_Oitavas2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectInstrumento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(151, 151, 151))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonCancel)
                            .addComponent(buttonPlay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCarregarArquivoTexto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(toggleVisibilidadeControles)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSalvarMIDI)
                        .addGap(25, 25, 25))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPlayMouseClicked
        String textoOriginal = textAreaMusica.getText();
        Interpretador interpretador;
        
        if(interfaceHabilitada){
            interpretador = new Interpretador(textoOriginal, interfaceHabilitada, volumeInicial, instrumentoInicial, oitavaInicial, bpmInicial);            
        }else{
            interpretador = new Interpretador(textoOriginal, interfaceHabilitada);
        }
        
        String textoInterpretado = interpretador.analisarTexto();
        Player player = new Player();
        Pattern pattern = new Pattern(textoInterpretado);
        player.play(pattern);        
    }//GEN-LAST:event_buttonPlayMouseClicked

    private void buttonCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCancelMouseClicked
        Player player = new Player();
        Pattern pattern = new Pattern("");
        player.play(pattern);
    }//GEN-LAST:event_buttonCancelMouseClicked

    private void spinnerVolumeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerVolumeStateChanged
        int volumeAtual = (int)spinnerVolume.getValue();
        
        if(volumeAtual <= 0){
            spinnerVolume.setValue(0);
        }else if(volumeAtual >= 16){
            spinnerVolume.setValue(16);
        }
        
        volumeInicial = (int)spinnerVolume.getValue();    
    }//GEN-LAST:event_spinnerVolumeStateChanged

    private void toggleVisibilidadeControlesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toggleVisibilidadeControlesMouseClicked
        boolean estadoInterface = toggleVisibilidadeControles.isSelected();
        
        if(estadoInterface){
            toggleVisibilidadeControles.setText("Desabilitar controles");
        }else{
            toggleVisibilidadeControles.setText("Habilitar controles");
        }
        
        spinnerVolume.setEnabled(estadoInterface);
        spinnerOitava.setEnabled(estadoInterface);
        selectBPM.setEnabled(estadoInterface);
        selectInstrumento.setEnabled(estadoInterface);
        interfaceHabilitada = estadoInterface;
    }//GEN-LAST:event_toggleVisibilidadeControlesMouseClicked

    private void spinnerOitavaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerOitavaStateChanged
        int oitavaAtual = (int)spinnerOitava.getValue();
        
        if(oitavaAtual <= 1){
            spinnerOitava.setValue(1);
        }else if(oitavaAtual >= 8){
            spinnerOitava.setValue(8);
        }
        
        oitavaInicial = (int)spinnerOitava.getValue();
    }//GEN-LAST:event_spinnerOitavaStateChanged

    private void selectBPMItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selectBPMItemStateChanged
        String bpmSelecionado = (String)selectBPM.getSelectedItem();
        bpmSelecionado = bpmSelecionado.split(" ")[0];
        bpmInicial = bpmSelecionado;
    }//GEN-LAST:event_selectBPMItemStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        spinnerOitava.setValue(5);
        spinnerVolume.setValue(10);
        selectBPM.setSelectedIndex(10);
        selectInstrumento.setSelectedIndex(1);
    }//GEN-LAST:event_formWindowOpened

    private void buttonSalvarMIDIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSalvarMIDIMouseClicked
        int salvarArquivo = frameEscolherArquivo.showSaveDialog(panelEscolherArquivo);
        
        if(salvarArquivo == JFileChooser.APPROVE_OPTION){
            File arquivo = frameEscolherArquivo.getSelectedFile();
            ManipuladorArquivos manipuladorArq = new ManipuladorArquivos(arquivo);
            String nomeArquivo = arquivo.getName();
            String conteudoArquivo = textAreaMusica.getText();            
            try {
                manipuladorArq.salvarArquivoMIDI(nomeArquivo, conteudoArquivo);
            } catch (IOException ex) {
                Logger.getLogger(interface_principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_buttonSalvarMIDIMouseClicked

    private void buttonCarregarArquivoTextoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCarregarArquivoTextoMouseClicked
        int escolherArquivo = frameEscolherArquivo.showOpenDialog(panelEscolherArquivo);
        
        if(escolherArquivo == JFileChooser.APPROVE_OPTION){
            File arquivoEscolhido = frameEscolherArquivo.getSelectedFile();
            ManipuladorArquivos manipuladorArq = new ManipuladorArquivos(arquivoEscolhido);
            
            if(manipuladorArq.getExtensaoArquivo().equals("txt")){
                String conteudo = manipuladorArq.getConteudoArquivo();
                textAreaMusica.setText(conteudo);
            }
        }
    }//GEN-LAST:event_buttonCarregarArquivoTextoMouseClicked

    private void selectInstrumentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selectInstrumentoItemStateChanged
        String instrumentoSelecionado = (String)selectInstrumento.getSelectedItem();
        instrumentoSelecionado = instrumentoSelecionado.replaceAll(" ", "_");
        instrumentoInicial = instrumentoSelecionado;
    }//GEN-LAST:event_selectInstrumentoItemStateChanged

    private void toggleVisibilidadeControlesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleVisibilidadeControlesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toggleVisibilidadeControlesActionPerformed

    private void buttonCarregarArquivoTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCarregarArquivoTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCarregarArquivoTextoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static int volumeInicial = 10;
    public static int oitavaInicial = 5;
    public static boolean interfaceHabilitada = true;
    public static String instrumentoInicial = "Piano";
    public static String bpmInicial = "Allegro";

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
    private javax.swing.JLabel Label_GeradorDeMusica;
    private javax.swing.JLabel Label_Oitavas;
    private javax.swing.JLabel Label_Oitavas1;
    private javax.swing.JLabel Label_Oitavas2;
    private javax.swing.JLabel Label_Valores_Iniciais;
    private javax.swing.JLabel Label_Volume;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonCarregarArquivoTexto;
    private javax.swing.JButton buttonPlay;
    private javax.swing.JButton buttonSalvarMIDI;
    private javax.swing.JFileChooser frameEscolherArquivo;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel panelEscolherArquivo;
    private javax.swing.JComboBox<String> selectBPM;
    private javax.swing.JComboBox<String> selectInstrumento;
    private javax.swing.JSpinner spinnerOitava;
    private javax.swing.JSpinner spinnerVolume;
    private javax.swing.JTextArea textAreaMusica;
    private javax.swing.JToggleButton toggleVisibilidadeControles;
    // End of variables declaration//GEN-END:variables
}
