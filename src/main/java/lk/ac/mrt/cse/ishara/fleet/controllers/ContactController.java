package lk.ac.mrt.cse.ishara.fleet.controllers;

import lk.ac.mrt.cse.ishara.fleet.models.Contact;
import lk.ac.mrt.cse.ishara.fleet.services.ContactService;
import lk.ac.mrt.cse.ishara.fleet.services.CountryService;
import lk.ac.mrt.cse.ishara.fleet.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class ContactController {

    @Autowired
    private StateService stateService;
    @Autowired
    private CountryService countryService;
    @Autowired
    private ContactService contactService;

    //Get All Contacts
    @GetMapping("/contacts")
    public String findAll(Model model) {
        model.addAttribute("countries", countryService.findAll());
        model.addAttribute("states", stateService.findAll());
        model.addAttribute("contacts", contactService.findAll());
        return "contact";
    }

    @RequestMapping("contacts/findById")
    @ResponseBody
    public Optional<Contact> findById(Integer id) {
        return contactService.findById(id);
    }

    //Add Contact
    @PostMapping(value = "contacts/addNew")
    public String addNew(Contact contact) {
        contactService.save(contact);
        return "redirect:/contacts";
    }

    @RequestMapping(value = "contacts/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Contact contact) {
        contactService.save(contact);
        return "redirect:/contacts";
    }

    @RequestMapping(value = "contacts/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        contactService.delete(id);
        return "redirect:/contacts";
    }

}
