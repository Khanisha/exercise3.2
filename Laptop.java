package exercise3_2;
import java.util.Scanner;

public class Laptop {

	Scanner s = new Scanner(System.in);
	private String brand, model;
	private int units;
	private double price;
	
	public Laptop() {
		
		System.out.println("Enter the Brand : ");
		this.brand = s.nextLine();
		s.nextLine();
		System.out.println("Enter the Model : ");
		this.model = s.nextLine();
		s.nextLine();
		System.out.println("Enter the units you bought : ");
		this.units = s.nextInt();
		s.nextLine();
		System.out.println("Enter the Price per laptop : RM");
		this.price = s.nextInt();
		s.nextLine();
	}
	
	public int getUnits() {
		return this.units;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public double getTotalPrice() {
		return this.units * this.price;
	}
	
	public String toString() {
		return "Price per unit : RM" + this.price + "\nUnits purchased : " + this.units;
	}
}
