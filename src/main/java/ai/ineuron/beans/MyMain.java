package ai.ineuron.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("courseconfig.xml");
		CourseSeclection select = context.getBean("courseS", CourseSeclection.class);
		select.selectCourse();


	}

}
