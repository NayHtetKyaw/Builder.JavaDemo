package builder;
import java.util.ArrayList;
import java.util.List;

public class Meal {
	
	public List<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public float totalCost() {
		float cost = 0.0f;
		
		for(Item item : items) {
			cost += item.Price();
		}
		
		return cost;
	}
	
	public void showItems() {
		
		for(Item item : items) {
			System.out.print("Item : " + item.Name());
			System.out.print("Price : " + item.Price());
		}
	}
}
