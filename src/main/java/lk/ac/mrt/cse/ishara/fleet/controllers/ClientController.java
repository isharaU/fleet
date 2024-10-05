package lk.ac.mrt.cse.ishara.fleet.controllers;

import com.kindsonthegenius.fleetms.models.Client;
import com.kindsonthegenius.fleetms.services.ClientService;
import com.kindsonthegenius.fleetms.services.CountryService;
import com.kindsonthegenius.fleetms.services.StateService;
import lk.ac.mrt.cse.ishara.fleet.models.Client;
import lk.ac.mrt.cse.ishara.fleet.services.ClientService;
import lk.ac.mrt.cse.ishara.fleet.services.CountryService;
import lk.ac.mrt.cse.ishara.fleet.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class ClientController {

    @Autowired
    private StateService stateService;
    @Autowired
    private CountryService countryService;
    @Autowired
    private ClientService clientService;

    //Get All Clients
    @GetMapping("/clients")
    public String findAll(Model model) {
        model.addAttribute("countries", countryService.findAll());
        model.addAttribute("states", stateService.findAll());
        model.addAttribute("clients", clientService.findAll());
        return "client";
    }

    @RequestMapping("clients/findById")
    @ResponseBody
    public Optional<Client> findById(Integer id) {
        return clientService.findById(id);
    }

    //Add Client
    @PostMapping(value = "clients/addNew")
    public String addNew(Client client) {
        clientService.save(client);
        return "redirect:/clients";
    }

    @RequestMapping(value = "clients/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Client client) {
        clientService.save(client);
        return "redirect:/clients";
    }

    @RequestMapping(value = "clients/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        clientService.delete(id);
        return "redirect:/clients";
    }

}
