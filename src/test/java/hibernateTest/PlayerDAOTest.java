package hibernateTest;

import org.junit.Ignore;
import org.junit.Test;

public class PlayerDAOTest {

	@Ignore
	public void testGetPlayerOfId1() {
		System.out.println(PlayerDAO.getInstance().getByIndex(1).toString());
		
	}
	
	@Test
	public void testCreatePlayer() {
		Player p = new Player("test player", 13);
		PlayerDAO.getInstance().create(p);
		System.out.println("Player: ");
		System.out.println(PlayerDAO.getInstance().getByIndex(p.getId()).toString());
	}

}
