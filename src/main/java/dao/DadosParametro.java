package dao;

import java.util.ArrayList;
import java.util.List;
import model.LoginParametro;

public class DadosParametro implements Dados {
    private static List<LoginParametro> parametros = new ArrayList();
    private static final String nomeArquivo = "\\Parametro.xml"; 

    @Override
    public void incluir(Object objeto) throws Exception {
        LoginParametro parametro = (LoginParametro) objeto;
        parametros.add(parametro);
        Xml.gravaXml(nomeArquivo, parametros);
    }

    @Override
    public void alterar() throws Exception {
        Xml.gravaXml(nomeArquivo, parametros);
    }
    
    @Override
    public void remover(Object objeto) throws Exception {
        LoginParametro parametro = (LoginParametro) objeto;
        parametros.remove(parametro);
        Xml.gravaXml(nomeArquivo, parametros);
    }

    @Override
    public List getList() throws Exception{
        parametros = (List<LoginParametro>) Xml.leXml(nomeArquivo);
        return parametros;
    }
    
}