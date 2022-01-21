package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepository;

public class ClientServiceImpl implements ClientService{
    ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public ClientServiceImpl() {
      System.out.println("\n Call ClientServiceImpl ....\n");
    }

    @Override
    public boolean save(Client c) {
        System.out.println("\n ClientService level...\n");
        return clientRepository.save(c);
    }
}
