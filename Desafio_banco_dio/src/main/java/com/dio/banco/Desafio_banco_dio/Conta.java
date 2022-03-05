package com.dio.banco.Desafio_banco_dio;

public abstract class Conta implements iConta{
    private static final int AG_PADRAO = 1;
    private static  int SEQ = 1;


    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;



    public Conta(Cliente cliente) {
        this.agencia = AG_PADRAO;
        this.numero = SEQ++;
        this.cliente = cliente;
    }


    public int getAgencia(){
        return agencia;

    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo -=valor;

    }

    @Override
    public void depositar(double valor) {
        saldo += valor;

    }

    public void transferir(double valor, iConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);

    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Agencia: %s",this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d",this.agencia));
        System.out.println(String.format("Conta: %d",this.numero));
        System.out.println(String.format("Saldo: %.2f",this.saldo));
    }
}
