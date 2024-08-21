package template.proj2;

import java.util.Scanner;
import java.util.function.Supplier;

abstract class Viagem {
    abstract void ida();
    abstract void programacao();
    abstract void volta();

    public final void templateMethod() {
        ida();
        programacao();
        volta();
    }
}

class ViagemVeneza extends Viagem {

    @Override
    void ida() {
        System.out.println("Viagem de avião");
    }

    @Override
    void programacao() {
        System.out.println("Dia 1: Visita a Basílica de São Marcos");
        System.out.println("Dia 2: Visita ao Palácio Doge");
        System.out.println("Dia 3: Aproveitar a comida local");
        
    }

    @Override
    void volta() {
        System.out.println("Viagem de avião");
    }
}

class ViagemMalvinas extends Viagem {

    @Override
    void ida() {
        System.out.println("Viagem de ônibus");
    }

    @Override
    void programacao() {
        System.out.println("Dia 1: Apreciar a vida marinha");
        System.out.println("Dia 2: Praticar esportes");
        
    }

    @Override
    void volta() {
        System.out.println("Viagem de avião");
    }

}

enum ViagemFactory {
    MALVINAS(ViagemMalvinas::new),
    VENEZA(ViagemVeneza::new);
    private Supplier<Viagem> builder;

    ViagemFactory(Supplier<Viagem> builder) {
        this.builder = builder;
    }

    public Viagem build() {
        return builder.get();
    }
}

public class Proj2 {
    private static final Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Escolha a viagem (Malvinas, Veneza): ");
        String opcao = entrada.nextLine().toUpperCase();

        Viagem viagem = ViagemFactory.valueOf(opcao).build();
        viagem.templateMethod();
    }
}
