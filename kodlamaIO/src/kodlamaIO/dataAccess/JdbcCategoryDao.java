package kodlamaIO.dataAccess;

import java.util.ArrayList;
import java.util.List;

import kodlamaIO.entities.Category;

public class JdbcCategoryDao implements CategoryDao {
	private List<Category> categories;

	public JdbcCategoryDao() {
		categories = new ArrayList<Category>();
	}

	public void add(Category category) {
		System.out.println("JDBC ile veri tabanına eklendi");
	}

	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return this.categories;
	}

}
