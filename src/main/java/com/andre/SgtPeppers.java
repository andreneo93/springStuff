package soundsystem;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {
	private String title = "Sgt. Pepper's lonely heart club band";
	private String name = "The beatles";


	public void play() {
		System.out.println("Playing " + title + " by " + name);
	}
}