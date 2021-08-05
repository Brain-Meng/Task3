create table sys_resource
(
    id            serial       not null
        constraint sys_resource_pk
            primary key,
    resource_name varchar(255) not null,
    type          integer      not null,
    url           varchar(255) not null,
    resource_key  varchar(255)
);

alter table sys_resource
    owner to postgres;

create unique index sys_resource_resource_name_uindex
    on sys_resource (resource_name);

INSERT INTO public.sys_resource (id, resource_name, type, url, resource_key) VALUES (1, '菜单1', 0, '/menu1', 'menu1');
INSERT INTO public.sys_resource (id, resource_name, type, url, resource_key) VALUES (2, '菜单2', 1, '/menu2', 'menu2');
INSERT INTO public.sys_resource (id, resource_name, type, url, resource_key) VALUES (3, '菜单3', 0, '/menu3', 'menu3');