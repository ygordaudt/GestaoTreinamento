package dao;

import java.util.ArrayList;
import java.util.List;
import model.Equipe;

public class DadosEquipe implements Dados {
    private static List<Equipe> equipes = new ArrayList();
    private static final String nomeArquivo = "\\Equipe.xml"; 

    @Override
    public void incluir(Object objeto) throws Exception {
        Equipe equipe = (Equipe) objeto;
        equipes.add(equipe);
        Xml.gravaXml(nomeArquivo, equipes);
    }

    @Override
    public void alterar() throws Exception {
        Xml.gravaXml(nomeArquivo, equipes);
    }
    
    @Override
    public void remover(Object objeto) throws Exception {
        Equipe equipe = (Equipe) objeto;
        equipes.remove(equipe);
        Xml.gravaXml(nomeArquivo, equipes);
    }

    @Override
    public List getList() throws Exception{
        equipes = (List<Equipe>) Xml.leXml(nomeArquivo);
        return equipes;
    }
    
}