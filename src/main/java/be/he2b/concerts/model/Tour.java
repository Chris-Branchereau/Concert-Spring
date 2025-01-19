package be.he2b.concerts.model;

import java.util.Collection;

public class Tour {
    private Long id;
    private String title;
    private String artist;
    private Collection<Concert> concerts;
}
