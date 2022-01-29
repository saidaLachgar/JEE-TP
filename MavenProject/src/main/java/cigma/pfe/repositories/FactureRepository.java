package cigma.pfe.repositories;

import cigma.pfe.models.Facture;

public interface FactureRepository {
    Facture save(Facture f);
    Facture update(Facture f);
    Facture delete(long id);
    Facture find(long id);
    Facture findAll();
}
