package com.ltp.workbook;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WorkbookController {
    
    @GetMapping("/")
    public String getShows() {
        Show bb = new Show("Breaking Bad", "Ozymandias", 10.0);
        Show AoTH = new Show("Attack on Titan", "Hero", 9.9);
        Show AoTP = new Show("Attack on Titan", "Perfect Game", 9.9);
        Show sW = new Show("Star Wars: The Clone Wars", "Victory and Death", 9.9);
        Show mR = new Show("Mr. Robot", "407 Proxy Authentication Required", 9.9);

        return "shows";
    }

}
