CREATE TABLE shopping_lists (
                                id BIGSERIAL PRIMARY KEY,
                                user_id BIGINT NOT NULL,
                                items TEXT NOT NULL, -- Хранение элементов в формате JSON или CSV
                                created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
);
