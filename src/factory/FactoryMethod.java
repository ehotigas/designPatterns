package factory;

interface Sessao {
    String toString();
}

class SessaoProjeto implements Sessao {
    @Override
    public String toString() {
        return "Sessão Projeto";
    }
}

class SessaoPessoal implements Sessao {
    @Override
    public String toString() {
        return "Sessão Pessoal";
    }
}

class SessaoPublicacao implements Sessao {
    @Override
    public String toString() {
        return "Sessão Publicação";
    }
}

interface SessaoFactory {
    Sessao criarSessao();
}

class SessaoProjetoFactory implements SessaoFactory {
    @Override
    public Sessao criarSessao() {
        return new SessaoProjeto();
    }
}

class SessaoPessoalFactory implements SessaoFactory {
    @Override
    public Sessao criarSessao() {
        return new SessaoPessoal();
    }
}

class SessaoPublicacaoFactory implements SessaoFactory {
    @Override
    public Sessao criarSessao() {
        return new SessaoPublicacao();
    }
}


class Main {
    public static void main(String[] args) {
        SessaoFactory factory = new SessaoProjetoFactory();
        Sessao sessao = factory.criarSessao();
        System.out.println(sessao);
    }
}

// import java.util.function.Supplier;

// interface Sessao {
//     @Override
//     public String toString();
// }

// class SessaoProjeto implements Sessao {
//     @Override
//     public String toString() {
//         return "Sessão Projeto";
//     }
// }

// class SessaoPessoal implements Sessao {
//     @Override
//     public String toString() {
//         return "Sessão Pessoal";
//     }
// }

// class SessaoPublicacao implements Sessao {
//     @Override
//     public String toString() {
//         return "Sessão Publicação";
//     }
// }

// enum FactoryMethod {
//     SESSAO_PROJETO(SessaoProjeto::new),
//     SESSAO_PESSOAL(SessaoPessoal::new),
//     SESSAO_PUBLICACAO(SessaoPublicacao::new);

//     private Supplier<Sessao> construtor;

//     FactoryMethod(Supplier<Sessao> construtor) {
//         this.construtor = construtor;
//     }

//     public Sessao create() {
//         return construtor.get();
//     }
// }



