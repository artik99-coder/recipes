package dto;

import lombok.Data;

import java.util.List;

@Data
public class RecipeSearchResponse {
    private Long id;                       // ID рецепта
    private String title;                  // Название рецепта
    private List<String> usedIngredients; // Совпавшие ингредиенты из поиска
    private String summary;                // Краткое описание
    private String imageUrl;               // URL картинки рецепта

    // Конструкторы, геттеры и сеттеры
}
