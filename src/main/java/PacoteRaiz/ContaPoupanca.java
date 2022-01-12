package PacoteRaiz;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\t\t--- Extrato Conta Poupança ---");
        imprimirInfosComuns();
    }
}
