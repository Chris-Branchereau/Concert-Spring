package be.he2b.concerts.model.repositories;

import org.springframework.data.repository.CrudRepository;

import be.he2b.concerts.model.entities.Concert;

public interface ConcertDB extends CrudRepository<Concert,Long>{

}
