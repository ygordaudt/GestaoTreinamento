package model;

import dao.DadosEquipe;
import gui.GuiEscala;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ygor
 */
public class Equipe {
    private final Integer idEquipe;
    private Empresa empresa;
    private CorEquipe corEquipe;
    private String descricaoEquipe;
    private List<AulaEscalada> aulasEscaladas;

    public Equipe(Empresa empresa, CorEquipe corEquipe) {
        Integer totalEquipes = getTotalEquipes();
        this.idEquipe = totalEquipes++;
        this.empresa = empresa;
        this.corEquipe = corEquipe;
        this.descricaoEquipe = empresa.getNomeEmpresa() + "-" + corEquipe.getDescricao();
        this.aulasEscaladas = new ArrayList<>();
    }
    
    public void inserirAulaEscalada(LocalDate data) throws Exception {
        for (AulaEscalada aula : this.getAulasEscaladas()) {
            if(aula.getDataAulaEscalada().equals(data)) throw new Exception ("Impossível! \nEsta data já exite!");
        }
        this.aulasEscaladas.add(new AulaEscalada(data));
    }
    
    public void removerAulaEscalada(AulaEscalada aulaEscalada) throws Exception  {
        if (aulaEscalada.getEstadoAulaEscalada().equals(EstadoAulaEscalada.CONCLUIDO)) throw new Exception ("Impossível! \nEsta data já foi concluída!");
        this.aulasEscaladas.remove(aulaEscalada);
    }

    public Integer getIdEquipe() {
        return idEquipe;
    }

    public Empresa getEmpresa() {
        return empresa;
    }
    
    public String getDescricaoEquipe() {
        return descricaoEquipe;
    }

    public CorEquipe getCorEquipe() {
        return corEquipe;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
        this.descricaoEquipe = empresa.getNomeEmpresa() + "-" + this.getCorEquipe().getDescricao();
    }

    public void setCorEquipe(CorEquipe corEquipe) {
        this.corEquipe = corEquipe;
    }

    public void setDescricaoEquipe(String descricaoEquipe) {
        this.descricaoEquipe = descricaoEquipe;
    }

    public List<AulaEscalada> getAulasEscaladas() {
        return aulasEscaladas;
    }

    public void setAulasEscaladas(List<AulaEscalada> aulasEscaladas) {
        this.aulasEscaladas = aulasEscaladas;
    }
    
    public List<Equipe> getEquipes() {
        DadosEquipe dadosEquipe = new DadosEquipe();
        List<Equipe> equipes = new ArrayList<>();
        try {
            equipes = dadosEquipe.getList();
        } catch (Exception e) {
            
        }
        return equipes;
    }
    
    public final Integer getTotalEquipes() {
        Integer totalEquipes = getEquipes().size();
        totalEquipes++;
        return totalEquipes;
    }
    
    @Override
    public String toString() {
        return idEquipe + " - " + this.getEmpresa().getNomeEmpresa() + " - " + this.corEquipe.getDescricao();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.idEquipe);
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
        final Equipe other = (Equipe) obj;
        if (!Objects.equals(this.idEquipe, other.idEquipe)) {
            return false;
        }
        return true;
    }
    
    

}