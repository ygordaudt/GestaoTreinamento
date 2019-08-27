package dao;

import java.util.ArrayList;
import java.util.List;
import model.TipoPercurso;

public class DadosTipoPercurso implements Dados {
    private static List<TipoPercurso> tiposPercurso = new ArrayList();
    private static final String nomeArquivo = "\\TipoPercurso.xml"; 

    @Override
    public void incluir(Object objeto) throws Exception {
        TipoPercurso tipoPercurso = (TipoPercurso) objeto;
        tiposPercurso.add(tipoPercurso);
        Xml.gravaXml(nomeArquivo, tiposPercurso);
    }

    @Override
    public void alterar() throws Exception {
        Xml.gravaXml(nomeArquivo, tiposPercurso);
    }
    
    @Override
    public void remover(Object objeto) throws Exception {
        TipoPercurso tipoPercurso = (TipoPercurso) objeto;
        tiposPercurso.remove(tipoPercurso);
        Xml.gravaXml(nomeArquivo, tiposPercurso);
    }

    @Override
    public List getList() throws Exception{
        tiposPercurso = (List<TipoPercurso>) Xml.leXml(nomeArquivo);
        return tiposPercurso;
    }
    
}