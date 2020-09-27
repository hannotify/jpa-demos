package com.github.hannotify.jpademos.demos.jpql.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
    @Id
    @GeneratedValue
    private long id;
    private String name;

    @OneToMany(mappedBy = "department")
    List<Employee> employees;

    @Override
    public String toString() {
        return name;
    }
}
