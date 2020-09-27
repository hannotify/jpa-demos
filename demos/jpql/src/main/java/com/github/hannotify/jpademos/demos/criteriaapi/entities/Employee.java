package com.github.hannotify.jpademos.demos.criteriaapi.entities;

import javax.persistence.*;
import lombok.ToString;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@ToString
public class Employee {
    @Id
    @GeneratedValue
    long id;
    String name;
    int salary;

    @ManyToOne
    Department department;
}
