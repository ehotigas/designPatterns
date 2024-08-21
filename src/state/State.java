package state;

interface IState {
    void manipular();
}

class StateConcretoA implements IState {
    public void manipular() {
        System.out.println("StateConcretoA");
    }
}

class StateConcretoB implements IState {
    public void manipular() {
        System.out.println("StateConcretoB");
    }
}


class Context {
    private IState state;

    public void manipular() {
        state.manipular();
    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }
}

public class State {
    /*
     * State:
     *  - Neste padrão um objeto pode encapsular vários comportamentos de acordo com seu estado interno.
     *  - O padrão State também é considerado uma maneira de um objeto alterar seu comportamento em tempo de execução.
     */

     public static void main(String[] args) {
        IState a = new StateConcretoA();
        IState b = new StateConcretoB();

        Context context = new Context();
        context.setState(a);
        context.manipular();
        
        context.setState(b);
        context.manipular();
     }
}
