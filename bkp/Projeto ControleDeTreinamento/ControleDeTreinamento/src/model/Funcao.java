package model;

import dao.DadosFuncao;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Ygor
 */
public class Funcao {
    private final Integer idFuncao;
    private String descricaoFuncao;

    public Funcao(String descricao) {
        Integer totalFuncoes = getTotalFuncoes();
        this.idFuncao = totalFuncoes++;
        this.descricaoFuncao = descricao;
    }

    public Integer getIdFuncao() {
        return idFuncao;
    }

    public String getDescricaoFuncao() {
        return descricaoFuncao;
    }

    public void setDescricaoFuncao(String descricaoFuncao) {
        this.descricaoFuncao = descricaoFuncao;
    }

    public List<Funcao> getFuncoes() {
        DadosFuncao dadosFuncao = new DadosFuncao();
        List<Funcao> funcoes = new ArrayList<>();
        try {
            funcoes = dadosFuncao.getList();
        } catch (Exception e) {
            
        }
        return funcoes;
    }
    
    public final Integer getTotalFuncoes() {
        Integer totalEmpresas = getFuncoes().size();
        totalEmpresas++;
        return totalEmpresas;
    }
    
    @Override
    public String toString() {
        return idFuncao + " - " + this.getDescricaoFuncao();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.idFuncao);
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
        final Funcao other = (Funcao) obj;
        if (!Objects.equals(this.idFuncao, other.idFuncao)) {
            return false;
        }
        return true;
    }
    
    
}
