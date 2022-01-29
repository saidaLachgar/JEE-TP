package cigma.pfe.controllers;

import cigma.pfe.models.Facture;
import cigma.pfe.services.FactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class FactureController {
    @Autowired
    FactureService factureService;

    public Facture save(Facture c){
        return factureService.save(c);
    }

    public Facture update(Facture c){
        return factureService.update(c);
    }

    public Facture delete(long id){
        return factureService.delete(id);
    }

    public Facture find(long id){
        return factureService.find(id);
    }

    public Facture findAll(){
        return factureService.findAll();
    }
}