package kodlamaIO.business;

import java.util.List;

import kodlamaIO.core.logging.Logger;
import kodlamaIO.dataAccess.CategoryDao;
import kodlamaIO.dataAccess.HibernateCourseDao;
import kodlamaIO.dataAccess.JdbcCategoryDao;
import kodlamaIO.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;


	public CategoryManager(CategoryDao categoryDao,Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers=loggers;
	}

	public void add(Category category) throws Exception {
		for (Category c : categoryDao.getAll()) {
			if (c.getCategoryName().equals(c.getCategoryName())) {
				throw new Exception("Aynı isimde kategori olmaz");
				
			}
			
		}
		
		
		
		// if(category.getCategoryName()<10) {
		// throw new Exception("Aynı isimde kategori olmaz");
		// }

		categoryDao.add(category);
		
		for (Logger logger : loggers) { // [db,mail]
			logger.log(category.getCategoryName());

		}
		
	}

}
