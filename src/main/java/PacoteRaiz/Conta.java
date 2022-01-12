package PacoteRaiz;

import lombok.Getter;

@Getter
public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 150;
    private static int SEQUENCIAL = 12356854;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("\tTitular: %s", this.cliente.getNome()));
        System.out.println(String.format("\n\tAgencia: %d", this.agencia));
        System.out.println(String.format("\tNumero: %d", this.numero));
        System.out.println(String.format("\n\n\t\tSaldo: R$:%.2f", this.saldo));
    }
}
