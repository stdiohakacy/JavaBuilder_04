package creational.Builder._04_update;

public class Director {
	private MealBuilder mBuilder;
	
	public void build(MealBuilder mBuilder) {
		this.mBuilder = mBuilder;
		this.mBuilder.buildBurger();
		this.mBuilder.buildDrink();
	}
}
