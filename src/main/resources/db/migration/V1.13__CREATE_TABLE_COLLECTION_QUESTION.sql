CREATE TABLE collection_question
(
    collection_question_id             uuid PRIMARY KEY,
    cq_collection_id uuid NOT NULL,
    cq_question_id    uuid NOT NULL,
    FOREIGN KEY (cq_collection_id) REFERENCES collection (collection_id),
    FOREIGN KEY (cq_question_id) REFERENCES question (question_id)
);