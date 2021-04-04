DROP TABLE IF EXISTS "interviewee";

CREATE TABLE interviewee_profile (
    interviewee_id uuid PRIMARY KEY,
    name VARCHAR(55),
    age VARCHAR,
    avatar VARCHAR,
    self_introduction VARCHAR(500),
    phone VARCHAR,
    website VARCHAR,
    location VARCHAR
);