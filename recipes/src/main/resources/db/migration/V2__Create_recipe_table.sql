CREATE TABLE recipes (
                         id BIGSERIAL PRIMARY KEY,
                         title VARCHAR(255) NOT NULL,
                         instructions TEXT NOT NULL,
                         created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
