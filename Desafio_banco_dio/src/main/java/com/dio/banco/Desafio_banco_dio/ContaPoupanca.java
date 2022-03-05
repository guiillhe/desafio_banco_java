package com.dio.banco.Desafio_banco_dio;

public class ContaPoupanca extends Conta {


    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

    }

    @Override
    public void imprimirExtrato() {
        System.out.println("===Extrato Conta Poupança===");
        super.imprimirInfosComuns();
    }

}
