package be.he2b.concerts.model;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.he2b.concerts.model.entities.Concert;
import be.he2b.concerts.model.entities.Tour;
import be.he2b.concerts.model.repositories.ConcertDB;
import be.he2b.concerts.model.repositories.TourDB;

@Service
public class ConcertService {
    @Autowired
    private ConcertDB concertDB;
    @Autowired
    private TourDB tourDB;

    public Iterable<Concert> getConcerts(){
        return concertDB.findAll();
    }

    public Optional<Tour> getTour(Long id){
       return tourDB.findById(id);
        
    }
}
