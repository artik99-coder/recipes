package controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.ShoppingListService;

import java.util.List;

@RestController
@RequestMapping("/shopping-list")
public class ShoppingListController {

    private final ShoppingListService shoppingListService;

    public ShoppingListController(ShoppingListService shoppingListService) {
        this.shoppingListService = shoppingListService;
    }

    @PostMapping
    public ResponseEntity<Void> addToShoppingList(@RequestParam Long userId, @RequestBody List<String> items) {
        shoppingListService.addToShoppingList(userId, items);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<String>> getShoppingList(@RequestParam Long userId) {
        return ResponseEntity.ok(shoppingListService.getShoppingList(userId));
    }
}
