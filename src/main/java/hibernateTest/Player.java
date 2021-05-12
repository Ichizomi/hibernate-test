package hibernateTest;

import javax.persistence.*;

@Entity
@Table(name = "player")
public class Player {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "nickname")
	private String nickname;

	@Column(name = "level")
	private Integer level;
	
	public Player(String nickname, Integer level) {
		this.nickname = nickname;
		this.level = level;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", nickname=" + nickname + ", level=" + level + "]";
	}

	
}
