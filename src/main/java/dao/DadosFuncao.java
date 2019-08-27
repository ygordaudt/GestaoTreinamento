package dao;

import java.util.ArrayList;
import java.util.List;
import model.Funcao;

public class DadosFuncao implements Dados{
    private static List<Funcao> funcoes = new ArrayList();
    private static final String nomeArquivo = "\\Funcao.xml";

    @Override
    public void incluir(Object objeto) throws Exception {
        Funcao funcao = (Funcao) objeto;
        funcoes.add(funcao);
        Xml.gravaXml(nomeArquivo, funcoes);
    }
    
    @Override
    public void alterar() throws Exception {
        Xml.gravaXml(nomeArquivo, funcoes);
    }
    
    @Override
    public void remover(Object objeto) throws Exception {
        Funcao funcao = (Funcao) objeto;
        funcoes.remove(funcao);
        Xml.gravaXml(nomeArquivo, funcoes);
    }

    @Override
    public List<Funcao> getList() throws Exception{
        funcoes = (List<Funcao>) Xml.leXml(nomeArquivo);
        return funcoes;
    }

}