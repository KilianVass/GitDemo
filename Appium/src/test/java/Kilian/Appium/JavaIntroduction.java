package Kilian.Appium;

public class JavaIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Hola git cambios y más cambios, yo hago un cambio");
		int number = 5;
		String frase = "KilianJava";
		char letra = 'k';
		double decimal = 5.99;
		boolean boleano = true;
		
		System.out.println(number + "is the value stored in the number value");
		System.out.println(frase);
		
		//Arrays - 
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;
		arr[6] = 7;
		arr[7] = 8;
		arr[8] = 9;
		
		int[] arr2 = {1,2,3,4,5};
		System.out.println(arr2[2]);
		
		// for loop
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr2[i]);
		}
		
		String[] name = {"Kilian", "Lopez", "Bernal"};
		
		for (int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}
		
		for (String a : name) {
			System.out.println(a);
		}

	}

}
