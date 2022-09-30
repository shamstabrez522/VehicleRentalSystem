package test;

import java.io.IOException;

import java.util.Scanner;

public class VehicleDemo {

	public static void main(String[] args) throws IOException {
		
		
		
		Vehicles v=new  Vehicles();
		
		Scanner sc=new Scanner(System.in);
		System.out.println();
		int vt;
		do{
		System.out.println("  1.Bike       |     2.Car       |    3.Bus     |  4.EXIT");
		System.out.println();
		System.out.println("Enter the type of vehicle : ");
		
		vt=sc.nextInt();
		switch (vt) {
		case 1: 
			v.bike();
			break;
			
		case 2:
			v.car();
			break;
			
		case 3:
			v.bus();
			break;
		case 4:
			break;
			
		default :
			System.out.println("Enter valid number !. \n");
		
		}

		}
		
		while(vt!=4);
		
		
	}
}

