package kodlamaIO.business;

import kodlamaIO.core.logging.Logger;
import kodlamaIO.dataAccess.EducatorDao;
import kodlamaIO.dataAccess.HibernateCourseDao;
import kodlamaIO.dataAccess.JdbcEducatorDao;
import kodlamaIO.entities.Educator;

public class EducatorManager {
	private EducatorDao educatorDao;
	private Logger[] loggers;

	public EducatorManager(EducatorDao educatorDao,Logger[] loggers) {
		this.educatorDao = educatorDao;
		this.loggers=loggers;
	}

	public void add(Educator educator) throws Exception {
		   educatorDao.add(educator);
		   
		   for (Logger logger : loggers) { // [db,mail]
			logger.log(educator.getName());
			logger.log(educator.getLastname());

		}
		   
		   
		   
		   
		}
		
		
	

		
		
		
		
		
	}


