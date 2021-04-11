CREATE TABLE redo (
    redo_id uuid PRIMARY KEY,
    redo_interviewee_id uuid NOT NULL,
    redo_question_id uuid NOT NULL,
    time_stamp TIMESTAMP,
    FOREIGN KEY (redo_interviewee_id) REFERENCES interviewee_account(interviewee_id),
    FOREIGN KEY (redo_question_id) REFERENCES question(question_id)
);