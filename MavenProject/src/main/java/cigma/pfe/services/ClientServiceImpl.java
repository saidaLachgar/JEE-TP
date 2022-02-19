package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{
    @Autowired
    ClientRepository dao;

    @Transactional
    @Override
    public Client save(Client c) {
        System.out.println("\n ClientService level...\n");
        return (Client) dao.save(c);
    }
    @Transactional
    @Override
    public Client modify(Client newClt) {
        Client oldClt = (Client) dao.findById((long) newClt.getId()).get();
        oldClt.setName(newClt.getName());
        return (Client) dao.save(oldClt);
    }
    @Transactional
    @Override
    public void remove(long idClt) {
        dao.deleteById(idClt);
    }

    @Override
    public Client getOne(long idClt) {
        return (Client) dao.findById(idClt).get();
    }

    @Override
    public List<Client> getAll() {
        return (List<Client>) dao.findAll();
    }
}
