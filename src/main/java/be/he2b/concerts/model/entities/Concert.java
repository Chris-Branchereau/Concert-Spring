package be.he2b.concerts.model.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Concert {
    @Id @GeneratedValue
    private Long id;
    @NotNull
    private LocalDateTime time;
    @ManyToOne
    private Tour tour;
    @ManyToOne
    private Venue venue;
}
