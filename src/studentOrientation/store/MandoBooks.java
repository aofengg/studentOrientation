package studentOrientation.store;

import studentOrientation.base.Bookstore;

public class MandoBooks extends Bookstore {

	private String name;
	
	public MandoBooks() {
		calories = new Calories(5);
		carbonFootprint = new CarbonFootprint(10);
		cost = new Cost();
		cost.set((float) (cost.get() * 0.95));
		duration = new Duration(20);
		name = "Mando Books";
	}
		
	/**
	 * @return      MandoBooks name
	 */
	public String getName() {
		return name;
	}

	
}
