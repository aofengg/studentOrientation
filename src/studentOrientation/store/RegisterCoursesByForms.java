package studentOrientation.store;

import studentOrientation.base.RegisterCourses;

public class RegisterCoursesByForms extends RegisterCourses {
	private String name;
	
	public RegisterCoursesByForms() {
		calories = new Calories(5);
		carbonFootprint = new CarbonFootprint(10);
		cost = new Cost(4);
		cost.set((float) (cost.get() * 0.97));
		duration = new Duration(5);
		name = "Register courses by forms";
	}
	/**
	 * @return      RegisterCourseByForms name
	 */
	public String getName() {
		return name;
	}

}
