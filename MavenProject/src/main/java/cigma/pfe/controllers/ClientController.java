package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.services.ClientService;
import cigma.pfe.services.ClientServiceImpl;

public class ClientController {
    ClientService clientService;
    public ClientController(ClientService clientService) {
        System.out.println("Call ClientController with clientService param....");
        this.clientService = clientService;
    }

    public ClientController() {
        System.out.println("\n Call ClientController ....\n");
    }

    public Client save(Client c ){
        System.out.println("\n ClientController level...\n");
        return clientService.save(c);
    }
}
