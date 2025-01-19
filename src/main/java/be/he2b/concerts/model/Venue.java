package be.he2b.concerts.model;

import java.util.Collection;

public class Venue {
    private Long id;
    private String name;
    private int capacity;
    private String address;
    private VenueType type;
    private Collection<Concert> concerts;

}
