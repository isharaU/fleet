package lk.ac.mrt.cse.ishara.fleet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FleetController {

    @GetMapping("/index")
    public String goHome() {
        return "index";
    }
}
