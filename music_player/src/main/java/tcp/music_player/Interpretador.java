package tcp.music_player;
import java.util.HashMap;
import java.util.Map;

import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

/**
 *
 * 
 */
public class Interpretador {
    private String texto;
    // Verificar qual é o volume padrão do jfugue
    private int volumeAtual = 4000;
    private int instrumentoAtual = 0;
    private int oitavaAtual = 1;
    
    // constructor
    public Interpretador(String texto) {
        this.setTexto(texto);
    }

    // getter e setters
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    // Aumentar o volume de 500 em 500
    private void aumentarVolume(){
        if(this.volumeAtual*2 > 16383){
            this.volumeAtual = 4000;
        }else{
            this.volumeAtual *= 2;
        }
    }
    
    private void aumentarOitava(){
        if(this.oitavaAtual+1 > 8){
            this.oitavaAtual = 1;
        }else{
            this.oitavaAtual += 1;
        }
    }
    
    private void selecionarAgogo(){
        this.instrumentoAtual = 113;
    }
    
    private boolean selecionarHarpsichord(char caractereAtual){
        if(caractereAtual == 'O' || 
           caractereAtual == 'o' || 
           caractereAtual == 'I' || 
           caractereAtual == 'i' || 
           caractereAtual == 'U' ||
           caractereAtual == 'u')
        {
            return true;
        }else{
            return false;
        }
    }
    
    private void selecionarTubularBells(){
        this.instrumentoAtual = 14;
    }
    
    private void selecionarPanFlute(){
        this.instrumentoAtual = 75;
    }
    
    private void selecionarChurchOrgan(){
        this.instrumentoAtual = 19;
    }
    
    private boolean repetirNota(char caractereAtual, char caractereAnterior){
        if((caractereAtual >= 'a' && caractereAtual <= 'z' ||
            caractereAtual >= 'H' && caractereAtual <= 'Z') &&
            !this.selecionarHarpsichord(caractereAtual) &&
            caractereAnterior >= 'A' && caractereAnterior <= 'G')
        {
            return true;
        }else{
            return false;
        }
            
    }
    
    private void selecionarNovoInstrumento(char caractere){
        int aumentarEm = caractere-48;
        
        if(this.instrumentoAtual+aumentarEm > 127){
            this.instrumentoAtual = 0;
        }else{
            this.instrumentoAtual += aumentarEm;
        }
    }
         
    public String analisarTexto(){
        char caractereAnterior = '-';
        String textoConvertido = "";
        String separador = " ";
        
        for(int i = 0; i < this.texto.length(); i++){
            char caractereAtual = this.texto.charAt(i);
            
            if(this.repetirNota(caractereAtual, caractereAnterior)){
                textoConvertido += caractereAnterior;
                textoConvertido += Integer.toString(this.oitavaAtual);
                caractereAtual = caractereAnterior;
            }else if(caractereAtual >= 'A' && caractereAtual <= 'G'){
                textoConvertido += caractereAtual;
                textoConvertido += Integer.toString(this.oitavaAtual);
            }else if(caractereAtual == ' '){
                this.aumentarVolume();
                textoConvertido += "X[Volume]="+Integer.toString(this.volumeAtual);
            }else if(caractereAtual == '!'){
                this.selecionarAgogo();
                textoConvertido += "I["+Integer.toString(this.instrumentoAtual)+"]";
            }else if(this.selecionarHarpsichord(caractereAtual)){
                this.instrumentoAtual = 6;
                textoConvertido += "I["+Integer.toString(this.instrumentoAtual)+"]";
            }else if(caractereAtual >= '0' && caractereAtual <= '9'){
                this.selecionarNovoInstrumento(caractereAtual);
                textoConvertido += "I["+Integer.toString(this.instrumentoAtual)+"]";
            }else if(caractereAtual == '?' || caractereAtual == '.'){
                this.aumentarOitava();
            }else if(caractereAtual == 10){
                this.selecionarTubularBells();
                textoConvertido += "I["+Integer.toString(this.instrumentoAtual)+"]";
            }else if(caractereAtual == ';'){
                this.selecionarPanFlute();
                textoConvertido += "I["+Integer.toString(this.instrumentoAtual)+"]";
            }else if(caractereAtual == ','){
                this.selecionarChurchOrgan();
                textoConvertido += "I["+Integer.toString(this.instrumentoAtual)+"]";
            }else{
                textoConvertido += "R";
            }
            
            textoConvertido += separador;
            caractereAnterior = caractereAtual;
        }
        
        System.out.println(textoConvertido);
        return textoConvertido;
    }
}
