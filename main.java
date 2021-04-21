package exercise3_2;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	
		Laptop objLap = new Laptop();
		System.out.println("");
		System.out.println(objLap.toString());
		System.out.printf("Total Price purchased : RM",objLap.getTotalPrice());
		System.out.println();
		
		Acer objAcer = new Acer();
		System.out.println("");
		System.out.println(objAcer.toString());
		System.out.printf("Total discounted price : RM",objAcer.getDiscPrice());
		System.out.println();
	}

}
