package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.Bens;
import model.entities.Conta;
import model.entities.ContaCorrente;
import model.entities.ContaPoupanca;
import model.entities.SegDeVid;
import model.entities.Tributavel;

public class TesteTributavel {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<Bens> bens = new ArrayList<Bens>();
		List<Tributavel> tributaveis = new ArrayList<Tributavel>();

		Bens cp = new ContaPoupanca(1500.00);
		Bens cc = new ContaCorrente(1200.00);
		Bens sv = new SegDeVid();

		bens.add(cp);
		bens.add(cc);
		bens.add(sv);

		for (Bens bem : bens) {
			if (bem instanceof Tributavel) {
				if (bem instanceof ContaCorrente) {
					tributaveis.add((ContaCorrente) bem);
				} else if (bem instanceof SegDeVid) {
					tributaveis.add((SegDeVid) bem);
				}
			}
		}

		System.out.println("----------------");
		System.out.println("Tributos dos bens: ");

		for (Tributavel trib : tributaveis) {
			System.out.println(trib.toString() + " - " + String.format("%.2f", trib.calculaTributos()));
		}

		System.out.println("----------------");

	}

}
