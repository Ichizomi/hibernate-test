package hibernateTest;

import org.junit.Ignore;
import org.junit.Test;

public class PlayerDAOTest {

	@Test
	public void testGetPlayerOfId1() {
		System.out.println(PlayerDAO.getInstance().getByIndex(1).toString());
		
	}
	
	@Test
	public void testCreatePlayer() {
		Player p = new Player("test player", 13);
		PlayerDAO.getInstance().create(p);
		System.out.println("Player: " + p.getId().toString());
		System.out.println(PlayerDAO.getInstance().getByIndex(p.getId()).toString());
	}

	@Test
	public void testDeletePlayer() {
		Player p = PlayerDAO.getInstance().getByIndex(3);
		PlayerDAO.getInstance().remove(p);
	}
	
}
