package facade.proj1;

public class Projetor {
    private int brilho;
    private boolean ligado;

    public Projetor(int brilho) {
        this.brilho = brilho;
        this.ligado = false;
    }

    public int getBrilho() {
        return brilho;
    }

    public void setBrilho(int brilho) {
        this.brilho = brilho;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}
