create table sys_user
(
    id          serial       not null
        constraint sys_user_pk
            primary key,
    username    varchar(255) not null,
    password    varchar(255) not null,
    locked_flag bit default NULL::"bit",
    role_id     integer
        constraint sys_user_sys_role_id_fk
            references sys_role
);

alter table sys_user
    owner to postgres;

INSERT INTO public.sys_user (id, username, password, locked_flag, role_id) VALUES (1, 'admin', '$2a$10$W7sVR75u.4Kpbjg7/lHUx.6iwQXIoeBfpip4zs8P.N0Gia2SeGvGO', '0', 1);
INSERT INTO public.sys_user (id, username, password, locked_flag, role_id) VALUES (2, 'teacher1', '$2a$10$W7sVR75u.4Kpbjg7/lHUx.6iwQXIoeBfpip4zs8P.N0Gia2SeGvGO', '0', 2);
INSERT INTO public.sys_user (id, username, password, locked_flag, role_id) VALUES (3, 'student1', '$2a$10$W7sVR75u.4Kpbjg7/lHUx.6iwQXIoeBfpip4zs8P.N0Gia2SeGvGO', '0', 3);