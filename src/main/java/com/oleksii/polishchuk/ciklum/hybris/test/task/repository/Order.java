package com.oleksii.polishchuk.ciklum.hybris.test.task.repository;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Order {
    @Id
    private Integer id;
}
