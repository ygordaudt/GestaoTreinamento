package model;

import dao.DadosEmpresa;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 *
 * @author Ygor
 */
public class Empresa {
    private final Integer idEmpresa;
    private String nomeEmpresa;

    public Empresa(String nome) {
        Integer totalEmpresas = getTotalEmpresas();
        this.idEmpresa = totalEmpresas++;
        this.nomeEmpresa = nome;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }
    
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public List<Empresa> getEmpresas() throws Exception {
        DadosEmpresa dadosEmpresa = new DadosEmpresa();
        List<Empresa> empresas = new ArrayList<>();
        try {
            empresas = dadosEmpresa.getList();
        } catch (Exception e) {
            
        }
        return empresas;
    }
    
    public final Integer getTotalEmpresas() {
        Integer totalEmpresas = null;
        try {
            totalEmpresas = getEmpresas().size();
        } catch (Exception e) {
            
        } finally {
            totalEmpresas++;
        }
        return totalEmpresas;
    }
    
    @Override
    public String toString() {
        return idEmpresa + " - " + this.getNomeEmpresa();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.idEmpresa);
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
        final Empresa other = (Empresa) obj;
        if (!Objects.equals(this.idEmpresa, other.idEmpresa)) {
            return false;
        }
        return true;
    }
    
}
