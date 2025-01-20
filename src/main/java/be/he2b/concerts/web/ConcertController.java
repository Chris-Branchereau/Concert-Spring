package be.he2b.concerts.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import be.he2b.concerts.model.ConcertService;
import be.he2b.concerts.model.entities.Concert;
import jakarta.validation.Valid;

@Controller
public class ConcertController {
    @Autowired
    private ConcertService concertService;
    @GetMapping("/concerts")
    public String concert(Model model) {
        getModelElement(model);
        model.addAttribute("concert", new Concert());
        return "concerts";
    }

    @PostMapping("/concerts")
    public String registerConcert(@Valid @ModelAttribute("concert") Concert concert, Errors errors, Model model) {
        
        if(errors.hasErrors()) {
            getModelElement(model);
            return "redirect:/concerts";
        }
        
        concertService.setConcert(concert);
        getModelElement(model);
        return "redirect:/concerts";
    }

    public Model getModelElement(Model model){
        var concerts = concertService.getConcerts();
        var tours = concertService.getTours();
        var venues = concertService.getVenues();
        model.addAttribute("concerts", concerts);
        model.addAttribute("tours", tours);
        model.addAttribute("venues", venues);
        return model;
    }


}
