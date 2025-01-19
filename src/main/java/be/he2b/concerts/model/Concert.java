package be.he2b.concerts.model;

import java.time.LocalDateTime;

public class Concert {
    private Long id;
    private LocalDateTime time;
    private Tour tour;
    private Venue venue;
}
