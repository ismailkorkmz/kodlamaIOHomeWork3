package kodlamaIO.dataAccess;

import java.util.ArrayList;
import java.util.List;

import kodlamaIO.entities.Category;

public class HibernateCategoryDao implements CategoryDao {
	private List<Category> categories;
	
	public HibernateCategoryDao() {
		categories = new ArrayList<Category>();
	}

	public void add(Category category) {
		System.out.println("Hibernate ile veri tabanına eklendi");
	}

	@Override
	public List<Category> getAll() {
		
		return this.categories;
	}

}
