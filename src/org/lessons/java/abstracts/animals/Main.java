package org.lessons.java.abstracts.animals;

public class Main {

	public static void faiVolare(Volare animale) {
		animale.vola();
	}

	public static void faiNuotare(Nuotare animale) {
		animale.nuota();
	}

	public static void main(String[] args) {

		Cane pluto = new Cane();
		pluto.mangia();
		pluto.verso();
		pluto.dormi();

		Acquila plutoVolante = new Acquila();
		plutoVolante.mangia();
		plutoVolante.verso();
		plutoVolante.dormi();

		Delfino plutoAcquatico = new Delfino();
		plutoAcquatico.mangia();
		plutoAcquatico.verso();
		plutoAcquatico.dormi();

		faiNuotare(plutoAcquatico);
		faiVolare(plutoVolante);

	}

}
