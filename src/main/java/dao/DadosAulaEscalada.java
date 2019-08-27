package dao;

import java.util.ArrayList;
import java.util.List;
import model.AulaEscalada;

public class DadosAulaEscalada implements Dados{
    private static List<AulaEscalada> aulasEscaladas = new ArrayList();
    private static final String nomeArquivo = "\\AulaEscalada.xml";

    @Override
    public void incluir(Object objeto) throws Exception {
        AulaEscalada aulaEscalada = (AulaEscalada) objeto;
        aulasEscaladas.add(aulaEscalada);
        Xml.gravaXml(nomeArquivo, aulasEscaladas);
    }
    
    @Override
    public void alterar() throws Exception {
        Xml.gravaXml(nomeArquivo, aulasEscaladas);
    }
    
    @Override
    public void remover(Object objeto) throws Exception {
        AulaEscalada aulaEscalada = (AulaEscalada) objeto;
        aulasEscaladas.remove(aulaEscalada);
        Xml.gravaXml(nomeArquivo, aulasEscaladas);
    }

    @Override
    public List<AulaEscalada> getList() throws Exception{
        aulasEscaladas = (List<AulaEscalada>) Xml.leXml(nomeArquivo);
        return aulasEscaladas;
    }
    
    public Integer getUltimoRegistro() throws Exception {
        aulasEscaladas = (List<AulaEscalada>) Xml.leXml(nomeArquivo);
        Integer ultimoRegistro;
        if (aulasEscaladas.isEmpty()) {
            ultimoRegistro = 0;
        } else {
            ultimoRegistro = aulasEscaladas.size()+1;
        }

        return ultimoRegistro;
    }

}