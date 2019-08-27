package dao;

import java.util.ArrayList;
import java.util.List;
import model.Instrutor;

public class DadosInstrutor implements Dados{
    private static List<Instrutor> instrutores = new ArrayList();
    private static final String nomeArquivo = "\\Instrutor.xml";

    @Override
    public void incluir(Object objeto) throws Exception {
        Instrutor instrutor = (Instrutor) objeto;
        instrutores.add(instrutor);
        Xml.gravaXml(nomeArquivo, instrutores);
    }
    
    @Override
    public void alterar() throws Exception {
        Xml.gravaXml(nomeArquivo, instrutores);
    }
    
    @Override
    public void remover(Object objeto) throws Exception {
        Instrutor instrutor = (Instrutor) objeto;
        instrutores.remove(instrutor);
        Xml.gravaXml(nomeArquivo, instrutores);
    }

    @Override
    public List<Instrutor> getList() throws Exception{
        instrutores = (List<Instrutor>) Xml.leXml(nomeArquivo);
        return instrutores;
    }

}