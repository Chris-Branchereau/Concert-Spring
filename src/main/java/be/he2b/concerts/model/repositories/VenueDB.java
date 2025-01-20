package be.he2b.concerts.model.repositories;

import org.springframework.data.repository.CrudRepository;

import be.he2b.concerts.model.entities.Venue;

public interface VenueDB extends CrudRepository<Venue,Long>{

}
