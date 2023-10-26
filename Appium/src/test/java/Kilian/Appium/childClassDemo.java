package Kilian.Appium;

public class childClassDemo extends parentClassDemo{
	
	public void engine() {
		System.out.println("new engine");
	}
	
	public void colour() {
		System.out.println(colour);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childClassDemo demo = new childClassDemo();
		
		demo.colour();
		demo.brakes();
	}

}
