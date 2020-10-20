package builder;

public class Pepsi implements ColdDrinks {
		

	@Override
	public float Price() {
		System.out.println();
		return 2.5f;
		
	}


	@Override
	public String Name() {
		System.out.println();
		return "Pepsi";
	}
}
