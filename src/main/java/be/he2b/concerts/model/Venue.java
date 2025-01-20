package be.he2b.concerts.model;

import java.util.Collection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Venue {
    @Id
    private Long id;
    @NotBlank
    private String name;
    @NotNull
    private int capacity;
    @NotBlank
    private String address;
    @Enumerated(EnumType.STRING)
    private VenueType type;
    @OneToMany(mappedBy = "venue")
    private Collection<Concert> concerts;

}
