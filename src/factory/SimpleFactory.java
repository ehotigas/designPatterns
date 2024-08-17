package factory;

import java.util.function.Supplier;
import java.util.Scanner;

interface Animal {
    public void falar();
}

class Cachorro implements Animal {
    public void falar() {
        System.out.println("Au Au");
    }
}

class Gato implements Animal {
    public void falar() {
        System.out.println("Meow");
    }
}

enum SimpleFactoryEnum {
    CACHORRO(() -> new Cachorro()),
    GATO(() -> new Gato());

    private final Supplier<Animal> constructor;

    SimpleFactoryEnum(Supplier<Animal> constructor) {
        this.constructor = constructor;
    }

    public Animal create() {
        return constructor.get();
    }
}

public class SimpleFactory {
    public SimpleFactory() {
        
    }

    public Animal instanciarAnimal(SimpleFactoryEnum animal) {
        return animal.create();
    }
}

class Test {
    private static final Scanner stdin = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Escolha um dos animais a seguir: (Cachorro, Gato): ");
        String entrada = stdin.nextLine().toUpperCase();
        
        SimpleFactory factory = new SimpleFactory();
        Animal animal = factory.instanciarAnimal(SimpleFactoryEnum.valueOf(entrada));
        animal.falar();
    }
}
