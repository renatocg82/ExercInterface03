package model.entities;

public class ContaCorrente extends Conta implements Tributavel {

	double saldo;

	public ContaCorrente() {

	}

	public ContaCorrente(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public double calculaTributos() {

		return saldo * 1 / 100;
	}

	@Override
	public String toString() {
		return "Conta Corrente";
	}
}
