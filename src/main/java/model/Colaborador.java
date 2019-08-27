/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Ygor
 */
public abstract class Colaborador {
    protected Empresa empresaColaborador;
    protected Funcao funcaoColaborador;
    protected EstadoColaborador estadoColaborador;
    protected Integer matricula;
    protected String nome;

    public Colaborador(Empresa empresa, Funcao funcao, Integer matricula, String nome, EstadoColaborador estadoColaborador) {
        this.empresaColaborador = empresa;
        this.funcaoColaborador = funcao;
        this.estadoColaborador = EstadoColaborador.ATIVO;
        this.matricula = matricula;
        this.nome = nome;
    }

    public Empresa getEmpresaColaborador() {
        return empresaColaborador;
    }

    public void setEmpresaColaborador(Empresa empresaColaborador) {
        this.empresaColaborador = empresaColaborador;
    }

    public Funcao getFuncaoColaborador() {
        return funcaoColaborador;
    }

    public void setFuncaoColaborador(Funcao funcaoColaborador) {
        this.funcaoColaborador = funcaoColaborador;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EstadoColaborador getEstadoColaborador() {
        return estadoColaborador;
    }

    public void setEstadoColaborador(EstadoColaborador estadoColaborador) {
        this.estadoColaborador = estadoColaborador;
    }

}
