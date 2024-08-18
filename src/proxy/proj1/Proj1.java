package proxy.proj1;

import java.util.UUID;

interface Carteira {
    public boolean pagar(double valor);
}

class Banco implements Carteira {
    private String cartao;
    private String conta;
    private double saldo;

    public Banco() {
        cartao = UUID.randomUUID().toString();
        conta = UUID.randomUUID().toString();
        saldo = 0;
    }
    
    @Override
    public boolean pagar(double valor) {
        return saldo >= valor;
    }

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}


// Proxy
class CartaoDebito implements Carteira {
    private Banco banco;
    public CartaoDebito(Banco banco) {
        this.banco = banco;
    }

    @Override
    public boolean pagar(double valor) {
        return this.banco.pagar(valor);
    }
}


public class Proj1 {
    public static void main(String[] args) {
        Banco nubank = new Banco();
        nubank.setSaldo(1000);
        
        CartaoDebito cartao = new CartaoDebito(nubank);
        System.out.println(cartao.pagar(1200));
    }
}
