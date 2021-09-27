package com.oleksii.polishchuk.ciklum.hybris.test.task.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface OrderItemRepository extends CrudRepository<OrderItem, Integer> {
  Optional<OrderItem> findByProductAndOrder(int productId, int orderId);
}
