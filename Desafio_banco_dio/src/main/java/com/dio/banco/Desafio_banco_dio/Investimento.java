package com.dio.banco.Desafio_banco_dio;

public class Investimento extends Conta {

    public Investimento(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

    }

    @Override
    public void imprimirExtrato() {
        System.out.println("===Extrato dos Investimentos===");
        super.imprimirInfosComuns();
    }



}
