package be.he2b.concerts.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConcertService {
    @Autowired
    private ConcertDB concertDB;

    public Iterable<Concert> getConcerts(){
        return concertDB.findAll();
    }
}
