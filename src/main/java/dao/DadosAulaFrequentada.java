package dao;

import java.util.ArrayList;
import java.util.List;
import model.AulaMinistrada;

public class DadosAulaFrequentada implements Dados{
    private static List<AulaMinistrada> aulasFrequentadas = new ArrayList();
    private static final String nomeArquivo = "\\AulaFrequentada.xml";

    @Override
    public void incluir(Object objeto) throws Exception {
        AulaMinistrada aulaFrequentada = (AulaMinistrada) objeto;
        aulasFrequentadas.add(aulaFrequentada);
        Xml.gravaXml(nomeArquivo, aulasFrequentadas);
    }
    
    @Override
    public void alterar() throws Exception {
        Xml.gravaXml(nomeArquivo, aulasFrequentadas);
    }
    
    @Override
    public void remover(Object objeto) throws Exception {
        AulaMinistrada aulaFrequentada = (AulaMinistrada) objeto;
        aulasFrequentadas.remove(aulaFrequentada);
        Xml.gravaXml(nomeArquivo, aulasFrequentadas);
    }

    @Override
    public List<AulaMinistrada> getList() throws Exception{
        aulasFrequentadas = (List<AulaMinistrada>) Xml.leXml(nomeArquivo);
        return aulasFrequentadas;
    }

}