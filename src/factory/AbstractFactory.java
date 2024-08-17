package factory;

interface Pizza {
    void preparar();
    void assar();
    void embalar();
}

class PizzaItaliana implements Pizza {
    @Override
    public void preparar() {
        System.out.println("A pizza Italiana está sendo preparada...");
    }

    @Override
    public void assar() {
        System.out.println("A pizza Italiana está sendo assada...");
    }

    @Override
    public void embalar() {
        System.out.println("A pizza Italiana está sendo embadala...");
    }
}

class PizzaCalabreza implements Pizza {
    @Override
    public void preparar() {
        System.out.println("A pizza de Calabreza está sendo preparada...");
    }

    @Override
    public void assar() {
        System.out.println("A pizza de Calabreza está sendo assada...");
    }

    @Override
    public void embalar() {
        System.out.println("A pizza de Calabreza está sendo embadala...");
    }
}



interface Ingrediente {
   String getDescription();
}

class Manjeiricao implements Ingrediente {
    private final String description = "Manjeiricao";

    @Override
    public String getDescription() {
        return description;
    }
}

class Calabreza implements Ingrediente {
    private final String description = "Calabresa";

    @Override
    public String getDescription() {
        return description;
    }
}




interface IAbstractFactory {
    Pizza criarPizza();
    Ingrediente criarIngrediente();
}

class PizzaItalianaFactory implements IAbstractFactory {
    @Override
    public Pizza criarPizza() {
        return new PizzaItaliana();
    }

    @Override
    public Ingrediente criarIngrediente() {
        return new Manjeiricao();
    }
}

class PizzaCalabrezaFactory implements IAbstractFactory {
    @Override
    public Pizza criarPizza() {
        return new PizzaCalabreza();
    }

    @Override
    public Ingrediente criarIngrediente() {
        return new Calabreza();
    }
}

