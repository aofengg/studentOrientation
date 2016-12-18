CS542 Design Patterns
Fall 2016
PROJECT <3> README FILE

Due Date: <Friday, October 28, 2016>
Submission Date: <Friday, October 28, 2016>
Grace Period Used This Project: <7> Days
Grace Period Remaining: <0> Days
Author(s): <Yunpeng Ge> <Meng Xu>
e-mail(s): <yge6@binghamton.edu> <mxu24@binghamton.edu>


PURPOSE:

  Apply the design principles and patterns you have learned so far to develop and test code for the given problem.

PERCENT COMPLETE:

  I believe I have completed 100% of this project.

PARTS THAT ARE NOT COMPLETE:

  I believe there should not be anything uncompleted.

BUGS:

  None.

FILES:

  /src/studentOrientation/driver/
  Driver.java

  /src/studentOrientation/store/
  Bookstore_options.java
  OOWorkshop.java
  BusRideCampusTour.java         
  Calories.java                  
  CampusTour_options.java        
  CarbonFootprint.java           
  Cost.java                      
  Duration.java                  
  MandoBooks.java                
  OOBUChecklist.java             
  OnFootCampusTour.java
  RegisterCoursesByComputer.java
  RegisterCoursesByForms.java
  RegisterCourses_options.java
  SelectDormByOffice.java
  SelectDormByOnline.java
  SelectDorm_options.java
  UniversityBookstore.java

  /src/studentOrientation/base/
  Bookstore.java               
  CampusTour.java      
  CostBase.java
  SelectDorm.java
  RegisterCourses.java

  /src/studentOrientation/interfaces/
  CaloriesInterface.java        
  CarbonFootprintInterface.java 
  DurationInterface.java
  OOChecklistInterface.java
  OOWorkshopInterface.java

  /src/studentOrientation/util/

  /src/
  build.xml

  README.txt

DATA STRUCTURE:
  Checklist structure consists of CampusTour, Bookstore, SelectDorm, RegisterCourses.

TIME COMPLEXITY:
  O(1).

SPACE COMPLEXITY:
  O(1).

SAMPLE OUTPUT:

  [a…@a…-mac:~/…/bin]$ ant -buildfile src/build.xml studentOrientation  

  Buildfile: /Users/aofengg/Documents/workspace/studentOrientation/src/build.xml

  prepare:

  studentOrientation:

  BUILD SUCCESSFUL
  Total time: 0 seconds

  [a…@a…-mac:~/…/bin]$ ant -buildfile src/build.xml run
  
  Buildfile: /Users/aofengg/Documents/workspace/studentOrientation/src/build.xml

  prepare:

  studentOrientation:

  jar:

  run:
     [java] On foot campus tour: 
     [java] Costs: 0.1; Duration: 10.0; CarbonFootprint: 10.0; Calories: 20.0
     [java] University bookstore: 
     [java] Costs: 5.0; Duration: 15.0; CarbonFootprint: 8.0; Calories: 7.0
     [java] Select dorm by office: 
     [java] Costs: 2.0; Duration: 5.0; CarbonFootprint: 10.0; Calories: 5.0
     [java] Register courses by forms: 
     [java] Costs: 3.88; Duration: 5.0; CarbonFootprint: 10.0; Calories: 5.0
     [java] 
     [java] Total costs: 10.98
     [java] Total time: 35.0
     [java] Total carbon footprint: 38.0
     [java] Total calories: 37.0

  BUILD SUCCESSFUL
  Total time: 0 seconds

TO COMPILE:

  ant -buildfile src/build.xml studentOrientation

TO RUN:

  ant -buildfile src/build.xml run 

ACKNOWLEDGEMENT:

  We finished this project totally by ourselves.
