package com.oleksii.polishchuk.ciklum.hybris.test.task.service;

import com.oleksii.polishchuk.ciklum.hybris.test.task.repository.Product;
import com.oleksii.polishchuk.ciklum.hybris.test.task.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {
  private final ProductRepository productRepositoryl;

  public Product getProductById(int productId) {
    return productRepositoryl.findById(productId).orElseThrow(() -> new IllegalArgumentException());
  }

  public Product create(Product product) {
    Product _product = this.productRepositoryl.save(product);
    return _product;
  }
}
