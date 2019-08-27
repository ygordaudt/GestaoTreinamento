package model;

import dao.DadosAulaEscalada;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Ygor
 */
public class AulaEscalada {
    private final Integer idAulaEscalada;
    private Equipe equipe;
    private LocalDate dataAulaEscalada;
    private EstadoAulaEscalada estadoAulaEscalada;

    public AulaEscalada(Equipe equipe, LocalDate data) {
        this.idAulaEscalada = getProximoRegistro();
        this.equipe = equipe;
        this.dataAulaEscalada = data;
        this.estadoAulaEscalada = EstadoAulaEscalada.ANDAMENTO;
    }

    public void concluirAula() {
        this.estadoAulaEscalada = EstadoAulaEscalada.CONCLUIDO;
    }
    
    private Integer getProximoRegistro() {
        Integer ultimoRegistro = 0;
        try {
            ultimoRegistro = new DadosAulaEscalada().getUltimoRegistro();
        } catch (Exception ex) {
            ex.getMessage();
        }
        ultimoRegistro++;
        return ultimoRegistro;
    }
    
    public Integer getIdAulaEscalada() {
        return idAulaEscalada;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }
    
    public LocalDate getDataAulaEscalada() {
        return dataAulaEscalada;
    }

    public void setDataAulaEscalada(LocalDate dataAulaEscalada) {
        this.dataAulaEscalada = dataAulaEscalada;
    }

    public EstadoAulaEscalada getEstadoAulaEscalada() {
        return estadoAulaEscalada;
    }

    public void setEstadoAulaEscalada(EstadoAulaEscalada estadoAulaEscalada) {
        this.estadoAulaEscalada = estadoAulaEscalada;
    }

    @Override
    public String toString() {
        return dataAulaEscalada.toString();
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.dataAulaEscalada);
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
        final AulaEscalada other = (AulaEscalada) obj;
        if (!Objects.equals(this.dataAulaEscalada, other.dataAulaEscalada)) {
            return false;
        }
        return true;
    }
    
    
}
