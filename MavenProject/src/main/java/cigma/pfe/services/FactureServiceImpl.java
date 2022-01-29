package cigma.pfe.services;

import cigma.pfe.models.Facture;
import cigma.pfe.repositories.FactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class FactureServiceImpl implements FactureService{
    @Autowired
    FactureRepository factureRepository;

    @Transactional
    @Override
    public Facture save(Facture f) {
        return factureRepository.save(f);
    }

    @Transactional
    @Override
    public Facture update(Facture f) {
        return factureRepository.update(f);
    }

    @Transactional
    @Override
    public Facture delete(long id) {
        return factureRepository.delete(id);
    }

    @Override
    public Facture find(long id) {
        return factureRepository.find(id);
    }

    @Override
    public Facture findAll() {
        return factureRepository.findAll();
    }
}
