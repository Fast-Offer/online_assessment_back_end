CREATE TABLE interviewee_profile (
     profile_id uuid PRIMARY KEY,
     profile_interviewee_id uuid NOT NULL,
     name VARCHAR(55),
     age VARCHAR,
     avatar VARCHAR,
     self_introduction VARCHAR(500),
     phone VARCHAR,
     website VARCHAR,
     location VARCHAR,
     FOREIGN KEY (profile_interviewee_id) REFERENCES interviewee_account(interviewee_id)
);