package studentOrientation.store;

import studentOrientation.interfaces.CarbonFootprintInterface;

public class CarbonFootprint implements CarbonFootprintInterface{
	float carbonFootprint = 0;
	
	public CarbonFootprint(float carbonFootprintIn) {
		carbonFootprint = carbonFootprintIn;
	}
	
	@Override
	public void set(float carbonFootprintIn) {
		carbonFootprint = carbonFootprintIn;
	}
	@Override
	public float get() {
		return carbonFootprint;
	}

}
