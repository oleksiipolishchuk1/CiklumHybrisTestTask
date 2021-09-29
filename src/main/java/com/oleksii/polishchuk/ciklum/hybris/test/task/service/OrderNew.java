package com.oleksii.polishchuk.ciklum.hybris.test.task.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderNew {
  public List<OrderProduct> products;

  public OrderNew(){}

  public OrderNew(List<OrderProduct> products) {
    this.products = products;
  }
}
