package com.oleksii.polishchuk.ciklum.hybris.test.task.repository;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "orders")
public class Order {
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private Integer id;
}
