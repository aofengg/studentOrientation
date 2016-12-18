package studentOrientation.driver;

import studentOrientation.interfaces.OOChecklistInterface;
import studentOrientation.interfaces.OOWorkshopInterface;
import studentOrientation.store.OOBUChecklist;
import studentOrientation.store.OOWorkshop;
import studentOrientation.store.Bookstore_options;
import studentOrientation.store.CampusTour_options;
import studentOrientation.store.RegisterCourses_options;
import studentOrientation.store.SelectDorm_options;

public class Driver {
	
	public static void main(String[] args) {
		/**
		 * Builder Pattern 
		 */
		OOChecklistInterface ooBUChecklist = new OOBUChecklist(CampusTour_options.ON_FOOT, 
				Bookstore_options.UNIVERSITY_BOOKSTORE, 
				SelectDorm_options.OFFICE, 
				RegisterCourses_options.FORMS);
		OOWorkshopInterface shop = new OOWorkshop();
		shop.construct(ooBUChecklist);
		System.out.println(ooBUChecklist.toString());
	}

}
