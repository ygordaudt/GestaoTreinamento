package model;

import java.util.Objects;

/**
 *
 * @author Ygor
 */
public class TipoPercurso {
    private final Integer id;
    private String descricao;
    private static Integer totalTiposTrajeto = 0;

    public TipoPercurso(String descricao) {
        totalTiposTrajeto++;
        this.id = totalTiposTrajeto;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public static Integer getTotalTiposTrajeto() {
        return totalTiposTrajeto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return id.toString() + " - " + descricao;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.id);
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
        final TipoPercurso other = (TipoPercurso) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
}
