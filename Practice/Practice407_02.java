
public class Practice407_02 {

	public static void main(String[] args) {
		MusicCD inst1;
		GameCD inst2;
		Player machine;
		
		inst1 = new MusicCD();
		inst2 = new GameCD();
		machine = new Player();
		
		machine.play(inst1);
		machine.play(inst2);

	}

}
