package be.he2b.concerts.model.repositories;

import org.springframework.data.repository.CrudRepository;

import be.he2b.concerts.model.entities.Tour;

public interface TourDB extends CrudRepository<Tour,Long>{

}
