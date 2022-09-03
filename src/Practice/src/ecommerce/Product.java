package ecommerce;

import java.util.Scanner;

public class Product{
	
	public int id;
	public String name;
	public int price;
		
	public void readData() {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the product ID:");
		id = Integer.parseInt(obj.nextLine());
		System.out.println("Enter the product name");
		name = obj.nextLine();
		System.out.println("Enter the product price");
		price = Integer.parseInt(obj.nextLine());
		obj.close();
	}
	public void printData() {
		System.out.println("ID :" + id);
		System.out.println("Name :" + name);
		System.out.println("Price :" + price);
		
	}
}
