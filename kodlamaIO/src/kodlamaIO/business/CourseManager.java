package kodlamaIO.business;

import java.util.List;

import kodlamaIO.core.logging.Logger;
import kodlamaIO.dataAccess.CourseDao;
import kodlamaIO.dataAccess.HibernateCourseDao;
import kodlamaIO.dataAccess.JdbcCourseDao;
import kodlamaIO.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		if (course.getCoursePrice() <= 0) {
			throw new Exception("Kurs ücreti 0 dan küçük olamaz");
		}

		courseDao.add(course);

		for (Logger logger : loggers) { // [db,mail]
			logger.log(course.getCourseName());

		}
	}
}
