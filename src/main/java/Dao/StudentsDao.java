package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Dto.Lectures;
import Dto.Students;

public class StudentsDao {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("abc");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();


	public Students insert(Students l)
	{
		et.begin();
		em.persist(l);
		et.commit();
		return l;
	}

	public Students update(Students l)
	{
		et.begin();
		em.merge(l);
		et.commit();
		return l;
	}

	public Students fetch(String email)
	{
		return em.find(Students.class, email);
	}

	public List<Students> fetchall()
	{
		Query q= em.createQuery("select n from Students n");
		List<Students> l= q.getResultList();
		return l;
	}
	
	public String delete(Students s) {
		et.begin();
		em.remove(s);
		et.commit();
		return "sucess";
	}
}
