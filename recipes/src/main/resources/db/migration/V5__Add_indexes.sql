CREATE INDEX idx_user_username ON users(username);
CREATE INDEX idx_recipe_title ON recipes(title);
CREATE INDEX idx_shopping_list_user_id ON shopping_lists(user_id);
CREATE INDEX idx_user_favorites_user_id ON user_favorites(user_id);
CREATE INDEX idx_user_favorites_recipe_id ON user_favorites(recipe_id);
