CREATE TABLE question (
    question_id uuid PRIMARY KEY,
    creator uuid,
    title VARCHAR(500),
    option_a VARCHAR(500),
    option_b VARCHAR(500),
    option_c VARCHAR(500),
    option_d VARCHAR(500),
    correct_option VARCHAR(10),
    explanation VARCHAR(500),
    category VARCHAR(500),
    created_time TIMESTAMP NOT NULL,
    FOREIGN KEY (creator) REFERENCES company_account(company_id)
);