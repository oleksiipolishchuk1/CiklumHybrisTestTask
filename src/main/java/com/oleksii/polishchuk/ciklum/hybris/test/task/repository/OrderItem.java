package com.oleksii.polishchuk.ciklum.hybris.test.task.repository;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Cacheable
@Table(name = "order_items")
public class OrderItem {

  @EmbeddedId OrderItemKey id;

  @OneToOne
  @MapsId("productId")
  @JoinColumn(name = "orderId", columnDefinition = "int(11)")
  Product product;

  @OneToOne
  @MapsId("orderId")
  @JoinColumn(name = "productId", columnDefinition = "int(11)")
  Order order;

  @Column(name = "quantity")
  Integer quantity;
}
