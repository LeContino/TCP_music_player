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
    private boolean interfaceHabilitada = true;
    // Variáveis usadas quando a interface está desabilitada
    private int volumeAtual = 1000;
    private int instrumentoAtual = 0;
    private int oitavaAtual = 1;
    // Variáveis usadas quando a interface está habilitada
    private int volumeInicial = 10;
    private int oitavaInicial = 5;
    private String instrumentoInicial = "Piano";
    private String bpmInicial = "Allegro";

    
    public Interpretador(String texto, boolean interfaceHabilitada, int volume, String instrumento, int oitava, String bpm){
        this.setVolumeInicial(volume);
        this.setInstrumentoInicial(instrumento);
        this.setOitavaInicial(oitava);
        this.setBpmInicial(bpm);
        this.setTexto(texto);
        this.setInterfaceHabilitada(interfaceHabilitada);
    }
    
    public Interpretador(String texto, boolean interfaceHabilitada){
        this.setTexto(texto);
        this.setInterfaceHabilitada(interfaceHabilitada);
    }

    // getter e setters
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    public int aumentarVolume(){
        if(this.volumeAtual*2 > 16383){
            this.volumeAtual = 1000;
        }else{
            this.volumeAtual *= 2;
        }
        
        return this.volumeAtual;
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
    
    private String configurarVolumeInicial(){
        String volume = "X[Volume]="+Integer.toString(this.volumeInicial*1000)+" ";
        return volume;
    }
    
    private String configurarBPMInicial(){
        String bpm = "T["+this.bpmInicial+"] ";
        return bpm;
    }
    
    private String configurarInstrumentoInicial(){
        String instrumento = "I["+this.instrumentoInicial+"] ";
        return instrumento;
    }
    
    private String configurarOitavaInicial(){
        String oitava = Integer.toString(this.oitavaInicial);
        return oitava;
    }
    
    private String limparTexto(){
        String textoLimpo = "";
        
        for(int i = 0; i < this.texto.length(); i++){
            char caractereAtual = this.texto.charAt(i);
            
            if(
                caractereAtual != ' ' ||
                caractereAtual != '!' ||
                caractereAtual != '.' ||
                caractereAtual != '?' ||
                caractereAtual != ';' ||
                caractereAtual != ',' ||
                caractereAtual < '0'  ||
                caractereAtual > '9'  ||
                caractereAtual != 'I' ||
                caractereAtual != 'i' ||
                caractereAtual != 'O' ||
                caractereAtual != 'o' ||
                caractereAtual != 'U' ||
                caractereAtual != 'u'
            ){
                textoLimpo += caractereAtual;
            }
        }
        
        return textoLimpo;
    }
    
    private String concatenarOitava(){
        if(this.interfaceHabilitada){
            return Integer.toString(this.oitavaInicial);
        }else{
            return Integer.toString(this.oitavaAtual);
        }
    }
    
    public String analisarTexto(){
        char caractereAnterior = '-';
        String textoConvertido = "";
        String separador = " ";
        
        if(this.interfaceHabilitada){
            textoConvertido += this.configurarBPMInicial();
            textoConvertido += this.configurarInstrumentoInicial();
            textoConvertido += this.configurarVolumeInicial();
            this.limparTexto();
        }
        
        for(int i = 0; i < this.texto.length(); i++){
            char caractereAtual = this.texto.charAt(i);
            
            if(this.repetirNota(caractereAtual, caractereAnterior)){
                textoConvertido += caractereAnterior;
                textoConvertido += this.concatenarOitava();
                caractereAtual = caractereAnterior;
            }else if(caractereAtual >= 'A' && caractereAtual <= 'G'){
                textoConvertido += caractereAtual;
                textoConvertido += this.concatenarOitava();
            }else if(!this.interfaceHabilitada){
                if(caractereAtual == ' '){
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
            }
            
            textoConvertido += separador;
            caractereAnterior = caractereAtual;
        }
        
        System.out.println(textoConvertido);
        return textoConvertido;
    }

    public int getVolumeAtual() {
        return volumeAtual;
    }

    public void setVolumeAtual(int volumeAtual) {
        this.volumeAtual = volumeAtual;
    }

    public int getInstrumentoAtual() {
        return instrumentoAtual;
    }

    public void setInstrumentoAtual(int instrumentoAtual) {
        this.instrumentoAtual = instrumentoAtual;
    }

    public int getOitavaAtual() {
        return oitavaAtual;
    }

    public void setOitavaAtual(int oitavaAtual) {
        this.oitavaAtual = oitavaAtual;
    }

    public int getVolumeInicial() {
        return volumeInicial;
    }

    public void setVolumeInicial(int volumeInicial) {
        this.volumeInicial = volumeInicial;
    }

    public String getInstrumentoInicial() {
        return instrumentoInicial;
    }

    public void setInstrumentoInicial(String instrumentoInicial) {
        this.instrumentoInicial = instrumentoInicial;
    }

    public int getOitavaInicial() {
        return oitavaInicial;
    }

    public void setOitavaInicial(int oitavaInicial) {
        this.oitavaInicial = oitavaInicial;
    }

    public boolean isInterfaceHabilitada() {
        return interfaceHabilitada;
    }

    public void setInterfaceHabilitada(boolean interfaceHabilitada) {
        this.interfaceHabilitada = interfaceHabilitada;
    }

    public String getBpmInicial() {
        return bpmInicial;
    }

    public void setBpmInicial(String bpmInicial) {
        this.bpmInicial = bpmInicial;
    }
}
