package main;

import java.util.Date;

import javax.persistence.EntityManager;

import domain.Ispit;
import domain.Odsek;
import domain.Predmet;
import domain.Profesor;
import domain.Smer;
import domain.Student;
import domain.Zvanje;
import repository.Repository;

public class Main {

	public static void main(String[] args) {
		EntityManager em = Repository.getInstance().createEntityManager();
		
		Odsek odsek = new Odsek(1l, "SI");
		em.getTransaction().begin();
		em.persist(odsek);
		em.getTransaction().commit();
		
		Smer smer = new Smer(1l, "Programiranje",odsek);
		em.getTransaction().begin();
		em.persist(smer);
		em.getTransaction().commit();
		
		Profesor profesor = new Profesor("M", "z", Zvanje.PROFESOR, new Date(), odsek);
		em.getTransaction().begin();
		em.persist(profesor);
		em.getTransaction().commit();
		
		Predmet predmet = new Predmet(1l, "Prog1", 6);
		predmet.addSmer(smer);
		em.getTransaction().begin();
		em.persist(predmet);
		em.getTransaction().commit();
		
		Student student = new Student("1", "Z", "A", new Date(), smer);
		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();
		
		Ispit ispit = new Ispit(new Date(), profesor, predmet, student, 10);
		
		em.getTransaction().begin();
		em.persist(ispit);
		em.getTransaction().commit();
		
	}

}
