CREATE TABLE collection
(
    collectionId uuid PRIMARY KEY,
    creator      uuid,
    imageUrl     VARCHAR(500),
    name         VARCHAR(100),
    description  VARCHAR(500),
    timeCost     VARCHAR(50),
    isPublic     boolean,
    category     VARCHAR(50),
    type         VARCHAR(50),
    questionList VARCHAR
);