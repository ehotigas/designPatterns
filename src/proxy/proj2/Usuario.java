package proxy.proj2;

public class Usuario {
    private String nome;
    private NivelAcesso nivelAcesso;

    public Usuario(
        String nome,
        NivelAcesso nivelAcesso
    ) {
        this.nome = nome;
        this.nivelAcesso = nivelAcesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelAcesso getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(NivelAcesso nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
}
