package repository;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Repository {
	static EntityManagerFactory emg = Persistence.createEntityManagerFactory("ZadatakJPA");
	
	public static EntityManagerFactory getInstance() {
		return emg;
	}
}
