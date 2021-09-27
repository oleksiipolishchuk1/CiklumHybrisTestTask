package com.oleksii.polishchuk.ciklum.hybris.test.task.repository;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "products")
public class Product {
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private Integer id;

  @Column(name = "name")
  String name;

  @Column(name = "price")
  Integer price;

  @Column(name = "status", columnDefinition = "ENUM('out_of_stock', 'in_stock', 'running_low')")
  String status;
}
