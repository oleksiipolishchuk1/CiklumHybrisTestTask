package com.oleksii.polishchuk.ciklum.hybris.test.task.service;

import com.oleksii.polishchuk.ciklum.hybris.test.task.repository.Order;
import com.oleksii.polishchuk.ciklum.hybris.test.task.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
  private final OrderRepository orderRepository;

  public Order getOrderById(int orderId) {
    return orderRepository.findById(orderId).orElseThrow(() -> new IllegalArgumentException());
  }
}
