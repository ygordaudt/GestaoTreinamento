package dao;

import java.util.ArrayList;
import java.util.List;
import model.AulaFrequentada;

public class DadosAulaFrequentada implements Dados{
    private static List<AulaFrequentada> aulasFrequentadas = new ArrayList();
    private static final String nomeArquivo = "\\AulaFrequentada.xml";

    @Override
    public void incluir(Object objeto) throws Exception {
        AulaFrequentada aulaFrequentada = (AulaFrequentada) objeto;
        aulasFrequentadas.add(aulaFrequentada);
        Xml.gravaXml(nomeArquivo, aulasFrequentadas);
    }
    
    @Override
    public void alterar() throws Exception {
        Xml.gravaXml(nomeArquivo, aulasFrequentadas);
    }
    
    @Override
    public void remover(Object objeto) throws Exception {
        AulaFrequentada aulaFrequentada = (AulaFrequentada) objeto;
        aulasFrequentadas.remove(aulaFrequentada);
        Xml.gravaXml(nomeArquivo, aulasFrequentadas);
    }

    @Override
    public List<AulaFrequentada> getList() throws Exception{
        aulasFrequentadas = (List<AulaFrequentada>) Xml.leXml(nomeArquivo);
        return aulasFrequentadas;
    }

}