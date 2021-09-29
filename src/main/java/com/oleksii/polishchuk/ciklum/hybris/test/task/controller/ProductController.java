package com.oleksii.polishchuk.ciklum.hybris.test.task.controller;

import com.oleksii.polishchuk.ciklum.hybris.test.task.repository.Product;
import com.oleksii.polishchuk.ciklum.hybris.test.task.service.ProductService;
import java.util.HashMap;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

  @Autowired ProductService productService;

  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  @PostMapping("/create")
  public ResponseEntity<HashMap> createProduct(@RequestBody @Valid Product product) {
    Product _product = productService.create(product);

    HashMap result = new HashMap();
    result.put("product", _product);
    System.out.println("created Product");

    return new ResponseEntity<>(result, HttpStatus.OK);
  }

  @GetMapping("/list")
  public ResponseEntity<String> getAllproducts(@RequestParam(required = false) String title) {

    System.out.println("getAllproducts");

    return new ResponseEntity<>("getAllproducts", HttpStatus.OK);
  }
}
