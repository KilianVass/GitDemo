package Kilian.Appium;

public class JavaIntroduction3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String is an object
		
		String k = "Kilian";
		String nombre = new String("Kilian Lopez Bernal");
		
		//Separar por espacio y guardamos en array
		
		String[] splittednombre = nombre.split(" ");
		
		for (int i=0; i<splittednombre.length;i++) {
			System.out.println(splittednombre[i]);
		}

	}

}
