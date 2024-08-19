package observer.proj2;

public class Noticia {
    private String descricao;
    private String titulo;

    public Noticia(String titulo, String descricao) {
        this.descricao = descricao;
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
