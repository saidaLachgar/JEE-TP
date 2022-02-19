package cigma.pfe.repositories;

import cigma.pfe.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class MockClients implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(MockClients.class);

    @Autowired
    private ClientRepository dao;

    @Override
    public void run(String... args) throws Exception {
        Client c1 = new Client("Omar");
        Client c2 = new Client("Said");
        Client c3 = new Client("Ahmed");
        Client c4 = new Client("Farah");
        dao.save(c1);
        dao.save(c2);
        dao.save(c3);
        dao.save(c4);
        dao.findAll().forEach(c -> System.out.println(c.getName()));
    }
}
