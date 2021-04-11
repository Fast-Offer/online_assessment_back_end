CREATE TABLE interviewee_profile (
     profile_id uuid PRIMARY KEY,
     name VARCHAR(55),
     age VARCHAR,
     avatar VARCHAR,
     self_introduction VARCHAR(500),
     phone VARCHAR,
     website VARCHAR,
     location VARCHAR
);