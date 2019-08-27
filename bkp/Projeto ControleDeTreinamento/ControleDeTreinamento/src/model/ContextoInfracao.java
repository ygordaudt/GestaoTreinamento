package model;

import dao.DadosContextoInfracao;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Ygor
 */
public class ContextoInfracao {
    private final Integer id;
    private String descricao;
    private Integer pontuacao;

    public ContextoInfracao(String descricao, Integer pontuacao) {
        Integer totalContextosInfracao = getTotalContextosInfracao();
        this.id = totalContextosInfracao++;
        this.descricao = descricao;
        this.pontuacao = pontuacao;
    }

    public Integer getId() {
        return id;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(Integer pontuacao) {
        this.pontuacao = pontuacao;
    }

    public List<ContextoInfracao> getContextosInfracao() throws Exception {
        DadosContextoInfracao dadosContextoInfracao = new DadosContextoInfracao();
        List<ContextoInfracao> contextosInfracao = new ArrayList<>();
        try {
            contextosInfracao = dadosContextoInfracao.getList();
        } catch (Exception e) {
            
        }
        return contextosInfracao;
    }
    
    public final Integer getTotalContextosInfracao() {
        Integer totalContextosInfracao = null;
        try {
            totalContextosInfracao = getContextosInfracao().size();
        } catch (Exception e) {
            
        } finally {
            totalContextosInfracao++;
        }

        return totalContextosInfracao;
    }


    @Override
    public String toString() {
        return this.id + " - " + this.getDescricao();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
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
        final ContextoInfracao other = (ContextoInfracao) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
}
