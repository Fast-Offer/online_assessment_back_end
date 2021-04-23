CREATE TABLE collection
(
    collection_id uuid PRIMARY KEY,
    creator      uuid,
    image_url     VARCHAR(500),
    name         VARCHAR(100),
    description  VARCHAR(500),
    time_cost     VARCHAR(50),
    is_public     boolean,
    category     VARCHAR(50),
    type         VARCHAR(50),
    question_list VARCHAR
);