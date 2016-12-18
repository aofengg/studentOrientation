package studentOrientation.store;

import studentOrientation.base.Bookstore;
import studentOrientation.base.CampusTour;
import studentOrientation.base.RegisterCourses;
import studentOrientation.base.SelectDorm;
import studentOrientation.interfaces.OOChecklistInterface;

public class OOBUChecklist implements OOChecklistInterface{
	private CampusTour_options campusTour_options; 
	private Bookstore_options bookstore_options;
	private SelectDorm_options selectDorm_options;
	private RegisterCourses_options registerCourses_options;
	
	private CampusTour campusTour; 
	private Bookstore bookstore;
	private SelectDorm selectDorm;
	private RegisterCourses registerCourses;
	
	public OOBUChecklist(CampusTour_options campusTourOptionIn, 
			Bookstore_options bookstoreOptionIn, 
			SelectDorm_options selectDormOptionIn, 
			RegisterCourses_options registerCoursesOptionIn) {
		campusTour_options = campusTourOptionIn;
		bookstore_options = bookstoreOptionIn;
		selectDorm_options = selectDormOptionIn;
		registerCourses_options = registerCoursesOptionIn;
	}
	
	/**
	 * @return      get the checklist details
	 */
	public String toString() {
		return "" + campusTour.getName() + ": \n" + 
				"Costs: " + campusTour.getCost().get() + 
				"; Duration: " + campusTour.getDuration().get() + 
				"; CarbonFootprint: " + campusTour.getCarbonFootprint().get() + 
				"; Calories: " + campusTour.getCalories().get() + "\n" +
				
				bookstore.getName() + ": \n" + 
				"Costs: " + bookstore.getCost().get() + 
				"; Duration: " + bookstore.getDuration().get() + 
				"; CarbonFootprint: " + bookstore.getCarbonFootprint().get() + 
				"; Calories: " + bookstore.getCalories().get() + "\n" +
				
				selectDorm.getName() + ": \n" + 
				"Costs: " + selectDorm.getCost().get() + 
				"; Duration: " + selectDorm.getDuration().get() + 
				"; CarbonFootprint: " + selectDorm.getCarbonFootprint().get() + 
				"; Calories: " + selectDorm.getCalories().get() + "\n" +
		
				registerCourses.getName() + ": \n" + 
				"Costs: " + registerCourses.getCost().get() + 
				"; Duration: " + registerCourses.getDuration().get() + 
				"; CarbonFootprint: " + registerCourses.getCarbonFootprint().get() + 
				"; Calories: " + registerCourses.getCalories().get() + "\n" + "\n" +
		
				"Total costs: " + 
				(campusTour.getCost().get() + bookstore.getCost().get() + 
						selectDorm.getCost().get() + registerCourses.getCost().get()) + "\n" +
		
				"Total time: " + 
				(campusTour.getDuration().get() + bookstore.getDuration().get() + 
						selectDorm.getDuration().get() + registerCourses.getDuration().get()) + "\n" +
		
				"Total carbon footprint: " + 
				(campusTour.getCarbonFootprint().get() + bookstore.getCarbonFootprint().get() + 
						selectDorm.getCarbonFootprint().get() + registerCourses.getCarbonFootprint().get()) + "\n" +
		
				"Total calories: " + 
				(campusTour.getCalories().get() + bookstore.getCalories().get() + 
						selectDorm.getCalories().get() + registerCourses.getCalories().get());
	}
	
	@Override
	public void buildBookstore() {
		if (bookstore_options.equals(Bookstore_options.UNIVERSITY_BOOKSTORE)) {
			bookstore = new UniversityBookstore();
		}
		else if (bookstore_options.equals(Bookstore_options.MANDO_BOOKS)) {
			bookstore = new MandoBooks();
		}
	}

	@Override
	public void buildCompusTour() {
		if (campusTour_options.equals(CampusTour_options.BUS_RIDE)) {
			campusTour = new BusRideCampusTour();
		}
		else if (campusTour_options.equals(CampusTour_options.ON_FOOT)) {
			campusTour = new OnFootCampusTour();
		}
	}

	@Override
	public void buildRegisterCourses() {
		if (registerCourses_options.equals(RegisterCourses_options.FORMS)) {
			registerCourses = new RegisterCoursesByForms();
		}
		else if (registerCourses_options.equals(RegisterCourses_options.COMPUTER)) {
			registerCourses = new RegisterCoursesByComputer();
		}
	
	}

	@Override
	public void buildSelectDorm() {
		if (selectDorm_options.equals(SelectDorm_options.OFFICE)) {
			selectDorm = new SelectDormByOffice();
		}
		else if (selectDorm_options.equals(SelectDorm_options.ONLINE)) {
			selectDorm = new SelectDormByOnline();
		}
	}

}
