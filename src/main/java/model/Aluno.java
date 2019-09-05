/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.DadosAluno;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Ygor
 */
public class Aluno extends Colaborador {
    private final Integer idAluno;
    private Equipe equipeAluno;
    private EstadoAluno estadoAluno;
    private List<SinistroCometido> sinistrosCometidos;
    private Integer pontuacaoAluno;

    public Aluno(Empresa empresa, Funcao funcao, Integer matricula, String nome, EstadoColaborador estadoColaborador) {
        super(empresa, funcao, matricula, nome, estadoColaborador);
        Integer totalAlunos = getTotalAlunos();
        this.idAluno = totalAlunos++;
        this.estadoAluno = EstadoAluno.NAO_MATRICULADO;
        this.pontuacaoAluno = 0;
    }
   /*
    public void inserirAulaFrequentada(AulaEscalada aulaEscalada, Instrutor instrutor, TipoPercurso tipoPercurso, String numeroCarro, boolean presenca) {
        this.aulasFrequentadas.add(new AulaFrequentada(aulaEscalada, instrutor, tipoPercurso, numeroCarro, presenca));
    }
    
    public void deletarPunicao(AulaFrequentada aulaFrequentada) {
        this.aulasFrequentadas.remove(aulaFrequentada);
    }
    */
    public void inserirSinistroCometido(Integer numeroCarro, TipoSinistro tipoSinistro, LocalSinistro localSinistro, String descricaoLocal) {
        this.sinistrosCometidos.add(new SinistroCometido(this, numeroCarro, tipoSinistro, localSinistro, descricaoLocal));
    }
    
    public void deletarSinistroCometido(SinistroCometido sinistroCometido) {
        this.sinistrosCometidos.remove(sinistroCometido);
    }

    public Equipe getEquipeAluno() {
        return equipeAluno;
    }

    public void setEquipeAluno(Equipe equipeAluno) {
        this.equipeAluno = equipeAluno;
    }

    public void setEstadoAluno(EstadoAluno estadoAluno) {
        this.estadoAluno = estadoAluno;
    }
    
    public EstadoAluno getEstadoAluno() {
        return estadoAluno;
    }

    public void setSituacaoAluno(EstadoAluno estadoAluno) {
        this.estadoAluno = estadoAluno;
    }


    public List<SinistroCometido> getSinistrosCometidos() {
        return sinistrosCometidos;
    }

    public void setSinistrosCometidos(List<SinistroCometido> sinistrosCometidos) {
        this.sinistrosCometidos = sinistrosCometidos;
    }

    public Integer getPontuacaoAluno() {
        return pontuacaoAluno;
    }

    public void setPontuacaoAluno(Integer pontuacaoAluno) {
        this.pontuacaoAluno = pontuacaoAluno;
    }
    
    public void matricularAluno(Equipe equipe) {
        this.setEquipeAluno(equipe);
        this.setEstadoAluno(EstadoAluno.MATRICULADO);
    }
    
    public void desmatricularAluno() {
        this.setEquipeAluno(null);
        this.setEstadoAluno(EstadoAluno.NAO_MATRICULADO);
    }
    
    public List<Aluno> getAlunos() throws Exception {
        DadosAluno dadosAluno = new DadosAluno();
        List<Aluno> alunos = new ArrayList<>();
        try {
            alunos = dadosAluno.getList();
        } catch (Exception e) {
            
        }
        return alunos;
    }
    
    public final Integer getTotalAlunos() {
        Integer totalAlunos = null;
        try {
            totalAlunos = getAlunos().size();
        } catch (Exception e) {
            
        } finally {
            totalAlunos++;
        }
        return totalAlunos;
    }
    /*
    public Integer getPontuacaoTotal() {
        Integer somaPontuacao = 0;
        for (int i=0; i<this.aulasFrequentadas.size(); i++) {
            somaPontuacao+=this.aulasFrequentadas.get(i).getPontuacaoAulaFrequentada();
        }
        return somaPontuacao;
    }
    */
    @Override
    public String toString() {
        return this.getMatricula() + " - " + this.getNome();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.idAluno);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.idAluno, other.idAluno)) {
            return false;
        }
        return true;
    }

    
    
}