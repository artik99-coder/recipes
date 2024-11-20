CREATE TABLE user_favorites (
                                user_id BIGINT NOT NULL,
                                recipe_id BIGINT NOT NULL,
                                added_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                PRIMARY KEY (user_id, recipe_id),
                                FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE,
                                FOREIGN KEY (recipe_id) REFERENCES recipes(id) ON DELETE CASCADE
);
