package dao;

import java.util.ArrayList;
import java.util.List;
import model.Empresa;

public class DadosEmpresa implements Dados{
    private static List<Empresa> empresas = new ArrayList();
    private static final String nomeArquivoEmpresa = "\\Empresa.xml";

    @Override
    public void incluir(Object objeto) throws Exception {
        Empresa empresa = (Empresa) objeto;
        empresas.add(empresa);
        Xml.gravaXml(nomeArquivoEmpresa, empresas);
    }
    
    @Override
    public void alterar() throws Exception {
        Xml.gravaXml(nomeArquivoEmpresa, empresas);
    }
    
    @Override
    public void remover(Object objeto) throws Exception {
        Empresa empresa = (Empresa) objeto;
        empresas.remove(empresa);
        Xml.gravaXml(nomeArquivoEmpresa, empresas);
    }

    @Override
    public List<Empresa> getList() throws Exception{
        empresas = (List<Empresa>) Xml.leXml(nomeArquivoEmpresa);
        return empresas;
    }

}