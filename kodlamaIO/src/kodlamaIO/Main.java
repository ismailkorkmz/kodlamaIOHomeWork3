package kodlamaIO;

import kodlamaIO.business.CategoryManager;
import kodlamaIO.business.CourseManager;
import kodlamaIO.business.EducatorManager;
import kodlamaIO.core.logging.DatabaseLogger;
import kodlamaIO.core.logging.FileLogger;
import kodlamaIO.core.logging.Logger;
import kodlamaIO.core.logging.MailLogger;
import kodlamaIO.dataAccess.HibernateCourseDao;
import kodlamaIO.dataAccess.HibernateEducatorDao;
import kodlamaIO.dataAccess.JdbcCategoryDao;
import kodlamaIO.dataAccess.JdbcCourseDao;
import kodlamaIO.entities.Category;
import kodlamaIO.entities.Course;
import kodlamaIO.entities.Educator;

public class Main {

	public static void main(String[] args) throws Exception {
		 Course course1=new Course(1, "Java", 5);
		 Category category1=new Category(1, "Yazılım");
		 Educator educator1=new Educator(1, "Engin", "Demiroğ");
		 
		 Logger[] loggers = {new DatabaseLogger(),new FileLogger(),new MailLogger()} ;
		
		 CourseManager courseManager=new CourseManager(new HibernateCourseDao(),loggers);
		 courseManager.add(course1);
		 System.out.println("--------------------------------------");
		 CategoryManager categoryManager=new CategoryManager(new JdbcCategoryDao(), loggers);
		 categoryManager.add(category1);
		 System.out.println("--------------------------------------");
		 EducatorManager educatorManager=new EducatorManager(new HibernateEducatorDao(), loggers);
		 educatorManager.add(educator1);

	}

}
