CREATE TABLE public.report_bug
(
    bug_id uuid NOT NULL,
    description character varying NOT NULL,
    reporter uuid,
    report_time timestamp without time zone NOT NULL,
    question_id uuid,
    PRIMARY KEY (bug_id)
);

ALTER TABLE public.report_bug
    ADD FOREIGN KEY (question_id)
        REFERENCES public.question (question_id)
        NOT VALID;


ALTER TABLE public.report_bug
    ADD FOREIGN KEY (reporter)
        REFERENCES public.interviewee_account (interviewee_id)
        NOT VALID;
