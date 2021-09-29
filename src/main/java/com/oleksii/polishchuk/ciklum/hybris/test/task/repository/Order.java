package com.oleksii.polishchuk.ciklum.hybris.test.task.repository;

import java.util.Date;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Getter
@Setter
@Table(name = "orders")
public class Order {
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private Integer id;

  @Column(name = "user_id")
  private Integer userId;

  private String status;

  @LastModifiedDate
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "created_at", columnDefinition = "varchar(255) not null")
  private Date created_at;
}
