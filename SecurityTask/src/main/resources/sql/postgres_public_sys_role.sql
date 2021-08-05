create table sys_role
(
    id       serial not null
        constraint sys_role_pk
            primary key,
    role_key varchar(255) default NULL::character varying,
    role     varchar(255) default NULL::character varying
);

alter table sys_role
    owner to postgres;

INSERT INTO public.sys_role (id, role_key, role) VALUES (1, 'ADMIN', '管理员');
INSERT INTO public.sys_role (id, role_key, role) VALUES (2, 'TEACHER', '教师');
INSERT INTO public.sys_role (id, role_key, role) VALUES (3, 'STUDENT', '学生');