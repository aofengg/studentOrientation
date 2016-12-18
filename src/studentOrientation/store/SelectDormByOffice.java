package studentOrientation.store;

import studentOrientation.base.SelectDorm;

public class SelectDormByOffice extends SelectDorm {

	private String name;
	
	public SelectDormByOffice() {
		calories = new Calories(5);
		carbonFootprint = new CarbonFootprint(10);
		cost = new Cost(2);
		cost.set((float) (cost.get() * 1));
		duration = new Duration(5);
		name = "Select dorm by office";
	}
	
	/**
	 * @return      SelectDormByOffice name
	 */
	public String getName() {
		return name;
	}
}
