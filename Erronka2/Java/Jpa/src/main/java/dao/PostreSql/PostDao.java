package dao.PostreSql;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import model.postgre.ProductTemplate;
import model.postgre.ResPartner;
import model.postgre.SaleOrderLine;

@Repository
@Transactional  
public class PostDao {
	
    @PersistenceContext
    private EntityManager entityManager;
	
    @SuppressWarnings("unchecked")
    public List<ProductTemplate> getAllP() {
    	return entityManager.createQuery("from ProductTemplate").getResultList();
    }
    
    public ProductTemplate getByIdP(long id) {
        return entityManager.find(ProductTemplate.class, id);
    }

    public void updateP(ProductTemplate p) {
        entityManager.merge(p);
        return;
    }
    
    @SuppressWarnings("unchecked")
    public List<ResPartner> getAllPar() {
    	return entityManager.createQuery("from ResPartner").getResultList();
    }
    
    public ResPartner getByIdPar(long id) {
        return entityManager.find(ResPartner.class, id);
    }
    
    public void updateP(ResPartner p) {
        entityManager.merge(p);
        return;
    }
    
    @SuppressWarnings("unchecked")
    public List<SaleOrderLine> getAllSale() {
    	return entityManager.createQuery("from SaleOrderLine").getResultList();
    }
    
    public SaleOrderLine getByIdSale(long id) {
        return entityManager.find(SaleOrderLine.class, id);
    }
    
    public void updateSale(SaleOrderLine p) {
        entityManager.merge(p);
        return;
    }
}
