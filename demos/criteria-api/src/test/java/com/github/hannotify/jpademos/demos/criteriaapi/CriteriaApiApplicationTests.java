package com.github.hannotify.jpademos.demos.criteriaapi;

import com.github.hannotify.jpademos.demos.criteriaapi.entities.Employee;
import com.github.hannotify.jpademos.demos.criteriaapi.entities.Programmer;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CriteriaApiApplicationTests {
	@PersistenceContext
	private EntityManager em;
	private CriteriaBuilder cb;

	@BeforeEach
	public void setUp() {
		cb = em.getCriteriaBuilder();
	}

	@Test
	@DisplayName("Select all employees")
	public void selectAllEmployees() {
		CriteriaQuery<Employee> query =	cb.createQuery(Employee.class);
		query.select(query.from(Employee.class));

		em.createQuery(query).getResultList().forEach(System.out::println);
	}

	@Test
	@DisplayName("Select all employees who earn less than 2200")
	public void selectAllEmployeesWhoEarnLessThan2200() {
		CriteriaQuery<Employee> query =	cb.createQuery(Employee.class);
		final Root<Employee> employee = query.from(Employee.class);
		query.select(employee)
			.where(cb.lt(employee.get("salary"), 2200));

		em.createQuery(query).getResultList().forEach(System.out::println);
	}

}
