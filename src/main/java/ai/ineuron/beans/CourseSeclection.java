package ai.ineuron.beans;

public class CourseSeclection {
	
	private Courses course;
	
	public void setCourse(Courses course) {
		this.course = course;
		
	}
	
	public void selectCourse() {
		
		boolean status = course.courseSelection();
		
		if(status) {
			System.out.println("Couses selected successfully....");
		}
		else {
			System.out.println("Opps something went wrong .....");
		}
		
	}

}
