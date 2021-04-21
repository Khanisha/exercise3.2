package exercise3_2;

import java.util.Scanner;

public class Acer extends Laptop {
	
	
	private int discount;
	
	public Acer() {
		super();
		
		System.out.println("Enter the discount % :");
		discount = s.nextInt();
	}
	public double getDiscount() {
		return discount/100;
	}
   public double getDiscPrice() {
	   return super.getTotalPrice() - (super.getTotalPrice()* getDiscount());
   }
   public String toString() {
	   return super.toString() + "\n" + "Total Discount :" + getDiscount() + "%";  
	   }
}
