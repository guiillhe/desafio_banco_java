package com.dio.banco.Desafio_banco_dio;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

    }

    @Override
    public void imprimirExtrato() {
        System.out.println("===Extrato Conta Corrente");
        super.imprimirInfosComuns();
    }
}
