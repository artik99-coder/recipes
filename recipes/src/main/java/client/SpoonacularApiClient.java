package client;

import dto.RecipeSearchResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class SpoonacularApiClient {

    @Value("${spoonacular.api.key}")
    private String apiKey;

    private final RestTemplate restTemplate;

    public SpoonacularApiClient(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public List<RecipeSearchResponse> searchRecipes(List<String> ingredients) {
        String url = "https://api.spoonacular.com/recipes/findByIngredients?ingredients=" +
                String.join(",", ingredients) + "&apiKey=" + apiKey;

        ResponseEntity<RecipeSearchResponse[]> response = restTemplate.getForEntity(url, RecipeSearchResponse[].class);
        return Arrays.asList(response.getBody());
    }
}
