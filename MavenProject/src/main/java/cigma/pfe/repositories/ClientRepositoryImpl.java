package cigma.pfe.repositories;

import cigma.pfe.models.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//import javax.persistence.PersistenceContext;

public class ClientRepositoryImpl implements ClientRepository{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit_clients");
    EntityManager em = emf.createEntityManager();

    public ClientRepositoryImpl() {
//        System.out.println("Call ClientRepositoryImpl ....");
    }

    @Override
    public boolean save(Client c) {
//        System.out.println("DAO Layer : ClientRepositoryImpl Level");
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();

        return true;
    }
}
