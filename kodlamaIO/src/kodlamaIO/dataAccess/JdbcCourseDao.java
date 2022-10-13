package kodlamaIO.dataAccess;

import kodlamaIO.entities.Course;

public class JdbcCourseDao implements CourseDao{
	public void add(Course course ) {
		System.out.println("JDBC ile veri tabanına eklendi");
	}

}
