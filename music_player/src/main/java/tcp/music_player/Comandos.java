package tcp.music_player;

/**
 *
 * @author henrique
 */
public class Comandos extends Interpretador {
    private int volumeAtual;

    public Comandos(int volumeAtual, String texto) {
        super(texto);
        this.volumeAtual = volumeAtual;
    }
    
    
    @Override
    public int aumentarVolume(){
        if(volumeAtual*2 > 16383){
            volumeAtual = 4000;
        }else{
            volumeAtual *= 2;
        }
        
        setVolumeAtual(volumeAtual);
        return volumeAtual;
    }
    
//    public int diminuirVolume(){
//        
//    }
//    
//    public int aumentarOitava(){
//        
//    }
//    
//    public int diminuirOitava(){
//        
//    }
//    
//    public int aumentarBPM(){
//        
//    }
//    
//    public int diminuirBPM(){
//        
//    }
//    
//    public int trocarInstrumento(){
//        
//    }
//    
//    public int setVolume(){
//        
//    }
//    
//    public int setBPM(){
//        
//    }
//    
//    public int setInstrumento(){
//        
//    }

}
