package creational.Builder._04_update;

public class Client {
	public static void main(String[] args) {
		Director director = new Director();
		
		MealBuilder vegMeal = new VegMeal();
		MealBuilder nonvegMeal = new NonVegMeal();
		
		director.build(vegMeal);
		director.build(nonvegMeal);
		
		Meal meal = vegMeal.getMeal();
		meal.showItems();
		System.out.println(meal.totalCost());
		
		meal = nonvegMeal.getMeal();
		meal.showItems();
		System.out.println(meal.totalCost());
	}
}
