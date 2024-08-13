package ai.ineuron.beans;

public class SqlCourses implements Courses {
	
	public SqlCourses() {
		System.out.println("SQl Course object is created");
			
		
	}

	public boolean courseSelection() {
		System.out.println(" SQL - MYSQL Course is selected  ");
		return true;
	}

}
