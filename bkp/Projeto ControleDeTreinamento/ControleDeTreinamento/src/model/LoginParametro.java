package model;

/**
 *
 * @author Ygor
 */
public class LoginParametro {
    private String diretorioXml;
    
    
    public String getDiretorioXml() {
        return diretorioXml;
    }

    public void setDiretorioXml(String diretorioXml) {
        this.diretorioXml = diretorioXml;
    }  
    
    @Override
    public String toString() {
        return this.diretorioXml;
       // return this.diretorioXml.replaceAll("[\\]", "\\"+"\\")
    }
    
   
}
