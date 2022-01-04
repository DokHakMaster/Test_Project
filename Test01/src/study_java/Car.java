package study_java;

public class Car {
	
	int speed;
	int distance;
	String color;
	
	public Car() {
		
	}
	public void speedUp(){
		
		speed = speed + 5;
		
	}
	public void breakDown() {
		
		speed = speed - 100;
		
	}
	public int getCurrentSpeed() {
		
		return speed;
		
	}


}


