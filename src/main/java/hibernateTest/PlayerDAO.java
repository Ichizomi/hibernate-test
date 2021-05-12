package hibernateTest;

public class PlayerDAO {

	private static PlayerDAO instance;

	private PlayerDAO() {
	}

	public static PlayerDAO getInstance() {
		if (instance == null) {
			instance = new PlayerDAO();
		}
		return instance;
	}

	public Player getByIndex(int id) {
		return DBConnection.getInstance().getEntityManager().find(Player.class, id);
	}

	public void create(Player player) {
		DBConnection.getInstance().getEntityManager().getTransaction().begin();
		DBConnection.getInstance().getEntityManager().persist(player);
		DBConnection.getInstance().getEntityManager().getTransaction().commit();
	}
	
	public void remove(Player player) {
		
	}

}
