package proxy.proj2;

public class Documento implements IDocumento {
    private String conteudo;
    private String titulo;

    public Documento(
        String conteudo,
        String titulo
    ) {
        this.conteudo = conteudo;
        this.titulo = titulo;
    }

    @Override
    public String exibir() {
        return (
            "Título: " +
            titulo +
            "\n" +
            conteudo
        );
    }

    @Override
    public void editar(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
