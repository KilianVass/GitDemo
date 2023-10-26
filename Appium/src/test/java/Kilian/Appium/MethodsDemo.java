package Kilian.Appium;

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//why method - para meter codigo dentro y funciones y llamando solo al metodo
		//se ejecuta todo el codigo de dentro
		
		MethodsDemo d = new MethodsDemo();
		d.getData();
		MethodsDemo2 d1 = new MethodsDemo2();
		d1.GetUserData();
		

	}
	// los metodos se crean fuera del main, para usarlos on demand
	
	public String getData() {
		System.out.println("hello world");
		return "Kilian Lopez";
	}
	
	

}
