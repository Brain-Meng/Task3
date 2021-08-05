create table t_people
(
    id             serial not null
        constraint t_people_pkey
            primary key,
    people_age     integer,
    people_name    varchar(255),
    people_sex     varchar(255),
    people_subject varchar(255)
);

alter table t_people
    owner to postgres;

INSERT INTO public.t_people (id, people_age, people_name, people_sex, people_subject) VALUES (13, 55, '孙悟空', '男', '水帘洞');
INSERT INTO public.t_people (id, people_age, people_name, people_sex, people_subject) VALUES (12, 1000, '白骨精', '女', '被打三次');
INSERT INTO public.t_people (id, people_age, people_name, people_sex, people_subject) VALUES (10, 99, '沙僧', '男', '大师兄师傅说的对啊');
INSERT INTO public.t_people (id, people_age, people_name, people_sex, people_subject) VALUES (11, 66, '猪八戒', '男', '高老庄那些事');