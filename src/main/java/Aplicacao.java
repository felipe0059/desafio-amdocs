import PacoteRaiz.*;

//classe main que contém os atributos solicitados pela aplicação. Como não foram utilizados scanners na api os valores pré estabelecidos são atribuidos aqui.

public class Aplicacao {

    public static void main(String[] args) {
        Cliente felipe = new Cliente();
        felipe.setNome("Felipe Gustavo");

        IConta cc = new ContaCorrente(felipe);
        Conta poupanca = new ContaPoupanca(felipe);

        cc.depositar(4000);
        cc.transferir(600, poupanca);

        cc.imprimirExtrato();
        System.out.println();
        poupanca.imprimirExtrato();
    }
}
