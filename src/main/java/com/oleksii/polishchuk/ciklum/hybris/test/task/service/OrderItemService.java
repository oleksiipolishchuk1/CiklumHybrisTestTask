package com.oleksii.polishchuk.ciklum.hybris.test.task.service;

import com.oleksii.polishchuk.ciklum.hybris.test.task.repository.OrderItem;
import com.oleksii.polishchuk.ciklum.hybris.test.task.repository.OrderItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderItemService {

  private final OrderItemRepository orderItemRepository;

  public OrderItem getOrderItemByOrderIdAndProductId(int productId, int orderId) {
    return orderItemRepository
        .findByProductAndOrder(productId, orderId)
        .orElseThrow(() -> new IllegalArgumentException());
  }
}
