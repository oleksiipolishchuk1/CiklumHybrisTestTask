package com.oleksii.polishchuk.ciklum.hybris.test.task.controller;

import com.oleksii.polishchuk.ciklum.hybris.test.task.repository.Order;
import com.oleksii.polishchuk.ciklum.hybris.test.task.service.OrderNew;
import com.oleksii.polishchuk.ciklum.hybris.test.task.service.OrderService;
import java.util.HashMap;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {
  @Autowired OrderService orderService;

  public OrderController(OrderService orderService) {
    this.orderService = orderService;
  }

  @PostMapping("/create")
  public ResponseEntity<HashMap> createOrderWithListOfProducts(
      @RequestBody @Valid OrderNew orderNew) {

    Order order = orderService.createOrder(orderNew);
    HashMap result = new HashMap();
    result.put("order", order);

    return new ResponseEntity<>(result, HttpStatus.OK);
  }
}
