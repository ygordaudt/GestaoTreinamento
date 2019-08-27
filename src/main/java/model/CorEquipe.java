package model;

import dao.DadosCorEquipe;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Ygor
 */
public class CorEquipe {
    private final Integer id;
    private String descricao;

    public CorEquipe(String descricao) {
        Integer totalCoresEquipe = getTotalCoresEquipe();
        this.id = totalCoresEquipe++;
        this.descricao = descricao;
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

    public List<CorEquipe> getCoresEquipe() {
        DadosCorEquipe dadosCorEquipe = new DadosCorEquipe();
        List<CorEquipe> coresEquipe = new ArrayList<>();
        try {
            coresEquipe = dadosCorEquipe.getList();
        } catch (Exception e) {
            
        }
        return coresEquipe;
    }
    
    public final Integer getTotalCoresEquipe() {
        Integer totalCoresEquipes = getCoresEquipe().size();
        totalCoresEquipes++;
        return totalCoresEquipes;
    }
    
    @Override
    public String toString() {
        return this.getDescricao();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id);
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
        final CorEquipe other = (CorEquipe) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
}
