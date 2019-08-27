package model;

import java.time.LocalDate;

/**
 *
 * @author Ygor
 */
public class Usuario {
    private final Integer id;
    private String nome;
    private String senha;
    // private TipoUsuario tipo;
    private boolean administrador;
    private LocalDate dataCriacao;
    private boolean logado;
    private static Integer totalUsuarios = 0;

    
    public Usuario(String nome, String senha, boolean administrador) {
        totalUsuarios++;
        this.id = totalUsuarios;
        this.nome = nome;
        this.senha = senha;
        //this.tipo = tipo;
        this.administrador = administrador;
        this.dataCriacao = LocalDate.now();
        this.logado = false;
    }

    public Integer getId() {
        return id;
    }

    public static Integer getTotalUsuarios() {
        return totalUsuarios;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
/*
    public TipoUsuario getTipo() {
        return tipo;
    }

    public void setTipo(TipoUsuario tipo) {
        this.tipo = tipo;
    }
*/

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }
    
    public String getNivelAcesso() {
        if (this.isAdministrador())
            return "Administrador";
        else return "Padrão";
    }
    
    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public boolean isLogado() {
        return logado;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }

    @Override
    public String toString() {
        return this.nome;
    }

}
