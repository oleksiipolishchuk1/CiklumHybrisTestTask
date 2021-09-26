package com.oleksii.polishchuk.ciklum.hybris.test.task.service;

import com.oleksii.polishchuk.ciklum.hybris.test.task.repository.Order;
import com.oleksii.polishchuk.ciklum.hybris.test.task.repository.OrderRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

class OrderServiceTest extends BaseUnitTest{
    @InjectMocks
    private OrderService OrderService;
    @Mock
    private OrderRepository OrderRepository;

    @Nested
    class OrderExist{
        @BeforeEach
        void init(){
            Order newOrder = new Order();
            newOrder.setId(1);
            when(OrderRepository.findById(1)).thenReturn(Optional.of(newOrder));
        }

        @Test
        void getOrderById_success() {
            Order Order = OrderService.getOrderById(1);
            assertEquals(1, Order.getId());
        }
    }


    @Nested
    class NoOrder{
        @Test
        void getOrderById_no_Order_throw_exception() {
            assertThrows(IllegalArgumentException.class, ()-> OrderService.getOrderById(1));
        }
    }

}