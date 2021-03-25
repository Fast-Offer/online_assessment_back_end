DROP TABLE IF EXISTS "question";
CREATE TABLE public.question
(
    id UUID primary key,
    name character varying COLLATE pg_catalog."default" NOT NULL,
    title character varying(500) COLLATE pg_catalog."default" NOT NULL,
    OptionA character varying(500) COLLATE pg_catalog."default" NOT NULL,
    OptionB character varying(500) COLLATE pg_catalog."default" NOT NULL,
    OptionC character varying(500) COLLATE pg_catalog."default" NOT NULL,
    OptionD character varying(500) COLLATE pg_catalog."default" NOT NULL,
    correct_option character varying(10) COLLATE pg_catalog."default" NOT NULL,
    explanation character varying(500) COLLATE pg_catalog."default" NOT NULL,
    category character varying(50) COLLATE pg_catalog."default" NOT NULL

);