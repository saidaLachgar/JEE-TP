package cigma.pfe.repositories;

import cigma.pfe.models.Client;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ClientRepositoryImpl implements ClientRepository {
//    EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit_clients");
//    EntityManager em = emf.createEntityManager();
    @PersistenceContext
    EntityManager em;

    @Override
    public Client save(Client c) {
        System.out.println("DAO Layer : ClientRepositoryImpl Level");
//        em.getTransaction().begin(); // replaced in service class with @Transitional
//        em.persist(c);
        em.merge(c);
        em.flush();
//        em.getTransaction().commit();
        return null;
    }
}
