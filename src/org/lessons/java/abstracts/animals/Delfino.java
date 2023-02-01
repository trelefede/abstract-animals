package org.lessons.java.abstracts.animals;

public class Delfino extends Animale implements Nuotare {

	@Override
	public void verso() {
		System.out.println("verso del delfino");
	}

	@Override
	public void mangia() {
		System.out.println("cibo del delfino");
	}

	@Override
	public void nuota() {
		System.out.println("Delfino sta nuotando");

	}

}
