package kodlamaIO.dataAccess;

import kodlamaIO.entities.Course;

public class HibernateCourseDao implements CourseDao{
	public void add(Course course ) {
		System.out.println("Hibernate ile veri tabanına eklendi");
	}

}
