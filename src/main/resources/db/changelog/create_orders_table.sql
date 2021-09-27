create table testdb.orders
(
    id         int auto_increment
        primary key,
    user_id    int          not null,
    status     varchar(255) not null,
    created_at varchar(255) not null
);


