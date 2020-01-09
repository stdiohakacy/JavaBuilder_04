package creational.Builder._04_update;

public abstract class Drink implements Item {

	@Override
	public Packing pack() {
		return new Bottle();
	}
}

class Coke extends Drink {

	@Override
	public String getName() {
		return "Coke";
	}

	@Override
	public double getPrice() {
		return 8000;
	}

	@Override
	public String toString() {
		return "Coke [getName()=" + getName() + ", getPrice()=" + getPrice() + ", pack()=" + pack().pack() + "]";
	}

}

class Pepsi extends Drink {

	@Override
	public String getName() {
		return "Pepsi";
	}

	@Override
	public double getPrice() {
		return 12000;
	}

	@Override
	public String toString() {
		return "Pepsi [getName()=" + getName() + ", getPrice()=" + getPrice() + ", pack()=" + pack().pack() + "]";
	}

}