package chapter10;

public abstract class JavaAnimal {

	protected final String species;
	protected final int legCount;

	public JavaAnimal(final String species, final int legCount) {
		this.species = species;
		this.legCount = legCount;
	}

	abstract public void move();

	public String getSpecies() {
		return species;
	}

	public int getLegCount() {
		return legCount;
	}
}
