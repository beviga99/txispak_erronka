package eus.uni.dam;

import java.util.Collection;

public interface ItemDao {

	public Collection<Item> getItems();
	
    public void init();

	public Collection<Item> findAll() ;

	public void insert(Item produktua);

	public void edit(Item produktua);
	
	public void delete(long id) ;
}
