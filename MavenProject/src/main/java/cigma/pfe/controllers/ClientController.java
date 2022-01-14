package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.services.ClientServiceImpl;
import cigma.pfe.services.ClientService;


public class ClientController {
    ClientService service;
    public void setService(ClientService service) {
        this.service = service;
    }

    public boolean save(Client c ){
//        System.out.println("ClientController level...");
        return service.save(c);
    }
    public ClientController() {
//        System.out.println("Call ClientController ....");
    }
}
