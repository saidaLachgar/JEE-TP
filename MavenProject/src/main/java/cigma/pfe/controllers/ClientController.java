package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

//@Controller("controller")
@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    ClientService service;

    @PostMapping("/create")
    public Client save(@RequestBody Client c) {
        return service.save(c);
    }

    @PutMapping("/update")
    public Client modify(@RequestBody Client clt) {
        return service.modify(clt);
    }

    @DeleteMapping("/remove")
    public void remove(@RequestBody Map<String, Integer> map) {
        service.remove(map.get("id"));
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
