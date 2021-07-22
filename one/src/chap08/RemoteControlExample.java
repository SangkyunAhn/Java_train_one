package chap08;

public class RemoteControlExample {
	
	public static void main(String[] args) {
		RemoteControl rc = null;
		// RemoteControl.changeBattery();
		
		
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		// rc.turnOff();
		rc.setVolume(0);
		
		System.out.println();
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(false);
		// rc.turnOff();
		
	}

}
