package com.oleksii.polishchuk.ciklum.hybris.test.task.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import com.oleksii.polishchuk.ciklum.hybris.test.task.repository.Product;
import com.oleksii.polishchuk.ciklum.hybris.test.task.repository.ProductRepository;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

class ProductServiceTest extends BaseUnitTest {
  @InjectMocks private ProductService productService;
  @Mock private ProductRepository productRepository;

  @Nested
  class ProductExist {
    @BeforeEach
    void init() {
      Product newProduct = new Product();
      newProduct.setId(1);
      when(productRepository.findById(1)).thenReturn(Optional.of(newProduct));
    }

    @Test
    void getProductById_success() {
      Product product = productService.getProductById(1);
      assertEquals(1, product.getId());
    }
  }

  @Nested
  class NoProduct {
    @Test
    void getProductById_no_product_throw_exception() {
      assertThrows(IllegalArgumentException.class, () -> productService.getProductById(1));
    }
  }
}
