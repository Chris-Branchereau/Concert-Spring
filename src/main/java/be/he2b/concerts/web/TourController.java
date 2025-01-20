package be.he2b.concerts.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import be.he2b.concerts.model.ConcertService;

@RestController
@CrossOrigin(origins="*")
public class TourController {
    @Autowired
    private ConcertService concertService;
    @GetMapping("/tours/{id}")
    public ModelAndView  tour(@PathVariable("id") Long id) {
        ModelAndView modelAndView = new ModelAndView();
        var tour = concertService.getTour(id);
        if (!tour.isEmpty()) {
            modelAndView.addObject("title", tour.get().getTitle());
            modelAndView.addObject("artist", tour.get().getArtist());
            modelAndView.addObject("concerts", tour.get().getConcerts());
        } else {
            modelAndView.addObject("title", "");
            modelAndView.addObject("artist", "");
            modelAndView.addObject("concerts", "");
        }
        
        
        
        modelAndView.setViewName("tours.html");
        return modelAndView;
    }

}
