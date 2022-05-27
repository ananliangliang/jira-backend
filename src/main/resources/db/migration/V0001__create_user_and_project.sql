create table project
(
    id           bigint auto_increment
        primary key,
    name         varchar(255)                       null,
    organization varchar(255)                       null,
    user_id      bigint                             null,
    create_time  datetime default CURRENT_TIMESTAMP not null,
    update_time  datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP
);


create table user
(
    id          bigint auto_increment
        primary key,
    name        varchar(255)                       not null,
    username    varchar(64)                        null comment '用户名',
    password    varchar(128)                       null comment '密码',
    create_time datetime default CURRENT_TIMESTAMP not null,
    update_time datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP,
    constraint user_username_uindex
        unique (username)
);


