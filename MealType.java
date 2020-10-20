package builder;

public class MealType {
	
	public static Meal getVegMeal() {
		
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Pepsi());
		return meal;
		
	}
	
	public Meal getNonVegMeal() {
		
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new CocaCola());
		return meal;
		
	}
}



