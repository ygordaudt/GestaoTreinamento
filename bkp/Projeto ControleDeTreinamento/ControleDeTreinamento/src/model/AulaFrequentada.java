package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Ygor
 */
public class AulaFrequentada {
    private final AulaEscalada aulaEscalada;
    private Instrutor nomeInstrutor;
    private TipoPercurso tipoPercurso;
    private String numeroCarro;
    private String descricaoParecer;
    private List<InfracaoCometida> infracoesCometidas;
    private Integer pontuacaoAulaFrequentada;
    private boolean presenca;

    public AulaFrequentada(AulaEscalada aulaEscalada, Instrutor instrutor, TipoPercurso tipoPercurso, String numeroCarro, boolean presenca) {
        this.aulaEscalada = aulaEscalada;
        this.nomeInstrutor = instrutor;
        this.tipoPercurso = tipoPercurso;
        this.numeroCarro = numeroCarro;
        this.infracoesCometidas = new ArrayList<>();
        this.pontuacaoAulaFrequentada = 0;
        this.presenca = presenca;
    }

    public void inserirInfracao(TipoInfracao infracao) {
        this.infracoesCometidas.add(new InfracaoCometida(infracao));
        this.setPontuacaoAulaFrequentada(pontuacaoAulaFrequentada+=infracao.getContextoTipoInfracao().getPontuacao());
    }
    
    public void deletarInfracaoCometida(InfracaoCometida infracaoCometida) {
        this.infracoesCometidas.remove(infracaoCometida);
        this.setPontuacaoAulaFrequentada(pontuacaoAulaFrequentada-=infracaoCometida.getTipoInfracao().getContextoTipoInfracao().getPontuacao());
    }

    public Instrutor getInstrutor() {
        return nomeInstrutor;
    }

    public TipoPercurso getTipoPercurso() {
        return tipoPercurso;
    }

    public void setTipoPercurso(TipoPercurso tipoPercurso) {
        this.tipoPercurso = tipoPercurso;
    }

    public void setNomeInstrutor(Instrutor nomeInstrutor) {
        this.nomeInstrutor = nomeInstrutor;
    }

    public String getNumeroCarro() {
        return numeroCarro;
    }

    public void setNumeroCarro(String numeroCarro) {
        this.numeroCarro = numeroCarro;
    }

    public String getDescricaoParecer() {
        return descricaoParecer;
    }

    public void setDescricaoParecer(String descricaoParecer) {
        this.descricaoParecer = descricaoParecer;
    }

    public List<InfracaoCometida> getInfracoesCometidas() {
        return infracoesCometidas;
    }

    public void setInfracoesCometidas(List<InfracaoCometida> infracoesCometidas) {
        this.infracoesCometidas = infracoesCometidas;
    }

    public Integer getPontuacaoAulaFrequentada() {
        return pontuacaoAulaFrequentada;
    }

    public void setPontuacaoAulaFrequentada(Integer pontuacaoAulaFrequentada) {
        this.pontuacaoAulaFrequentada = pontuacaoAulaFrequentada;
    }

    public Boolean getPresenca() {
        return presenca;
    }

    public void setPresenca(Boolean presenca) {
        this.presenca = presenca;
    }

    public AulaEscalada getAulaEscalada() {
        return aulaEscalada;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.aulaEscalada);
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
        final AulaFrequentada other = (AulaFrequentada) obj;
        if (!Objects.equals(this.aulaEscalada, other.aulaEscalada)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return aulaEscalada.toString();
    }


}