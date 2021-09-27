create table testdb.order_items
(
    order_id   int not null,
    product_id int not null,
    quantity   int not null,
    constraint order_items_orders_id_fk
        foreign key (order_id) references testdb.orders (id)
            on update cascade on delete cascade,
    constraint order_items_products_id_fk
        foreign key (product_id) references testdb.products (id)
            on update cascade on delete cascade
);

