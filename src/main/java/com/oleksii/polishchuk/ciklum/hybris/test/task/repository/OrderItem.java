package com.oleksii.polishchuk.ciklum.hybris.test.task.repository;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Cacheable
public class OrderItem {

    @EmbeddedId
    OrderItemKey id;

    @OneToOne
    @MapsId("productId")
    @JoinColumn(name = "product_id")
    Product product;


    @OneToOne
    @MapsId("orderId")
    @JoinColumn(name = "order_id")
    Order order;
}
