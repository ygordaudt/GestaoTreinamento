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
public class Instrutor extends Colaborador {
    
    public Instrutor(Empresa empresa, Funcao funcao, Integer matricula, String nome, EstadoColaborador estadoColaborador) {
        super(empresa, funcao, matricula, nome, estadoColaborador);
    }

    
    @Override
    public String toString() {
        return super.getMatricula().toString() + " - " + super.getNome();
    }
    
    
}
