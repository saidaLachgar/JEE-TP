package cigma.pfe.repositories;

import cigma.pfe.models.Facture;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Repository
public class FactureRepositoryImpl implements FactureRepository{
    @PersistenceContext
    EntityManager em;

    @Override
    public Facture save(Facture f) {
        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();
        return null;
    }

    @Override
    public Facture update(Facture f) {
        em.getTransaction().begin();
        em.merge(f);
        em.getTransaction().commit();
        return null;
    }

    @Override
    public Facture delete(long id) {
        em.getTransaction().begin();
        String hql = "delete " + Facture.class.getName() + " where id = :id";
        Query query = em.createQuery(hql).setParameter("id", id);
        query.executeUpdate();
        return null;
    }

    @Override
    public Facture find(long id) {
        return em.find(Facture.class, id);
    }

    @Override
    public Facture findAll() {
        Query query = em.createQuery("SELECT * FROM factures");
        return (Facture) query.getResultList();
    }
}
