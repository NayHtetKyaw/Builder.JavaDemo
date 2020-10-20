package builder;

public class Customer {
	
	public static void main(String [] args) {
		 
		MealType mealType = new MealType();	
		Meal vegMeal = MealType.getVegMeal();
		System.out.println("Vegetable Meal");
		vegMeal.showItems();
		System.out.println("Total Cost : " + vegMeal.totalCost());
		System.out.println("*************************************** \n");
		
		Meal nonVegMeal = mealType.getNonVegMeal();
		System.out.println("Non-Vegetable Meal");
		nonVegMeal.showItems();
		System.out.print("Total Cost : " + nonVegMeal.totalCost());
	}
}
