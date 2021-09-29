package com.oleksii.polishchuk.ciklum.hybris.test.task.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

  @PostMapping("/create")
  public ResponseEntity<String> createOrderWithListOfProducts(
      @RequestParam(required = true) String title) {

    System.out.println("createOrderWithListOfProducts");

    return new ResponseEntity<>("createOrderWithListOfProducts", HttpStatus.OK);
  }
}
