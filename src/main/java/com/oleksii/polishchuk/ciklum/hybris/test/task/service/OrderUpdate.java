package com.oleksii.polishchuk.ciklum.hybris.test.task.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderUpdate {
  public Integer orderId;
  public List<OrderProduct> products;
}
