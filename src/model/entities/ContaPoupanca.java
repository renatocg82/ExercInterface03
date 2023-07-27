package model.entities;

public class ContaPoupanca extends Conta {

	double saldo;

	public ContaPoupanca() {

	}

	public ContaPoupanca(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Conta Poupanca";
	}

}
