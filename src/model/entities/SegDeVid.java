package model.entities;

public class SegDeVid implements Tributavel, Bens {

	public SegDeVid() {

	}

	@Override
	public double calculaTributos() {

		return 42.00;
	}

	@Override
	public String toString() {
		return "Seguro de vida";
	}

}
