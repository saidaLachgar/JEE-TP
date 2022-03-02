package ma.cigma.Frontend.controllers;


import ma.cigma.Frontend.models.Client;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ClientController {

    @Value("${api.url}")
    private String apiUrl;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = {"/", "/clients"})
    public String home(@ModelAttribute("client") Client c, @NotNull Model MyModel) {
        MyModel.addAttribute("client", new Client());
        List clients = restTemplate.getForObject(apiUrl + "/client/all", List.class);
        MyModel.addAttribute("clients", clients);
        MyModel.addAttribute("client", c != null ? c : new Client());
        return "index-client";
    }

    @PostMapping(value = "/save-client")
    public String saveClient(@ModelAttribute("client") Client c) {
        if(c.getId() == 0 ) {
            restTemplate.postForObject(apiUrl + "/client/create", c, Client.class);
        }else{
            restTemplate.put(apiUrl + "/client/update", c, Client.class);
        }
        return "redirect:/clients";
    }

    @GetMapping(value = {"/delete-client/{id}"})
    public String deleteClientById(@PathVariable long id) {
        restTemplate.delete(apiUrl + "/client/remove/" + id);
        return "redirect:/clients";
    }

    @GetMapping(value = {"/show-client/{id}"})
    public String showClientById(RedirectAttributes ra, @PathVariable long id) {
        Client c = restTemplate.getForObject(apiUrl + "/client/" + id, Client.class);
        ra.addFlashAttribute("client", c);
        return "redirect:/clients";
    }
}
