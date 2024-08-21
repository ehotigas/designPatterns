package template.proj1;

abstract class ClasseAbstrata {
    abstract void operacao1();

    abstract void operacao2();
    
    public final void templateMethod() {
        System.out.println("Definindo o algoritmo: realizar Operação 1, depois realizar operação 2");
        operacao1();
        operacao2();
    }
}

class ClasseConcreta extends ClasseAbstrata {
    @Override
    void operacao1() {
        System.out.println("Operação Concreta 1");
        
    }

    @Override
    void operacao2() {
        System.out.println("Operação Concreta 2");
    }
}

public class Proj1 {
    public static void main(String[] args) {
        ClasseConcreta cc = new ClasseConcreta();
        cc.templateMethod();
    }
}
