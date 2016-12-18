package studentOrientation.store;

import studentOrientation.base.CampusTour;

public class OnFootCampusTour extends CampusTour {
	private String name;
	
	public OnFootCampusTour() {
		calories = new Calories(20);
		carbonFootprint = new CarbonFootprint(10);
		cost = new Cost((float) 0.1);
		duration = new Duration(10);
		name = "On foot campus tour";
	}
	
	/**
	 * @return      OnFootCampusTour name
	 */
	public String getName() {
		return name;
	}
	
	
	
}
