package creational.Builder._04_update;

public interface MealBuilder {
	public void buildBurger();

	public void buildDrink();

	public Meal getMeal();
}

class VegMeal implements MealBuilder {
	private Meal meal = new Meal();

	@Override
	public void buildBurger() {
		meal.addItem(new VegBurger());
	}

	@Override
	public void buildDrink() {
		meal.addItem(new Coke());
	}

	@Override
	public Meal getMeal() {
		return meal;
	}
}

class NonVegMeal implements MealBuilder {
	private Meal meal = new Meal();

	@Override
	public void buildBurger() {
		meal.addItem(new ChickenBurger());
	}

	@Override
	public void buildDrink() {
		meal.addItem(new Pepsi());
	}

	@Override
	public Meal getMeal() {
		return meal;
	}
}
