package service;

import client.SpoonacularApiClient;
import dto.RecipeSearchResponse;
import entity.Recipe;
import org.springframework.stereotype.Service;
import repository.RecipeRepository;

import java.util.List;

@Service
public class RecipeService {

    private final SpoonacularApiClient apiClient;
    private final RecipeRepository recipeRepository;

    public RecipeService(SpoonacularApiClient apiClient, RecipeRepository recipeRepository) {
        this.apiClient = apiClient;
        this.recipeRepository = recipeRepository;
    }

    public List<RecipeSearchResponse> searchRecipes(List<String> ingredients) {
        return apiClient.searchRecipes(ingredients);
    }

    public void saveToFavorites(Long userId, Long recipeId) {
        // Logic to save recipe to the user's favorites
    }

    public List<Recipe> getFavorites(Long userId) {
        return recipeRepository.findFavoritesByUserId(userId);
    }
}
