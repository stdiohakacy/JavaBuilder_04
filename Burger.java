package creational.Builder._04_update;

public abstract class Burger implements Item {

	@Override
	public Packing pack() {
		return new Wrapper();
	}

}

class VegBurger extends Burger {

	@Override
	public String getName() {
		return "VegBurger";
	}

	@Override
	public double getPrice() {
		return 25000;
	}

	@Override
	public String toString() {
		return "VegBurger [getName()=" + getName() + ", getPrice()=" + getPrice() + ", pack()=" + pack().pack() + "]";
	}

}

class ChickenBurger extends Burger {
	@Override
	public String getName() {
		return "ChickenBurger";
	}

	@Override
	public double getPrice() {
		return 50000;
	}

	@Override
	public String toString() {
		return "ChickenBurger [getName()=" + getName() + ", getPrice()=" + getPrice() + ", pack()=" + pack().pack() + "]";
	}

}