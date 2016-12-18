package studentOrientation.store;

import studentOrientation.base.Bookstore;

public class UniversityBookstore extends Bookstore {

	private String name;
	
	public UniversityBookstore() {
		calories = new Calories(7);
		carbonFootprint = new CarbonFootprint(8);
		cost = new Cost();
		cost.set((float) (cost.get() * 1));
		duration = new Duration(15);
		name = "University bookstore";
	}
		
	/**
	 * @return      UniversityBookstore name
	 */
	public String getName() {
		return name;
	}

	
}
