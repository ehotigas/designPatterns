package command.proj3.command;

import command.proj3.receiver.Luz;

public class DesligarLuzComando implements ICommand {
    private Luz luz;

    public DesligarLuzComando(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void executar() {
        System.out.println("Luz Desligada");
        this.luz.setLigado(false);        
    }
}
