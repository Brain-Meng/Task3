create table sys_role_resource
(
    role_id     integer not null
        constraint sys_role_resource_sys_resource_id_fk
            references sys_resource
        constraint sys_role_resource_sys_role_id_fk
            references sys_role,
    resource_id integer not null,
    constraint sys_role_resource_pk
        primary key (role_id, resource_id)
);

alter table sys_role_resource
    owner to postgres;

INSERT INTO public.sys_role_resource (role_id, resource_id) VALUES (1, 1);
INSERT INTO public.sys_role_resource (role_id, resource_id) VALUES (2, 1);
INSERT INTO public.sys_role_resource (role_id, resource_id) VALUES (3, 1);
INSERT INTO public.sys_role_resource (role_id, resource_id) VALUES (1, 2);
INSERT INTO public.sys_role_resource (role_id, resource_id) VALUES (2, 2);
INSERT INTO public.sys_role_resource (role_id, resource_id) VALUES (1, 3);