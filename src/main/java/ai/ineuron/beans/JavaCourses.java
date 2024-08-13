package ai.ineuron.beans;

public class JavaCourses implements Courses {
	
	public JavaCourses() {
		System.out.println("Java courses object is created by IOC");
	}

	public boolean courseSelection() {
		System.out.println("Java course is selected....");
		return true;
		
		
		

	}

}
