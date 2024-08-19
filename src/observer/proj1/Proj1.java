package observer.proj1;

import java.util.function.BiConsumer;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

interface TipoInscricao {
    void notificar(Noticia noticia);
}

class InscritoSMS implements TipoInscricao {
    private BiConsumer<String, Noticia> handler;
    private String id;
    public InscritoSMS(BiConsumer<String, Noticia> handler) {
        this.handler = handler;
        id = "SMS." + UUID.randomUUID().toString();
    }

    @Override
    public void notificar(Noticia noticia) {
        handler.accept(id, noticia);
    }
}

class InscritoEmail implements TipoInscricao {
    private BiConsumer<String, Noticia> handler;
    private String id;
    public InscritoEmail(BiConsumer<String, Noticia> handler) {
        this.handler = handler;
        id = "Email." + UUID.randomUUID().toString();
    }

    @Override
    public void notificar(Noticia noticia) {
        handler.accept(id, noticia);
    }
}

class InscritoWhatsApp implements TipoInscricao {
    private BiConsumer<String, Noticia> handler;
    private String id;
    public InscritoWhatsApp(BiConsumer<String, Noticia> handler) {
        this.handler = handler;
        id = "Whatsapp." + UUID.randomUUID().toString();
    }

    @Override
    public void notificar(Noticia noticia) {
        handler.accept(id, noticia);
    }
}



class Noticia {
    private String materia;
    public Noticia(String materia) {
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }
}



class AgenciaNoticias<T extends TipoInscricao> {
    private List<T> inscritos;
    private Noticia ultimaNoticia;

    public AgenciaNoticias() {
        inscritos = new ArrayList<>();
        ultimaNoticia = null;
    }

    public void inscrever(T inscrito) {
        inscritos.add(inscrito);
    }

    public T desinscrever() {
        return inscritos.remove(inscritos.size() - 1);
    }

    public void notificarTodos() {
        for (T inscrito : inscritos) {
            inscrito.notificar(ultimaNoticia);
        }
    }

    public void adicionarNoticia(Noticia noticia) {
        this.ultimaNoticia = noticia;
    }

    public Noticia getUltimaNoticia() {
        return ultimaNoticia;
    }
}

public class Proj1 {
    public static void main(String[] args) {
        BiConsumer<String, Noticia> handler = (String id, Noticia noticia) -> {
            System.out.println(id + ": " + noticia.getMateria());
        };
        
        InscritoSMS sms = new InscritoSMS(handler);
        InscritoEmail email = new InscritoEmail(handler);
        InscritoWhatsApp zap = new InscritoWhatsApp(handler);
        Noticia noticia = new Noticia("Teste");

        AgenciaNoticias<TipoInscricao> agenciaNoticias = new AgenciaNoticias<TipoInscricao>();
        agenciaNoticias.inscrever(sms);
        agenciaNoticias.inscrever(email);
        agenciaNoticias.inscrever(zap);
        agenciaNoticias.adicionarNoticia(noticia);
        agenciaNoticias.notificarTodos();
    }
}
