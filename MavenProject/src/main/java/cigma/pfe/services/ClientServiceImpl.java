package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepository;
import cigma.pfe.repositories.ClientRepositoryImpl;

public class ClientServiceImpl implements ClientService{

    ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public ClientServiceImpl() {
        System.out.println("Call ClientServiceImpl ....");
    }

    @Override
    public Client save(Client c) {
        return null;
    }
}
