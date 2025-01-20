package be.he2b.concerts.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.he2b.concerts.model.ConcertService;
import be.he2b.concerts.model.entities.Venue;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class VenueController {
    @Autowired
    private ConcertService concertService;
    @GetMapping("/venues")
    public Iterable<Venue> getVenues() {
        var venues = concertService.getVenues();
        return venues;
    }

}
