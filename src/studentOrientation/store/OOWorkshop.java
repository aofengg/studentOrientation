package studentOrientation.store;

import studentOrientation.interfaces.OOChecklistInterface;
import studentOrientation.interfaces.OOWorkshopInterface;

public class OOWorkshop implements OOWorkshopInterface{

	@Override
	public void construct(OOChecklistInterface ooChecklistIn) {
		ooChecklistIn.buildBookstore();
		ooChecklistIn.buildCompusTour();
		ooChecklistIn.buildRegisterCourses();
		ooChecklistIn.buildSelectDorm();
	}

}
