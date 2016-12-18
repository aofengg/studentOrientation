package studentOrientation.store;

import studentOrientation.base.CostBase;

public class Cost extends CostBase{
	
	public Cost(float valueIn) {
		value = valueIn;
	}
	
	public Cost(){}
	
	@Override
	public void set(float costIn) {
		// TODO Auto-generated method stub
		value = costIn;
	}

	@Override
	public float get() {
		// TODO Auto-generated method stub
		return value;
	}

}
