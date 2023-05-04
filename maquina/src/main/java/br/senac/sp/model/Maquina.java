package br.senac.sp.model;

public class Maquina {

    private Estado estado = Estado.INICIAL;
    private double saldo;
    private static final double PRECO = 3.00;


    public void inserirMoeda(double valor) {
        this.saldo += valor;
        if (this.saldo >= PRECO) {
            this.estado = Estado.CREDITO_SUFICIENTE;
        } else {
            this.estado = Estado.CREDITO_INSUFICIENTE;
        }
    }

    public void solicitarCafe() {
        if (this.estado == Estado.CREDITO_SUFICIENTE) {
            this.estado = Estado.INICIAL;
            this.saldo -= PRECO;
        }
    }

    public void cancelar() {
        this.estado = Estado.INICIAL;
        this.saldo = 0;
    }

    public Estado getEstado() {
        return this.estado;
    }

    public double getSaldo() {
        return this.saldo;
    }
    
    
}
