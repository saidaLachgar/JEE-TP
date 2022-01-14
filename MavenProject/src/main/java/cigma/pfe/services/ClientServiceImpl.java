package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepository;
import cigma.pfe.repositories.ClientRepositoryImpl;

public class ClientServiceImpl implements ClientService{
    ClientRepository repository;

    public void setRepository(ClientRepository repository) {
        this.repository = repository;
    }

    public ClientServiceImpl() {
//        System.out.println("Call ClientServiceImpl ....");
    }

    @Override
    public boolean save(Client c) {
        return repository.save(c);
    }
}
