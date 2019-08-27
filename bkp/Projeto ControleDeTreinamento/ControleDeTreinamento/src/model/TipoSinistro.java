package model;

/**
 *
 * @author Ygor
 */
public class TipoSinistro {
    private final Integer id;
    private String descricao;
    private static Integer totalTipoSinistro = 0;

    public TipoSinistro(String descricao) {
        totalTipoSinistro++;
        this.id = totalTipoSinistro;
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

    public static Integer getTotalTipoSinistro() {
        return totalTipoSinistro;
    }


    
}
