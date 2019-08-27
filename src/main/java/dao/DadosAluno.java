package dao;

import java.util.ArrayList;
import java.util.List;
import model.Aluno;

public class DadosAluno implements Dados{
    private static List<Aluno> alunos = new ArrayList();
    private static final String nomeArquivo = "\\Aluno.xml";

    @Override
    public void incluir(Object objeto) throws Exception {
        Aluno aluno = (Aluno) objeto;
        alunos.add(aluno);
        Xml.gravaXml(nomeArquivo, alunos);
    }
    
    @Override
    public void alterar() throws Exception {
        Xml.gravaXml(nomeArquivo, alunos);
    }
    
    @Override
    public void remover(Object objeto) throws Exception {
        Aluno aluno = (Aluno) objeto;
        alunos.remove(aluno);
        Xml.gravaXml(nomeArquivo, alunos);
    }

    @Override
    public List<Aluno> getList() throws Exception{
        alunos = (List<Aluno>) Xml.leXml(nomeArquivo);
        return alunos;
    }

}