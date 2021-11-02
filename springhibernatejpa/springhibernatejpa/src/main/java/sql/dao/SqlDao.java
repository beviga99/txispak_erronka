package sql.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import model.sqlserver.Bezeroak;
import model.sqlserver.Produktoak;
import model.sqlserver.Salmentak;

@Repository
@Transactional  
public class SqlDao {
	
    @PersistenceContext
    private EntityManager entityManager;
	
	public void createPd(Produktoak p) {
        entityManager.persist(p);
        return;
    }

    public void deletePd(Produktoak p) {
        if (entityManager.contains(p))
            entityManager.remove(p);
        else
            entityManager.remove(entityManager.merge(p));
        return;
    }

    @SuppressWarnings("unchecked")
    public List<Produktoak> getAllProduktuak() {
    	return entityManager.createQuery("from Produktoak").getResultList();
    }

    public Produktoak getByIdPd(long id) {
        return entityManager.find(Produktoak.class, id);
    }

    public void updatePd(Produktoak p) {
        entityManager.merge(p);
        return;
    }
    
    @SuppressWarnings("unchecked")
    public List<Salmentak> getAllSalmentak() {
    	return entityManager.createQuery("from Salmentak").getResultList();
    }

    public Salmentak getByIdSal(long id) {
        return entityManager.find(Salmentak.class, id);
    }

    public void updateSal(Salmentak b) {
        entityManager.merge(b);
        return;
    }
    
    @SuppressWarnings("unchecked")
    public List<Bezeroak> getAllBezeroak() {
    	return entityManager.createQuery("from Bezeroak").getResultList();
    }

    public Bezeroak getByIdBz(long id) {
        return entityManager.find(Bezeroak.class, id);
    }

    public void updateBz(Bezeroak b) {
        entityManager.merge(b);
        return;
    }
}
