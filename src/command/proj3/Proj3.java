package command.proj3;

public class Proj3 {
    /*
     * Exercício: Sistema de Controle Remoto
     * Cenário:
     * 
     * Você foi contratado para desenvolver o software de um sistema de controle remoto universal. Esse controle remoto será capaz de controlar diversos dispositivos eletrônicos, como luzes, TVs, aparelhos de som, entre outros. O objetivo é permitir que o controle remoto possa enviar comandos para esses dispositivos de forma flexível, de modo que novos dispositivos possam ser adicionados ao sistema sem precisar modificar o controle remoto.
     * 
     * Requisitos:
     * 
     * Interface Comando:
     * 
     * Crie uma interface Comando que declare um método executar(). Todos os comandos (como ligar ou desligar um dispositivo) devem implementar essa interface.
     * Dispositivos:
     * 
     * Crie classes para diferentes dispositivos, como Luz, TV, e AparelhoSom. Cada dispositivo deve ter métodos para ligar e desligar, e você pode adicionar outros métodos conforme desejar (por exemplo, aumentar volume, mudar canal, etc.).
     * Comandos Concretos:
     * 
     * Crie comandos concretos para ligar e desligar cada dispositivo. Por exemplo, um comando LigarLuzComando para ligar uma luz e um comando DesligarLuzComando para desligar uma luz.
     * Esses comandos devem implementar a interface Comando.
     * Invoker (Controle Remoto):
     * 
     * Crie uma classe ControleRemoto que atue como o invoker. Ela deve possuir slots para armazenar comandos que podem ser executados posteriormente. O controle remoto deve permitir que o usuário configure quais comandos serão executados ao pressionar determinados botões.
     * Adicione um método no controle remoto para executar o comando associado a um botão.
     * Simulação:
     * 
     * Crie uma classe principal SistemaControleRemoto que configure o controle remoto com diferentes comandos e simule o uso do controle remoto para operar os dispositivos.
     * Mostre como você pode adicionar novos dispositivos ou comandos sem precisar modificar o código existente do controle remoto.
     * Desafio Adicional:
     * 
     * Implemente um sistema de desfazer (undo). Permita que o usuário desfaça a última ação realizada pelo controle remoto. Isso significa que cada comando concreto também deve implementar um método desfazer().
     * Dicas:
     * 
     * Pense em como você pode organizar o código para facilitar a adição de novos comandos e dispositivos.
     * Considere usar coleções (como listas ou arrays) para armazenar comandos no ControleRemoto.
     */
}
