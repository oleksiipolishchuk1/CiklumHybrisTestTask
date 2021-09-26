package com.oleksii.polishchuk.ciklum.hybris.test.task.service;

import com.oleksii.polishchuk.ciklum.hybris.test.task.repository.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

class OrderItemServiceTest extends BaseUnitTest {
    @InjectMocks
    private OrderItemService orderItemService;
    @Mock
    private OrderItemRepository orderItemRepository;

    @Nested
    class ProductExist {
        @BeforeEach
        void init() {
            Product product = new Product();
            product.setId(1);

            Order order = new Order();
            order.setId(1);

            OrderItem orderItem = new OrderItem();
            orderItem.setOrder(order);
            orderItem.setProduct(product);

            when(orderItemRepository.findByProductAndOrder(1, 1)).thenReturn(Optional.of(orderItem));
        }

        @Test
        void getProductById_success() {
            OrderItem orderItem = orderItemService.getOrderItemByOrderIdAndProductId(1, 1);
            assertEquals(1, orderItem.getProduct().getId());
            assertEquals(1, orderItem.getOrder().getId());
        }
    }


    @Nested
    class NoProduct {
        @Test
        void getProductById_no_product_throw_exception() {
            assertThrows(IllegalArgumentException.class, () -> orderItemService.getOrderItemByOrderIdAndProductId(1, 1));
        }
    }

}