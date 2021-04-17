CREATE TABLE interviewee_account (
    interviewee_id uuid PRIMARY KEY,
    email VARCHAR(55) NOT NULL,
    password VARCHAR(55) NOT NULL
);

CREATE TABLE company_account (
    company_id uuid PRIMARY KEY
);