package cigma.pfe.services;

import cigma.pfe.models.Client;

import java.util.List;

public interface ClientService {
    Client save(Client clt);
    Client modify(Client clt);
    void remove(long idClt);
    Client getOne(long idClt);
    List<Client> getAll();
}
