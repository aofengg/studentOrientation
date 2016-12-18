package studentOrientation.store;

import studentOrientation.base.SelectDorm;

public class SelectDormByOnline extends SelectDorm {

	private String name;
	
	public SelectDormByOnline() {
		calories = new Calories(5);
		carbonFootprint = new CarbonFootprint(10);
		cost = new Cost(2);
		cost.set((float) (cost.get() * 1.02));
		duration = new Duration(5);
		name = "Select dorm by online";
	}
	
	/**
	 * @return      SelectDormByOnline name
	 */
	public String getName() {
		return name;
	}
}
