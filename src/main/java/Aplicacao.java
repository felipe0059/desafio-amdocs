import PacoteRaiz.*;

//classe main que cont�m os atributos solicitados pela aplica��o. Como n�o foram utilizados scanners na api os valores pr� estabelecidos s�o atribuidos aqui.

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
