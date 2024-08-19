package observer.proj2;

import java.util.List;

public class Categoria {
    private List<Noticia> noticias;
    private List<IUser> usuarios;

    public Categoria(
        List<Noticia> noticias,
        List<IUser> usuarios
    ) {
        this.noticias = noticias;
        this.usuarios = usuarios;
    }

    public void adicionarUsuario(IUser usuario) {
        usuarios.add(usuario);
    }

    public boolean removerUsuario(IUser usuario) {
        return usuarios.remove(usuario);
    }

    public void publicarNoticia(Noticia noticia) {
        noticias.add(noticia);
        for (IUser usuario : usuarios) {
            usuario.notificar(noticia);
        }
    }
}
