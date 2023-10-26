package Kilian.Appium;

import java.util.ArrayList;

public class JavaIntroduction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr2 = {01,2,3,4,5,6,7,8,9,10,11,12,13};
		
		// print multiples de 2
		
		for (int i=0; i<arr2.length;i++) {
			
			if (arr2[i] % 2 == 0 ) {
				System.out.println("par "+arr2[i]);
			}else {
				System.out.println("impar "+arr2[i]);
			}
			
		}
		ArrayList<String> a = new ArrayList<String>();
		// create object of the class - object.method
		a.add("Kilian");
		a.add("Lopez");
		a.add("Bernal");
		a.remove(2);
		//Mostrar el valor
		System.out.println(a.get(1));
		
		

	}

}
