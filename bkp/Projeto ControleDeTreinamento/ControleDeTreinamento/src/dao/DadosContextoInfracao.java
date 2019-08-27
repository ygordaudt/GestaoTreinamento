package dao;

import java.util.ArrayList;
import java.util.List;
import model.ContextoInfracao;

public class DadosContextoInfracao implements Dados {
    private static List<ContextoInfracao> contextosInfracao = new ArrayList();
    private static final String nomeArquivo = "\\ContextoInfracao.xml"; 

    @Override
    public void incluir(Object objeto) throws Exception {
        ContextoInfracao tipoInfracao = (ContextoInfracao) objeto;
        contextosInfracao.add(tipoInfracao);
        Xml.gravaXml(nomeArquivo, contextosInfracao);
    }

    @Override
    public void alterar() throws Exception {
        Xml.gravaXml(nomeArquivo, contextosInfracao);
    }
    
    @Override
    public void remover(Object objeto) throws Exception {
        ContextoInfracao tipoInfracao = (ContextoInfracao) objeto;
        contextosInfracao.remove(tipoInfracao);
        Xml.gravaXml(nomeArquivo, contextosInfracao);
    }

    @Override
    public List getList() throws Exception{
        contextosInfracao = (List<ContextoInfracao>) Xml.leXml(nomeArquivo);
        return contextosInfracao;
    }
    
}