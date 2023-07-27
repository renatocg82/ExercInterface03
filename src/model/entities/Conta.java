package model.entities;

public abstract class Conta implements Bens {

	double saldo;

	public Conta() {

	}

	public Conta(double saldo) {
		this.saldo = saldo;
	}

	void sacar(double amount) {
		this.saldo = saldo - amount;
	}

	void depositar(double amount) {
		this.saldo = saldo + amount;
	}

	double obterSaldo() {
		return saldo;
	}
}
