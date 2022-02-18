package cigma.pfe.services;

import cigma.pfe.repositories.FactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FactureServiceImpl implements FactureService{
    @Autowired
    FactureRepository factureRepository;
}
