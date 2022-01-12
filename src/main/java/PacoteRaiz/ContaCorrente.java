package PacoteRaiz;

public class ContaCorrente extends Conta  {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\t\t-- Extrato Conta Corrente --");
        imprimirInfosComuns();
    }

}
