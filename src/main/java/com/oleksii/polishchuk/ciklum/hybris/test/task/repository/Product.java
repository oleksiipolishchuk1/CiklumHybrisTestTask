package com.oleksii.polishchuk.ciklum.hybris.test.task.repository;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Product {
    @Id
    private Integer id;

    @Column(name = "name")
    String name;

    @Column(name = "price")
    Integer price;

    @Column(name = "status")
    String status;
}
