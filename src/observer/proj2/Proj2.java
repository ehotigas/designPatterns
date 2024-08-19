package observer.proj2;

public class Proj2 {
    /*
     * Exercício: Sistema de Notificações de Notícias
     * Descrição:
     * 
     * Você foi contratado para desenvolver um sistema de notificações de notícias em uma plataforma de jornalismo. Neste sistema, os usuários podem se inscrever para receber notificações de novas notícias publicadas em diferentes categorias, como "Esportes", "Política", "Tecnologia", etc.
     * 
     * Quando uma nova notícia é publicada em uma categoria, todos os usuários inscritos nessa categoria devem ser notificados com o título da notícia e a descrição.
     * 
     * Requisitos:
     * 
     * Classe Noticia:
     * 
     * Deve ter os atributos titulo (String), descricao (String) e categoria (String).
     * Deve ter métodos para acessar essas informações.
     * Interface Observador:
     * 
     * Deve ter um método notificar(Noticia noticia) que será implementado pelos observadores.
     * Classe Usuario:
     * 
     * Implementa a interface Observador.
     * Deve ter um atributo nome (String) para identificar o usuário.
     * Quando notificado, o usuário deve receber o título e a descrição da notícia.
     * Classe Categoria:
     * 
     * Deve manter uma lista de observadores (usuários) inscritos.
     * Deve ter métodos para adicionar e remover observadores.
     * Deve ter um método publicarNoticia(Noticia noticia) que, ao ser chamado, notifica todos os observadores inscritos na categoria com a notícia publicada.
     * Classe SistemaNotificacoes:
     * 
     * Deve manter um mapa (Map) onde as chaves são as categorias e os valores são os objetos da classe Categoria.
     * Deve ter métodos para adicionar/remover usuários a uma categoria.
     * Deve ter um método publicarNoticia(String categoria, Noticia noticia) que, ao ser chamado, deve delegar a publicação da notícia para a categoria correspondente, notificando os usuários inscritos.
     * Exemplo de Execução:
     * 
     * Crie alguns usuários e inscreva-os em diferentes categorias (por exemplo, "Esportes", "Tecnologia").
     * Publique uma nova notícia na categoria "Esportes" e observe que apenas os usuários inscritos nessa categoria são notificados.
     * Publique outra notícia na categoria "Tecnologia" e verifique que os usuários inscritos em "Tecnologia" são notificados.
     * Desafio Adicional:
     * 
     * Implemente a funcionalidade de permitir que um usuário se desinscreva de uma categoria.
     * Objetivo:
     * O objetivo deste exercício é praticar o uso do padrão Observer, permitindo que você compreenda como diferentes objetos podem ser notificados de forma independente em resposta a eventos específicos.
    */
    public static void main(String[] args) {
        
    }
}
