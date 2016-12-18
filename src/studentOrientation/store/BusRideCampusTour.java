package studentOrientation.store;

import studentOrientation.base.CampusTour;

public class BusRideCampusTour extends CampusTour {

	private String name;
	
	public BusRideCampusTour() {
		calories = new Calories(4);
		carbonFootprint = new CarbonFootprint(30);
		cost = new Cost(2);
		duration = new Duration(2);
		name = "Bus ride campus tour";
	}
	
	/**
	 * @return      BusRideCampusTour name
	 */
	public String getName() {
		return name;
	}

}
