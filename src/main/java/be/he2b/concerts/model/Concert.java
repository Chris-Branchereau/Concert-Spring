package be.he2b.concerts.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Concert {
    @Id
    private Long id;
    @NotBlank
    private LocalDateTime time;
    @ManyToOne
    private Tour tour;
    @ManyToOne
    private Venue venue;
}
