package dao;

import model.Usuario;
import java.util.ArrayList;
import java.util.List;

public class DadosUsuario implements Dados {
    private static List<Usuario> loginUsuarios = new ArrayList();
    private static final String nomeArquivo = "\\Usuarios.xml"; 

    @Override
    public void incluir(Object objeto) throws Exception {
        Usuario loginUsuario = (Usuario) objeto;
        loginUsuarios.add(loginUsuario);
        Xml.gravaXml(nomeArquivo, loginUsuarios);
    }
    
    @Override
    public void alterar() throws Exception {
        Xml.gravaXml(nomeArquivo, loginUsuarios);
    }
    @Override
    public void remover(Object objeto) throws Exception {
        Usuario loginUsuario = (Usuario) objeto;
        loginUsuarios.remove(loginUsuario);
        Xml.gravaXml(nomeArquivo, loginUsuarios);
    }

    @Override
    public List getList() throws Exception{
        loginUsuarios = (List<Usuario>) Xml.leXml(nomeArquivo);
        return loginUsuarios;
    }
    
}