package kodlamaIO.dataAccess;

import java.util.List;

import kodlamaIO.entities.Category;

public interface CategoryDao {
	void add(Category category);
	List<Category> getAll();

}
