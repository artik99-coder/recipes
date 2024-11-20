package repository;

import entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    @Query("SELECT r FROM Recipe r JOIN r.favorites f WHERE f.user.id = :userId")
    List<Recipe> findFavoritesByUserId(Long userId);
}
