package dao;

import java.util.ArrayList;
import java.util.List;
import model.CorEquipe;

public class DadosTipoTime implements Dados {
    private static List<CorEquipe> tiposTime = new ArrayList();
    private static final String nomeArquivo = "\\TipoTime.xml"; 

    @Override
    public void incluir(Object objeto) throws Exception {
        CorEquipe tipoTime = (CorEquipe) objeto;
        tiposTime.add(tipoTime);
        Xml.gravaXml(nomeArquivo, tiposTime);
    }

    @Override
    public void alterar() throws Exception {
        Xml.gravaXml(nomeArquivo, tiposTime);
    }
    
    @Override
    public void remover(Object objeto) throws Exception {
        CorEquipe tipoTime = (CorEquipe) objeto;
        tiposTime.remove(tipoTime);
        Xml.gravaXml(nomeArquivo, tiposTime);
    }

    @Override
    public List getList() throws Exception{
        tiposTime = (List<CorEquipe>) Xml.leXml(nomeArquivo);
        return tiposTime;
    }
    
}