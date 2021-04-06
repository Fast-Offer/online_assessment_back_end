DROP TABLE IF EXISTS "fav";
CREATE TABLE public.fav
(
    interviewee_account_id uuid NOT NULL,
    question_id uuid NOT NULL,
    id uuid NOT NULL,
    "timestamp" timestamp without time zone NOT NULL,
    PRIMARY KEY (id)
);

ALTER TABLE public.fav
    ADD FOREIGN KEY (interviewee_account_id)
        REFERENCES public.user_account (id)
    NOT VALID;


ALTER TABLE public.fav
    ADD FOREIGN KEY (question_id)
        REFERENCES public.question (id)
    NOT VALID;