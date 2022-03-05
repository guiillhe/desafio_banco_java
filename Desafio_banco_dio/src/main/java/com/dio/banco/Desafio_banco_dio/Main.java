package com.dio.banco.Desafio_banco_dio;

public class Main {
    public static void main(String[] args){
        Cliente guilherme = new Cliente();
        guilherme.setNome("Guilherme Araújo");

        //Criando as contas
        Conta cc = new ContaCorrente(guilherme);
        Conta cp = new ContaPoupanca(guilherme);
        Conta in = new Investimento(guilherme);



        cc.imprimirExtrato();
        cp.imprimirExtrato();
        in.imprimirExtrato();

        //Fazendo depositos

        cc.depositar(100);
        cp.depositar(100);
        in.depositar(150);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
        in.imprimirExtrato();


        //Movimentando as contas



        cc.depositar(350);
        cc.transferir(200, in);
        cp.sacar(50);
        cc.sacar(100);
        in.depositar(600);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
        in.imprimirExtrato();




    }


}
