package be.he2b.concerts.model;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.he2b.concerts.model.entities.Concert;
import be.he2b.concerts.model.entities.Tour;
import be.he2b.concerts.model.entities.Venue;
import be.he2b.concerts.model.repositories.ConcertDB;
import be.he2b.concerts.model.repositories.TourDB;
import be.he2b.concerts.model.repositories.VenueDB;

@Service
public class ConcertService {
    @Autowired
    private ConcertDB concertDB;
    @Autowired
    private TourDB tourDB;
    @Autowired
    private VenueDB venueDB;
    public Iterable<Concert> getConcerts(){
        return concertDB.findAll();
    }
    public void setConcert(Concert concert){
        concertDB.save(concert);
    }
    public Iterable<Tour> getTours(){
        return tourDB.findAll();
    }
    public Optional<Tour> getTour(Long id){
       return tourDB.findById(id);
    }
    
    public Iterable<Venue> getVenues(){
        return venueDB.findAll();
    }
}
