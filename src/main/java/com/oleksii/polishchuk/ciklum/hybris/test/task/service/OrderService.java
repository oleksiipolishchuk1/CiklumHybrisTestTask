package com.oleksii.polishchuk.ciklum.hybris.test.task.service;

import com.oleksii.polishchuk.ciklum.hybris.test.task.repository.*;

import java.util.Date;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
  private final OrderRepository orderRepository;
  private final OrderItemRepository orderItemRepository;
  private final ProductService productService;

  public Order getOrderById(int orderId) {
    return orderRepository.findById(orderId).orElseThrow(() -> new IllegalArgumentException());
  }

  public Order createOrder(OrderNew orderNew) {

    Order order = new Order();
    double randomUser = Math.random();
    order.setUserId((int) randomUser);
    order.setCreated_at(new Date());
    order.setStatus("NEW");
    Order _order = orderRepository.save(order);

    if (orderNew.getProducts() != null){
      orderNew.getProducts().forEach(orderProduct -> {
        // Check if product is exist
        Product _product = productService.getProductById(orderProduct.getProduct());
        if(_product != null){
          OrderItemKey orderItemKey = new OrderItemKey();
          OrderItem  orderItem = new OrderItem();
          orderItem.setId(orderItemKey);
          orderItem.setProduct(_product);
          orderItem.setOrder(_order);
          orderItem.setQuantity(orderProduct.getQuantity());

          // Store order product
          OrderItem _orderItem = orderItemRepository.save(orderItem);
        }

      });
    }

    System.out.println(orderNew);

    //    try {
    //      ObjectMapper objectMapper = new ObjectMapper();
    //      objectMapper.readValue(products.toString(), OrderProduct.class);
    //      // store products
    //
    //      System.out.println(objectMapper);
    //      System.out.println(orderNew);
    //
    //      //            List<Map<String, Integer>> list = (ArrayList) products;
    //      //            list.forEach(m -> m.forEach((k, v) -> System.out.println("key: " + k + "
    // value:"
    //      // + v)));
    //
    //    } catch (JsonGenerationException e) {
    //      e.printStackTrace();
    //    } catch (JsonMappingException e) {
    //      e.printStackTrace();
    //    } catch (IOException e) {
    //      e.printStackTrace();
    //    }

    return _order;
  }
}
