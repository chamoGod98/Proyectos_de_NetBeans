    public class mensaje {
    public String texto;
    
    public String encriptar(){
        String mnsjEncrip;
        mnsjEncrip="";
        for (int i = 0; i <= texto.length()-1; i++) {
            mnsjEncrip=mnsjEncrip+(char)(texto.charAt(i)+3);
        }
        return mnsjEncrip;
    }
    
    
}
