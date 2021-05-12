package hibernateTest;

import javax.persistence.EntityManager;

public class PlayerDAO {

	private static PlayerDAO instance;
	private static EntityManager em;

	private PlayerDAO() {
	}

	public static PlayerDAO getInstance() {
		if (instance == null) {
			instance = new PlayerDAO();
			em = DBConnection.getInstance().getEntityManager();
		}
		return instance;
	}

	public Player getByIndex(Integer id) {
		return DBConnection.getInstance().getEntityManager().find(Player.class, id);
	}

	public void create(Player player) {
		em.getTransaction().begin();
		em.persist(player);
		em.getTransaction().commit();
	}
	
	public void remove(Player player) {
		em.getTransaction().begin();
		em.remove(player);
		em.getTransaction().commit();
	}

}
