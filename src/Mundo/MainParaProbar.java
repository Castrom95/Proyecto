package Mundo;

import java.util.Timer;

public class MainParaProbar {
	public static void main(String[] args) {
		Timer timer = new Timer();
		Chronometer chron = new Chronometer();
		timer.schedule(chron, 1000, 1000);
		
		
	}

}
