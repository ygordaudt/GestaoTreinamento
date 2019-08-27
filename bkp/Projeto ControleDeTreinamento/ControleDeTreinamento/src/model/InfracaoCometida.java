package model;

import java.util.Objects;

/**
 *
 * @author Ygor
 */
public class InfracaoCometida {
    private final TipoInfracao tipoInfracao;

    public InfracaoCometida(TipoInfracao tipoInfracao) {
        this.tipoInfracao = tipoInfracao;
    }

    public TipoInfracao getTipoInfracao() {
        return tipoInfracao;
    }

    @Override
    public String toString() {
        return tipoInfracao.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.tipoInfracao);
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
        final InfracaoCometida other = (InfracaoCometida) obj;
        if (!Objects.equals(this.tipoInfracao, other.tipoInfracao)) {
            return false;
        }
        return true;
    }
    
    
    
}
