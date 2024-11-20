package controller;

import dto.RecipeSearchResponse;
import entity.Recipe;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.RecipeService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/recipes")
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/search")
    public ResponseEntity<List<RecipeSearchResponse>> searchRecipes(@RequestParam List<String> ingredients) {
        return ResponseEntity.ok(recipeService.searchRecipes(ingredients));
    }

    @PostMapping("/favorites")
    public ResponseEntity<Void> saveToFavorites(@RequestParam Long userId, @RequestParam Long recipeId) {
        recipeService.saveToFavorites(userId, recipeId);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/favorites")
    public ResponseEntity<List<Recipe>> getFavorites(@RequestParam Long userId) {
        return ResponseEntity.ok(recipeService.getFavorites(userId));
    }
}
