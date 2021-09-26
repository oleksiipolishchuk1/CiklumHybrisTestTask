package com.oleksii.polishchuk.ciklum.hybris.test.task.repository;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface OrderItemRepository extends CrudRepository<OrderItem, Integer> {
    Optional<OrderItem> findByProductAndOrder(int productId, int orderId);
}
