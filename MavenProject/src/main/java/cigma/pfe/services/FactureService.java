package cigma.pfe.services;

import cigma.pfe.models.Facture;

public interface FactureService {
    Facture save(Facture c);
    Facture update(Facture c);
    Facture delete(long id);
    Facture find(long id);
    Facture findAll();
}
