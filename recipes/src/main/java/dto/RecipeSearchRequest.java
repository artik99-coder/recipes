package dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class RecipeSearchRequest {
    private List<String> ingredients;
    private Integer maxCalories;
    private String dishType;
}
