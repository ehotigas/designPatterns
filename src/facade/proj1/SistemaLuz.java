package facade.proj1;

public class SistemaLuz {
    private boolean ligado;

    public SistemaLuz() {
        this.ligado = false;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}
