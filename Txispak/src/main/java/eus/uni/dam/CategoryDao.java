package eus.uni.dam;

import java.util.Collection;

public interface CategoryDao {

	public Collection<Category> getCategory();
	
    public void init();

	public Collection<Category> findAll() ;

	public void insert(Category kategoria);

	public void edit(Category kategoria);
	
	public void delete(long id) ;
}