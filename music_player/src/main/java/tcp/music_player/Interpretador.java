package tcp.music_player;
import java.util.HashMap;
import java.util.Map;

import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Dictionary;


public class Interpretador {
    private String texto;
    private String textoConvertido = "";
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

    // Construtores
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
    
    // Métodos comuns à interface ligada e desligada
    private boolean caractereENota(char caractere){
        return caractere >= 'A' && caractere <= 'G';
    }
    
    private void adicionarNota(char nota){
        this.textoConvertido += nota;
        this.adicionarOitava();
        this.adicionarSeparador();
    }
    
    private void adicionarOitava(){
        if(this.interfaceHabilitada) this.textoConvertido += Integer.toString(this.oitavaInicial);
        else this.textoConvertido += Integer.toString(this.oitavaAtual);
    }
    
    private void adicionarPausa(){
        this.textoConvertido += "R";
        this.adicionarSeparador();
    }
    
    private void adicionarSeparador(){
        this.textoConvertido += " ";
    }
    
    private char atualizarCaractereAnterior(char caractereAnterior, char caractereAtual){
        if(this.caractereENota(caractereAnterior) && !this.caractereEEspecial(caractereAtual)) return caractereAnterior;
        else return caractereAtual;
    }
    
    private boolean caractereEEspecial(char caractere){
        char[] caracteresEspeciais = {
            '!', ';', 'I', 'i', 'O', 'o', 'U', 'u', '0', '1',
            '2', '3', '4', '5', '6', '7', '8', '9', '.', '?',
            '\n', ',', ' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G'
        };
        
        for(char c : caracteresEspeciais){
            if(c == caractere) return true;
        }
        
        return false;
    }
    
    // Métodos específicos para a interface desligada
    private boolean agogoFoiSelecionado(char caractere){
        return caractere == '!';
    }
    
    private void selecionarAgogo(){
        this.textoConvertido += "I[Agogo]";
        this.adicionarSeparador();
        this.instrumentoAtual = 113;
    }
    
    private boolean harpshichordFoiSelecionado(char caractere){
        return (caractere == 'O' || 
                caractere == 'o' || 
                caractere == 'I' || 
                caractere == 'i' || 
                caractere == 'U' ||
                caractere == 'u');
    }
    
    private void selecionarHarpsichord(){
        this.textoConvertido += "I[6]";
        this.adicionarSeparador();
        this.instrumentoAtual = 6;
    }
    
    private boolean tubularBellsFoiSelecionado(char caractere){
        return caractere == 10;
    }
    
    private void selecionarTubularBells(){
        this.textoConvertido += "I[Tubular_Bells]";
        this.adicionarSeparador();
        this.instrumentoAtual = 14;
    }
    
    private boolean panFluteFoiSelecionado(char caractere){
        return caractere == ';';
    }
    
    private void selecionarPanFlute(){
        this.textoConvertido += "I[Pan_Flute]";
        this.adicionarSeparador();
        this.instrumentoAtual = 75;
    }
    
    private boolean churchOrganFoiSelecionado(char caractere){
        return caractere == ',';
    }
    
    private void selecionarChurchOrgan(){
        this.textoConvertido += "I[Church_Organ]";
        this.adicionarSeparador();
        this.instrumentoAtual = 19;
    }
    
    private boolean instrumentoFoiModificado(char caractere){
        return caractere >= '0' && caractere <= '9';
    }
    
    private void modificarInstrumento(char acrescer){
        this.instrumentoAtual += (int)(acrescer-'0');
        if(this.instrumentoAtual > 127) this.instrumentoAtual = 0;
        
        this.textoConvertido += "I["+Integer.toString(this.instrumentoAtual)+"]";
        this.adicionarSeparador();
    }
    
    private boolean oitavaFoiModificada(char caractere){
        return caractere == '?' || caractere == '.';
    }
    
    private void modificarOitava(){
        this.oitavaAtual += 1;
        if(this.oitavaAtual > 8) this.oitavaAtual = 1;
    }
    
    private boolean volumeFoiModificado(char caractere){
        return caractere == ' ';
    }
    
    private void modificarVolume(){
        this.volumeAtual *= 2;
        if(this.volumeAtual > 16000) this.volumeAtual = 1000;
        
        this.textoConvertido += "X[Volume]="+Integer.toString(this.volumeAtual);
        this.adicionarSeparador();
    }
    
    // Métodos específicos para a interface ligada
    private void configurarVolumeInicial(){
        this.textoConvertido += "X[Volume]="+Integer.toString(this.volumeInicial*1000);
        this.adicionarSeparador();
    }
    
    private void configurarBPMInicial(){
        this.textoConvertido += "T["+this.bpmInicial+"]";
        this.adicionarSeparador();
    }
    
    private void configurarInstrumentoInicial(){
        if(this.instrumentoInicial.equals("Harpsichord")){
            this.textoConvertido += "I[6]";
        }else{
            this.textoConvertido += "I["+this.instrumentoInicial+"]";
        }
        
        this.adicionarSeparador();
    }
    
    private void configurarOitavaInicial(){
        this.oitavaInicial = this.getOitavaInicial();
    }
    
    private String limparTexto(){
        String textoLimpo = "";
        
        for(int i = 0; i < this.texto.length(); i++){
            char caractereAtual = this.texto.charAt(i);
            
            if(
                caractereAtual != ' ' &&
                caractereAtual != '!' &&
                caractereAtual != '.' &&
                caractereAtual != '?' &&
                caractereAtual != ';' &&
                caractereAtual != ',' &&
                caractereAtual != '0' &&
                caractereAtual != '1' &&
                caractereAtual != '2' &&
                caractereAtual != '3' &&
                caractereAtual != '4' &&
                caractereAtual != '5' &&
                caractereAtual != '6' &&
                caractereAtual != '7' &&
                caractereAtual != '8' &&
                caractereAtual != '9' &&
                caractereAtual != 'I' &&
                caractereAtual != 'i' &&
                caractereAtual != 'O' &&
                caractereAtual != 'o' &&
                caractereAtual != 'U' &&
                caractereAtual != 'u' &&
                caractereAtual != 10
            ){
                textoLimpo += caractereAtual;
            }
        }
        System.out.println("Texto limpo");
        System.out.println(textoLimpo);
        return textoLimpo;
    }
    
    public String analisarTexto(){
        char caractereAnterior = '-';
        
        if(this.interfaceHabilitada){
            this.configurarBPMInicial();
            this.configurarInstrumentoInicial();
            this.configurarVolumeInicial();
            this.configurarOitavaInicial();
            this.texto = this.limparTexto();
        }
        
        for(int i = 0; i < this.texto.length(); i++){
            char caractereAtual = this.texto.charAt(i);
            
            if(this.interfaceHabilitada){
                if(this.caractereENota(caractereAtual)) this.adicionarNota(caractereAtual);
                else if(!this.caractereENota(caractereAtual) && this.caractereENota(caractereAnterior)) this.adicionarNota(caractereAnterior);
                else this.adicionarPausa();
            }else{
                if(this.volumeFoiModificado(caractereAtual)) this.modificarVolume();
                else if(this.oitavaFoiModificada(caractereAtual)) this.modificarOitava();
                else if(this.agogoFoiSelecionado(caractereAtual)) this.selecionarAgogo();
                else if(this.harpshichordFoiSelecionado(caractereAtual)) this.selecionarHarpsichord();
                else if(this.tubularBellsFoiSelecionado(caractereAtual)) this.selecionarTubularBells();
                else if(this.panFluteFoiSelecionado(caractereAtual)) this.selecionarPanFlute();
                else if(this.churchOrganFoiSelecionado(caractereAtual)) this.selecionarChurchOrgan();
                else if(this.instrumentoFoiModificado(caractereAtual)) this.modificarInstrumento(caractereAtual);
                else if(this.caractereENota(caractereAtual)) this.adicionarNota(caractereAtual);
                else if(!this.caractereENota(caractereAtual) && this.caractereENota(caractereAnterior)) this.adicionarNota(caractereAnterior);
                else this.adicionarPausa();
            }
            
            caractereAnterior = this.atualizarCaractereAnterior(caractereAnterior, caractereAtual);
        }
        
        System.out.println(textoConvertido);
        return this.getTextoConvertido();
    }

    // Getter & Setters
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
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

    public String getTextoConvertido() {
        return textoConvertido;
    }

    public void setTextoConvertido(String textoConvertido) {
        this.textoConvertido = textoConvertido;
    }
}
