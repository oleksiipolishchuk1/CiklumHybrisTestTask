package com.oleksii.polishchuk.ciklum.hybris.test.task.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderProduct {
  public Integer product;
  public Integer quantity;

  public OrderProduct(){}

  public OrderProduct(Integer product, Integer quantity) {
    this.product = product;
    this.quantity = quantity;
  }
}
