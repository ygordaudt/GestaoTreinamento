package model;

import dao.DadosTipoInfracao;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Ygor
 */
public class TipoInfracao {
    private final Integer idTipoInfracao;
    private String descricaoTipoInfracao;
    private ContextoInfracao contextoTipoInfracao;

    public TipoInfracao(String descricao, ContextoInfracao contexto) {
        Integer totalTiposInfracao = getTotalTiposInfracao();
        this.idTipoInfracao = totalTiposInfracao++;
        this.descricaoTipoInfracao = descricao;
        this.contextoTipoInfracao = contexto;
    }

    public Integer getIdTipoInfracao() {
        return idTipoInfracao;
    }

    public String getDescricaoTipoInfracao() {
        return descricaoTipoInfracao;
    }

    public void setDescricaoTipoInfracao(String descricaoTipoInfracao) {
        this.descricaoTipoInfracao = descricaoTipoInfracao;
    }

    public ContextoInfracao getContextoTipoInfracao() {
        return contextoTipoInfracao;
    }

    public void setContextoTipoInfracao(ContextoInfracao contextoTipoInfracao) {
        this.contextoTipoInfracao = contextoTipoInfracao;
    }
    
    public List<TipoInfracao> getTiposInfracao() throws Exception {
        DadosTipoInfracao dadosTiposInfracao = new DadosTipoInfracao();
        List<TipoInfracao> tiposInfracao = new ArrayList<>();
        try {
            tiposInfracao = dadosTiposInfracao.getList();
        } catch (Exception e) {
            
        }
        return tiposInfracao;
    }
    
    public final Integer getTotalTiposInfracao() {
        Integer totalTiposInfracao = null;
        try {
            totalTiposInfracao = getTiposInfracao().size();
        } catch (Exception e) {
            
        } finally {
            totalTiposInfracao++;
        }
        return totalTiposInfracao;
    }

    @Override
    public String toString() {
        return idTipoInfracao + " - " + this.getDescricaoTipoInfracao();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.idTipoInfracao);
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
        final TipoInfracao other = (TipoInfracao) obj;
        if (!Objects.equals(this.idTipoInfracao, other.idTipoInfracao)) {
            return false;
        }
        return true;
    }
    
    
}