package command.proj1;


interface Comando {
    void executar();
}

class ComandoConcreto implements Comando {
    private Receiver receiver;

    public ComandoConcreto(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void executar() {
        this.receiver.acao();
    }
}

class Receiver {
    public void acao() {
        System.out.println("Ação do Receiver.");
    }
}

class Invoker {
    private Comando cmd;

    public void setCmd(Comando cmd) {
        this.cmd = cmd;
    }

    public void executar() {
        if (cmd != null) {
            cmd.executar();
        }
    }
}

public class Proj1 {
    public static void main(String[] args) {
        Receiver recv = new Receiver();
        ComandoConcreto cmd = new ComandoConcreto(recv);

        Invoker invk = new Invoker();
        invk.setCmd(cmd);
        invk.executar();
    }
}
