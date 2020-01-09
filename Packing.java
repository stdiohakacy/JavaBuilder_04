package creational.Builder._04_update;

public interface Packing {
	public String pack();
}

class Wrapper implements Packing{

	@Override
	public String pack() {
		return "Wrapper packing...";
	}
	
}

class Bottle  implements Packing{

	@Override
	public String pack() {
		return"Bottle packing...";
	}
	
}
