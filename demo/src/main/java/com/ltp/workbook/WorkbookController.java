package com.ltp.workbook;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WorkbookController {
    
    @GetMapping("/")
    public String getShows(Model model) {
        Show bb = new Show("Breaking Bad", "Ozymandias", 10.0);
        model.addAttribute("bb", bb);


        Show AoTH = new Show("Attack on Titan", "Hero", 9.9);
        model.addAttribute("AoTH", AoTH);

        Show AoTP = new Show("Attack on Titan", "Perfect Game", 9.9);
        model.addAttribute("AoTP", AoTP);

        Show sw = new Show("Star Wars: The Clone Wars", "Victory and Death", 9.9);
        model.addAttribute("sw", sw);

        Show mr = new Show("Mr. Robot", "407 Proxy Authentication Required", 9.9);
        model.addAttribute("mr", mr);
        return "shows";
    }

}
