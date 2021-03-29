DROP TABLE IF EXISTS "redo";
CREATE TABLE redo
(
    user_id UUID NOT NULL,
    question_id UUID NOT NULL,
    CONSTRAINT redo_user_id_fkey FOREIGN KEY (user_id)
        REFERENCES public.user_account (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID,
    CONSTRAINT redo_question_id_fkey FOREIGN KEY (question_id)
        REFERENCES public.question (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
);