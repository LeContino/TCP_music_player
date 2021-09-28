package tcp.music_player;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

/**
 *
 * 
 */
public class Interpretador {
    private String texto;
    public ArrayList<String> textoConvertido = new ArrayList<String>();
    private static final String[] comandosValidos = {
        // Notas musicais
        "a",
        "b",
        "c",
        "d",
        "e",
        "f",
        "g",
        " ",
        // Comandos
        "+",
        "-",
        "i",
        "o",
        "u",
        "t+",
        "t-",
        "?",
        ".",
        "nl",
        "bpm+",
        "bpm-",
        "else"
    };
    
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
    
    public int acharComandoMaisLongo(){
        int comandoMaisLongo = 0;
        for(int i = 0; i < this.comandosValidos.length; i++){
            comandoMaisLongo = Math.max(comandoMaisLongo, this.comandosValidos[i].length());
        }
        return comandoMaisLongo;
    }
    
    public String verificarComandoComposto(String comando){
        String comandoComposto = comando.substring(0,1);
        
        // Procurando por "btm+", "btm-" e "else"
        if(
            comando.length() >= 4 && 
            ("bpm-".equals(comando.substring(0,4)) || 
             "bpm+".equals(comando.substring(0,4)) || 
             "else".equals(comando.substring(0,4))))
        {
            comandoComposto = comando.substring(0,4);
        // Procurando por "t-", "t+" e "nl"
        }else if(
            comando.length() >= 2 &&
            ("t+".equals(comando.substring(0,2)) || 
             "t-".equals(comando.substring(0,2)) || 
             "nl".equals(comando.substring(0,2))))
        {
            comandoComposto = comando.substring(0,2);
        }
        return comandoComposto;
    }
    
    // Demais métodos
    public boolean analisarTexto(){
        int comprimentoTexto = this.texto.length();
        int comandoMaisLongo = this.acharComandoMaisLongo();
        String comandoComposto;
        
        for(int i = 0; i < this.texto.length(); i++){
            // Temos que verificar qual é o tamanho do comando mais longo para não acessar um índice inválido
            if(comprimentoTexto-i > comandoMaisLongo){
                System.out.println(this.texto.substring(i,i+comandoMaisLongo));
                comandoComposto = this.verificarComandoComposto(this.texto.substring(i,i+comandoMaisLongo));
            }else{
                System.out.println(this.texto.substring(i));
                comandoComposto = this.verificarComandoComposto(this.texto.substring(i));
            }
            
            // Verificando se o comando encontrado é um comando válido
            boolean comandoValido = Arrays.stream(comandosValidos).anyMatch(comandoComposto::equals);
            if(!comandoValido) return false;
            
            this.textoConvertido.add(comandoComposto);
            
            if(comandoComposto.length() > 1) i += comandoComposto.length()-1;
        }
        
        return true;
    }
}
