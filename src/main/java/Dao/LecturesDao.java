package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Dto.Lectures;

public class LecturesDao {
EntityManagerFactory emf=Persistence.createEntityManagerFactory("abc");
EntityManager em=emf.createEntityManager();
EntityTransaction et=em.getTransaction();


public Lectures insert(Lectures l)
{
	et.begin();
	em.persist(l);
	et.commit();
	return l;
}

public Lectures update(Lectures l)
{
	et.begin();
	em.merge(l);
	et.commit();
	return l;
}

public Lectures fetch(String email)
{
	return em.find(Lectures.class, email);
}

public List<Lectures> fetchall()
{
	Query q= em.createQuery("select n from Lectures n");
	List<Lectures> l= q.getResultList();
	return l;
}

public void delete(Lectures l)
{
	et.begin();
	em.remove(l);
	et.commit();
}
}
