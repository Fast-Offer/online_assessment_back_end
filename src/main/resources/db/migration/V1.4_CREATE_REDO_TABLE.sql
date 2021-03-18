DROP TABLE IF EXISTS "redo"
CREATE TABLE public.redo
(
    interviewee_id bigint NOT NULL,
    question_id bigint NOT NULL,
    id bigint NOT NULL,
    CONSTRAINT redo_interviewee_id_fkey FOREIGN KEY (interviewee_id)
        REFERENCES public.interviewee (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID,
    CONSTRAINT redo_question_id_fkey FOREIGN KEY (question_id)
        REFERENCES public.question (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
);