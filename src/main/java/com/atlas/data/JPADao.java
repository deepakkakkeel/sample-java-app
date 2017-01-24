package com.atlas.data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.atlas.api.Country;

public class JPADao implements DAO{
	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("atlas");
	@Override
	public void insert(Country country) {
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(country);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public Country read(String name) {
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Country country = em.find(Country.class, name);
		em.close();
		return country;
	}

}
