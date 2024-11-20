package service;

import entity.ShoppingList;
import org.springframework.stereotype.Service;
import repository.ShoppingListRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class ShoppingListService {

    private final ShoppingListRepository shoppingListRepository;

    public ShoppingListService(ShoppingListRepository shoppingListRepository) {
        this.shoppingListRepository = shoppingListRepository;
    }

    public void addToShoppingList(Long userId, List<String> items) {
        ShoppingList shoppingList = shoppingListRepository.findByUserId(userId)
                .orElseGet(() -> {
                    ShoppingList newShoppingList = new ShoppingList();
                    newShoppingList.setUserId(userId);
                    newShoppingList.setItems(new ArrayList<>());
                    return newShoppingList;
                });
        shoppingList.getItems().addAll(items);
        shoppingListRepository.save(shoppingList);
    }

    public List<String> getShoppingList(Long userId) {
        return shoppingListRepository.findByUserId(userId)
                .map(ShoppingList::getItems)
                .orElse(Collections.emptyList());
    }
}
