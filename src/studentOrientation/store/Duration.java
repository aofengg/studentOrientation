package studentOrientation.store;

import studentOrientation.interfaces.DurationInterface;

public class Duration implements DurationInterface{
	float duration = 0;
	
	public Duration(float durationIn) {
		duration = durationIn;
	}
	@Override
	public void set(float durationIn) {
		// TODO Auto-generated method stub
		duration = durationIn;
	}

	@Override
	public float get() {
		// TODO Auto-generated method stub
		return duration;
	}

}
