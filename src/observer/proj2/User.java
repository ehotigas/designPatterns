package observer.proj2;

public class User implements IUser {
    private String nome;

    public User(String nome) {
        this.nome = nome;
    }

    @Override
    public void notificar(Noticia noticia) {
        System.out.println("Usuário " + nome + " recebeu a notócia " + noticia.getTitulo());
    }
    
}
