package command.proj3.receiver;

public class Luz {
    // Receiver
    private boolean ligado;

    public Luz() {
        ligado = false;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isLigado() {
        return ligado;
    }
}
