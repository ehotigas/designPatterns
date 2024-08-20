package command.proj3.command;

import command.proj3.receiver.Luz;

public class LigarLuzComando implements ICommand {
    private Luz luz;

    public LigarLuzComando(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void executar() {
        System.out.println("Luz Ligada");
        this.luz.setLigado(true);        
    }
}
