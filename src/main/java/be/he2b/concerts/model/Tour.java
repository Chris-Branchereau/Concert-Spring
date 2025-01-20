package be.he2b.concerts.model;

import java.util.Collection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Tour {
    @Id
    private Long id;
    @NotBlank
    private String title;
    @NotBlank
    private String artist;
    @OneToMany(mappedBy = "tour")
    private Collection<Concert> concerts;
}
