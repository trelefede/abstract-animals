package org.lessons.java.abstracts.animals;

public class Acquila extends Animale implements Volare {

	@Override
	public void verso() {
		System.out.println("verso dell'acquila");
	}

	@Override
	public void mangia() {
		System.out.println("cibo dell'acquila");
	}

	@Override
	public void vola() {
		System.out.println("Acquila sta volando");

	}

}
