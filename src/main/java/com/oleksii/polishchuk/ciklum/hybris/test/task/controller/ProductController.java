package com.oleksii.polishchuk.ciklum.hybris.test.task.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

  @PutMapping("/create")
  public ResponseEntity<String> createProduct(@RequestParam(required = true) String title) {

    System.out.println("createProduct");

    return new ResponseEntity<>("createProduct", HttpStatus.OK);
  }


  @GetMapping("/list")
  public ResponseEntity<String> getAllproducts(@RequestParam(required = false) String title) {

    System.out.println("getAllproducts");

    return new ResponseEntity<>("getAllproducts", HttpStatus.OK);
  }
}
