/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tcp.music_player;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.sound.midi.MidiFileFormat;
import javax.sound.midi.spi.MidiFileWriter;
import org.jfugue.*;


public class ManipuladorArquivos{
    private File arquivo;

    public ManipuladorArquivos(File arquivo) {
        this.arquivo = arquivo;
    }
    
    public String getConteudoArquivo(){
        StringBuilder conteudo = new StringBuilder();
    
        try {
          BufferedReader entrada =  new BufferedReader(new FileReader(this.arquivo));
          try {
            String linha = null; 
            
            while ((linha = entrada.readLine()) != null){
              conteudo.append(linha);
              conteudo.append(System.getProperty("line.separator"));
            }
          } finally {
            entrada.close();
          }
        }
        catch (IOException ex){
          ex.printStackTrace();
        }

        return conteudo.toString();
    }
    
    public String getExtensaoArquivo(){
        String extensaoArquivo = null;
        String nomeArquivo = this.arquivo.getName();
        
        int indicePonto = nomeArquivo.lastIndexOf(".");

        if(indicePonto > 0 && indicePonto < nomeArquivo.length()-1){
            extensaoArquivo = nomeArquivo.substring(indicePonto+1).toLowerCase();
        }

        if(extensaoArquivo != null && extensaoArquivo.equals("txt")){
            return extensaoArquivo;
        }else{
            return null;
        }
    }
    
    public boolean salvarArquivoMIDI(String conteudo, File arquivo) throws IOException{
        if(conteudo.length() == 0){
            return false;
        }
        
        Player player = new Player();
        player.saveMidi(conteudo, arquivo);
        return true;
    }
}
