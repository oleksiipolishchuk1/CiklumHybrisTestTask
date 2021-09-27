package com.oleksii.polishchuk.ciklum.hybris.test.task.repository;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OrderItemKey implements Serializable {

  @Column(name = "order_id")
  Long orderId;

  @Column(name = "product_id")
  Long productId;

  // standard constructors, getters, and setters
  // hashcode and equals implementation
}
