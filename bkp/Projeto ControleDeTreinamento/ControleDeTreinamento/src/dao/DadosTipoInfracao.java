package dao;

import java.util.ArrayList;
import java.util.List;
import model.TipoInfracao;

public class DadosTipoInfracao implements Dados {
    private static List<TipoInfracao> tiposInfracao = new ArrayList();
    private static final String nomeArquivo = "\\TipoInfracao.xml"; 

    @Override
    public void incluir(Object objeto) throws Exception {
        TipoInfracao tipoInfracao = (TipoInfracao) objeto;
        tiposInfracao.add(tipoInfracao);
        Xml.gravaXml(nomeArquivo, tiposInfracao);
    }

    @Override
    public void alterar() throws Exception {
        Xml.gravaXml(nomeArquivo, tiposInfracao);
    }
    
    @Override
    public void remover(Object objeto) throws Exception {
        TipoInfracao tipoInfracao = (TipoInfracao) objeto;
        tiposInfracao.remove(tipoInfracao);
        Xml.gravaXml(nomeArquivo, tiposInfracao);
    }

    @Override
    public List getList() throws Exception{
        tiposInfracao = (List<TipoInfracao>) Xml.leXml(nomeArquivo);
        return tiposInfracao;
    }
    
}