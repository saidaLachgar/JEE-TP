package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller("controller")
@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    ClientService service;

    @PostMapping("/create")
    public Client save(Client c) {
        System.out.println("\n ClientController level...\n");
        return service.save(c);
    }

    @PutMapping("/update")
    public Client modify(Client clt) {
        return service.modify(clt);
    }

    @DeleteMapping("/remove")
    public void remove(long idClt) {
        service.remove(idClt);
    }

    @GetMapping("/{id}")
    public Client getOne(@PathVariable("id") long id) {
        return service.getOne(id);
    }

    @GetMapping("/all")
    public List<Client> getAll() {
        return service.getAll();
    }
}
