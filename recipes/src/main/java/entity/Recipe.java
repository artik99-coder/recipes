package entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String instructions;

    @ElementCollection
    private List<String> ingredients;

    @ManyToMany(mappedBy = "favorites")
    private List<User> favoritedBy;

    // Getters and setters
}
