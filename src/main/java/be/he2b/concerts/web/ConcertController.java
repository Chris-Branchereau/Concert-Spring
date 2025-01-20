package be.he2b.concerts.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import be.he2b.concerts.model.ConcertService;

@Controller
public class ConcertController {
    @Autowired
    private ConcertService concertService;
    @GetMapping("/concerts")
    public String concert(Model model) {
        var concerts = concertService.getConcerts();
        model.addAttribute("concerts", concerts);
        return "concerts";
    }
}
