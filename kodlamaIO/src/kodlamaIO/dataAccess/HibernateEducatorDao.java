package kodlamaIO.dataAccess;


import kodlamaIO.entities.Educator;

public class HibernateEducatorDao implements EducatorDao {

	
	public void add(Educator educator) {
		System.out.println("Hibernate ile veri tabanına eklendi");
	}

}
