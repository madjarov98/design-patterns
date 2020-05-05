package command;

public class Exercises {
	private boolean isUp;
	public String standUp() {
		isUp=true;
		return"Stand Up!";
		
	}
	public String lieDown() {
		isUp=false;
		return "Lie Down!";
	}

}
