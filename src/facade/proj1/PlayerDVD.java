package facade.proj1;

public class PlayerDVD {
    private String dnv;
    private boolean ligado;
    private boolean pausado;

    public PlayerDVD() {
        this.dnv = "";
        this.ligado = false;
        this.pausado = true;
    }

    public String getDnv() {
        return dnv;
    }

    public void setDnv(String dnv) {
        this.dnv = dnv;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isPausado() {
        return pausado;
    }

    public void setPausado(boolean pausado) {
        this.pausado = pausado;
    }

    
}
