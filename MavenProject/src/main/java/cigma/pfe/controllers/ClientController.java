package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.services.ClientService;
import cigma.pfe.services.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("controller")
public class ClientController {
    @Autowired
    ClientService clientService;

    public Client save(Client c ){
        System.out.println("\n ClientController level...\n");
        return clientService.save(c);
    }
}
