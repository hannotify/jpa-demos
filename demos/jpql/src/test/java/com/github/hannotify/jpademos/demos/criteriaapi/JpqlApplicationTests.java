package com.github.hannotify.jpademos.demos.criteriaapi;

import com.github.hannotify.jpademos.demos.criteriaapi.entities.Programmer;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JpqlApplicationTests {
	@PersistenceContext
	private EntityManager em;

	@Test
	@DisplayName("Select all programmers")
	public void selectAllProgrammers() {
		TypedQuery<Programmer> query = em.createQuery(
				"SELECT p FROM Programmer p",
				Programmer.class);

		query.getResultList().forEach(System.out::println);
	}

}
