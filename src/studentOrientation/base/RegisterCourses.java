package studentOrientation.base;

import studentOrientation.interfaces.CaloriesInterface;
import studentOrientation.interfaces.CarbonFootprintInterface;
import studentOrientation.interfaces.DurationInterface;

public abstract class RegisterCourses {
	protected CaloriesInterface calories;
	protected CarbonFootprintInterface carbonFootprint;
	protected CostBase cost;
	protected DurationInterface duration;
	public abstract String getName();
	/**
	 * @return      calories value
	 */
	public CaloriesInterface getCalories() {
		return calories;
	}
	
	/**
	 * @return      carbonFootprint value
	 */
	public CarbonFootprintInterface getCarbonFootprint() {
		return carbonFootprint;
	}
	
	/**
	 * @return      cost value
	 */
	public CostBase getCost() {
		return cost;
	}
	
	/**
	 * @return      duration value
	 */
	public DurationInterface getDuration() {
		return duration;
	}
}
