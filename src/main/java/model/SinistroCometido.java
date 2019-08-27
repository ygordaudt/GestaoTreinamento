package model;

/**
 *
 * @author Ygor
 */
public class SinistroCometido {
    private final Integer idSinistroCometido;
    private TipoSinistro tipoSinistro;
    private LocalSinistro localSinistro;
    private Integer numeroCarro;
    private String descricaoLocal;
    private String observacao;

    public SinistroCometido(Aluno aluno, Integer numeroCarro, TipoSinistro tipoSinistro, LocalSinistro localSinistro, String descricaoLocal) {
        Integer totalSinistros = aluno.getSinistrosCometidos().size();
        this.idSinistroCometido = totalSinistros++;
        this.numeroCarro = numeroCarro;
        this.tipoSinistro = tipoSinistro;
        this.localSinistro = localSinistro;
        this.descricaoLocal = descricaoLocal;
    }

    public Integer getIdSinistroCometido() {
        return idSinistroCometido;
    }

    public TipoSinistro getTipoSinistro() {
        return tipoSinistro;
    }

    public void setTipoSinistro(TipoSinistro tipoSinistro) {
        this.tipoSinistro = tipoSinistro;
    }

    public LocalSinistro getLocalSinistro() {
        return localSinistro;
    }

    public void setLocalSinistro(LocalSinistro localSinistro) {
        this.localSinistro = localSinistro;
    }

    public Integer getNumeroCarro() {
        return numeroCarro;
    }

    public void setNumeroCarro(Integer numeroCarro) {
        this.numeroCarro = numeroCarro;
    }

    public String getDescricaoLocal() {
        return descricaoLocal;
    }

    public void setDescricaoLocal(String descricaoLocal) {
        this.descricaoLocal = descricaoLocal;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return idSinistroCometido.toString();
    }
    
    
}
