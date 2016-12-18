package studentOrientation.store;

import studentOrientation.interfaces.CaloriesInterface;

public class Calories implements CaloriesInterface{
	float calories = 0;
	
	public Calories(float caloriesIn) {
		calories = caloriesIn;
	}
	
	@Override
	public void set(float caloriesIn) {
		calories = caloriesIn;
	}

	@Override
	public float get() {
		return calories;
	}

}
