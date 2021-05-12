package hibernateTest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBConnection {
	private static DBConnection instance;
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;

	private DBConnection() {
		this.entityManagerFactory = Persistence.createEntityManagerFactory("postgres-PU");
		this.entityManager = entityManagerFactory.createEntityManager();
	}

	public static DBConnection getInstance() {
		if (instance == null) {
			instance = new DBConnection();
		}
		return instance;
	}

	public EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	public void Close() {
		entityManager.close();
		entityManagerFactory.close();
	}

}
