create table testdb.products
(
    id     int auto_increment
        primary key,
    name   varchar(255)                                     not null,
    price  int                                              not null,
    status enum ('out_of_stock', 'in_stock', 'running_low') not null
);

