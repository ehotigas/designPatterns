package injecaodependencia;

@Injectable()
class ServiceA {
    @Override
    public String toString() {
        return "Teste";
    }
}

@Injectable()
class ServiceB {
    @Inject(token = "serviceA")
    private ServiceA serviceA;

    public ServiceA getServiceA() {
        return serviceA;
    }

    public void setServiceA(ServiceA serviceA) {
        this.serviceA = serviceA;
    }
}

public class Test {
    public static void main(String[] args) throws Exception {
        DIContainer container = new DIContainer();

        // Registrar classes no container
        container.register("serviceA", ServiceA.class);
        container.register("serviceB", ServiceB.class);

        // Obter instância por token
        ServiceB serviceB = container.getInstance("serviceB", ServiceB.class);
        // serviceB.doSomethingElse();
        System.out.println(serviceB.getServiceA());
    }
}
