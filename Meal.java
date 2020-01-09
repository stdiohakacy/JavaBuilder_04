package creational.Builder._04_update;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	private List<Item> items;

	public Meal() {
		this.items = new ArrayList<Item>();
	}

	public void addItem(Item item) {
		items.add(item);
	}

	public void showItems() {
		for (Item item : items) {
			System.out.println(item);
		}
	}

	public double totalCost() {
		double count = 0;
		for (Item item : items) {
			count += item.getPrice();
		}
		return count;
	}
}
