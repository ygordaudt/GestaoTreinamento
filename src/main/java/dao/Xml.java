package dao;



import com.thoughtworks.xstream.XStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import model.LoginParametro;

public class Xml {
    public static LoginParametro parametro;
    
    //public static String caminho = System.getProperty("user.dir") + "\\xml"; // Seleciona o caminho atual do projeto.
    private static final String caminho = "C:\\Users\\ygor.daudt\\Documents\\NetBeansProjects\\GestaoTreinamento\\xml\\";
    
    public static void gravaXml(String nomeArquivo, Object objeto) throws Exception {
        XStream xstream = new XStream();
        xstream.setMode(XStream.NO_REFERENCES); // GRAVA O OBJETO SEM "REFERENCE_TO"
        String xml = xstream.toXML(objeto);
        XStream.setupDefaultSecurity(xstream); // REMOVE "SECURITY PROBABLY VULNERABLE ERROR"
        xstream.allowTypesByRegExp(new String[] { ".*" }); // REMOVE "SECURITY PROBABLY VULNERABLE ERROR"

        File arquivo = new File(caminho + nomeArquivo);
        FileWriter fw = new FileWriter(arquivo);
        fw.write(xml);
        fw.close();
    }

    public static Object leXml(String nomeArquivo) throws Exception {
        String xml = "";
        BufferedReader br = new BufferedReader(new FileReader(caminho + nomeArquivo));
        while (br.ready()) {
            xml += br.readLine() + "\n";
        }
        br.close();

        XStream xstream = new XStream();
        xstream.setMode(XStream.NO_REFERENCES);  // LE O OBJETO SEM "REFERENCE_TO"
        XStream.setupDefaultSecurity(xstream); // REMOVE "SECURITY PROBABLY VULNERABLE ERROR"
        xstream.allowTypesByRegExp(new String[] { ".*" }); // REMOVE "SECURITY PROBABLY VULNERABLE ERROR"
        return xstream.fromXML(xml);
    }

}