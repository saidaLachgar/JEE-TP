package cigma.pfe.repositories;

import cigma.pfe.models.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClientRepositoryImpl implements ClientRepository{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit_clients");
    EntityManager em = emf.createEntityManager();

    public ClientRepositoryImpl() {
        System.out.println("\n Call ClientRepositoryImpl ....\n");
    }

    @Override
    public boolean save(Client c) {
        System.out.println("\n DAO Layer : ClientRepositoryImpl Level\n");
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        return true;
    }
}
