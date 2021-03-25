CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
DROP TABLE IF EXISTS "user_account";

CREATE TABLE user_account (
    Id  uuid PRIMARY KEY DEFAULT uuid_generate_v4 (),
    password VARCHAR(99) NOT NULL,
    email VARCHAR(50) NOT NULL
)