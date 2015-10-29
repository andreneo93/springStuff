package soundsystem;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class CDPlayer implements MediaPlayer {
	private CompactDisc cd;

	@Autowired
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}

	@Autowired
	public void insertCD(CompactDisc cd) {
		this.cd = cd;
	}

	public void play() {
		cd.play();
	}
}