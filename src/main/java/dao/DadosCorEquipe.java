package dao;

import java.util.ArrayList;
import java.util.List;
import model.CorEquipe;


public class DadosCorEquipe implements Dados {
    private static List<CorEquipe> coresEquipe = new ArrayList();
    private static final String nomeArquivo = "\\CorEquipe.xml"; 

    @Override
    public void incluir(Object objeto) throws Exception {
        CorEquipe corEquipe = (CorEquipe) objeto;
        coresEquipe.add(corEquipe);
        Xml.gravaXml(nomeArquivo, coresEquipe);
    }

    @Override
    public void alterar() throws Exception {
        Xml.gravaXml(nomeArquivo, coresEquipe);
    }
    
    @Override
    public void remover(Object objeto) throws Exception {
        CorEquipe corEquipe = (CorEquipe) objeto;
        coresEquipe.remove(corEquipe);
        Xml.gravaXml(nomeArquivo, coresEquipe);
    }

    @Override
    public List getList() throws Exception{
        coresEquipe = (List<CorEquipe>) Xml.leXml(nomeArquivo);
        return coresEquipe;
    }
    
}