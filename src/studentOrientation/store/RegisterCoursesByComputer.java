package studentOrientation.store;

import studentOrientation.base.RegisterCourses;

public class RegisterCoursesByComputer extends RegisterCourses {
	private String name;
	
	public RegisterCoursesByComputer() {
		calories = new Calories(5);
		carbonFootprint = new CarbonFootprint(10);
		cost = new Cost(4);
		cost.set((float) (cost.get() * 1));
		duration = new Duration(15);
		name = "Register courses by computer";
	}
	
	/**
	 * @return      RegisterCourseByComputer name
	 */
	public String getName() {
		return name;
	}

	
}
