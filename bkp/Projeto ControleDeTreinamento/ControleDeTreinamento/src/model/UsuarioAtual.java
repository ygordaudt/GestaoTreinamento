package model;

/**
 *
 * @author Ygor
 */
public class UsuarioAtual {
    private Usuario nome;

    public UsuarioAtual(Usuario nome) {
        this.nome = nome;
    }

    public Usuario getNome() {
        return nome;
    }

    public void setNome(Usuario nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome.getNome();
    }

}