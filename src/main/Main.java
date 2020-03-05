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
		
		Odsek odsek = new Odsek(1l, "SI");
		Smer smer = new Smer(1l, "Programiranje");
		Profesor profesor = new Profesor("M", "z", Zvanje.PROFESOR, new Date(), odsek);
		Predmet predmet = new Predmet(1l, "Prog1", 6);
		Student student = new Student("1", "Z", "A", new Date(), smer);
		
		Ispit ispit = new Ispit(new Date(), profesor, predmet, student, 10);
		
		EntityManager em = Repository.getInstance().createEntityManager();
		em.getTransaction().begin();
		em.merge(ispit);
		em.getTransaction().commit();

	}

}
