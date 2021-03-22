DROP TABLE IF EXISTS "user_account";

CREATE TABLE user_account (
    Id  uuid PRIMARY KEY,
    password VARCHAR(30) NOT NULL,
    email VARCHAR(50) NOT NULL
)