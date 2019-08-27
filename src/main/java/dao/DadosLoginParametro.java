package dao;

import model.LoginParametro;
import java.util.ArrayList;
import java.util.List;

public class DadosLoginParametro implements Dados {
    private static List<LoginParametro> loginParametros = new ArrayList();
    private static final String nomeArquivo = "\\LoginParametros.xml"; 

    @Override
    public void incluir(Object objeto) throws Exception {
        LoginParametro loginParametro = (LoginParametro) objeto;
        loginParametros.add(loginParametro);
        Xml.gravaXml(nomeArquivo, loginParametros);
    }
    
    @Override
    public void alterar() throws Exception {
        Xml.gravaXml(nomeArquivo, loginParametros);
    }
    @Override
    public void remover(Object objeto) throws Exception {
        LoginParametro loginParametro = (LoginParametro) objeto;
        loginParametros.remove(loginParametro);
        Xml.gravaXml(nomeArquivo, loginParametros);
    }

    @Override
    public List getList() throws Exception{
        loginParametros = (List<LoginParametro>) Xml.leXml(nomeArquivo);
        return loginParametros;
    }
    
}