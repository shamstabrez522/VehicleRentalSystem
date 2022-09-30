package test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public  class Vehicles {
	
	void bike() throws IOException{
		
		bikeList();
		
		Scanner sc=new Scanner(System.in);
		
		 
		
		System.out.println("select the Bike Id to book : ");
		int bid=sc.nextInt();
		sc.nextLine();
	
		
		System.out.println("Enter your name : \t");
		String uname=sc.nextLine();
		
		System.out.println("Enter your license no : \t");
		String ulicense=sc.nextLine();
		
		System.out.println("Enter how many hours you want : \t");
		int time=sc.nextInt();
		
		
		
		
		System.out.println("Total Amount="+totalBikeAmount(bid, time, uname));
		System.out.println("THANK YOU "+uname+",HAVE A SAFE AND ENJOYFULL RIDE");

		
		String file="test.csv";
	 	FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("ID"+","+"UserName"+","+"LicenceNo "+","+"Hours "+",");

		bw.write("TotalAmount"+",");
	    bw.write("\n"+bid+","+uname+","+ulicense+","+time+","+totalBikeAmount(bid, time, uname));

		bw.close();
		
	}	
		
	
	
	public static int totalBikeAmount(int num,int time,String name) {
		LinkedHashMap<Integer,Integer> lhm=new LinkedHashMap<>();
		lhm.put(1,80);
		lhm.put(2,90);
		lhm.put(3,150);
		lhm.put(4,250);
		lhm.put(5,250);
		
		int amount=0;
		
		
		switch(num) {
		
		     case(1):
			    amount=time*lhm.get(num);
		       break;
		     case(2):
				    amount=time*lhm.get(num);
			       break;
		     case(3):
				    amount=time*lhm.get(num);
			       break;
		     case(4):
				    amount=time*lhm.get(num);
			       break;    
		     case(5):
				    amount=time*lhm.get(num);
			       break;      
	    }
				return amount;
		
	}
	public static void bikeList(){
		
	Bikes b1=new Bikes(1,"Activa",80);
	Bikes b2=new Bikes(2,"Splendor",90);
	Bikes b3=new Bikes(3,"Pulsar NS200",150);
	Bikes b4=new Bikes(4,"KTM RC 390",250);
	Bikes b5=new Bikes(5,"R15 BS4",250);
	
	ArrayList<Bikes> bList=new ArrayList<Bikes>();
	bList.add(b1);
	bList.add(b2);
	bList.add(b3);
	bList.add(b4);
	bList.add(b5);
	

	System.out.println("----------------------------------------------------");
	System.out.println(" Id   |      Bike       |   CostHr");
	System.out.println("----------------------------------------------------");
	
	for(int i=0;i<bList.size();i++) {
		Bikes b=bList.get(i);
		
		System.out.printf("%4d  |%15s   |%12d\n",b.getId(),b.getBike(),b.getPerHr());
		

	}
	System.out.println("----------------------------------------------------");
	
	

	
	}
	
	void car() throws IOException {
		carList();
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("select the Car Id to book : ");
		int cid=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter your name : ");
		String uname=sc.nextLine();
		
		System.out.println("Enter your license no : ");
		String ulicense=sc.nextLine();
		
		System.out.println("Enter how many hours you want : ");
		int time=sc.nextInt();
		
		System.out.println("Total Amount="+totalCarAmount(cid, time, uname));
		System.out.println("THANK YOU "+uname+",HAVE A SAFE AND ENJOYFULL RIDE");
		
		String file="test.csv";
	 	FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("ID"+","+"UserName"+","+"LicenceNo "+","+"Hours "+",");

		bw.write("TotalAmount"+",");
	    bw.write("\n"+cid+","+uname+","+ulicense+","+time+","+totalCarAmount(cid, time, uname));

		bw.close();
		
	}	
		
	
	
	public static int totalCarAmount(int num,int time,String name) {
		LinkedHashMap<Integer,Integer> lhm=new LinkedHashMap<>();
		lhm.put(1,300);
		lhm.put(2,400);
		lhm.put(3,750);
		lhm.put(4,850);
		lhm.put(5,950);
		
		int amount=0;
		
		
		switch(num) {
		
		     case(1):
			    amount=time*lhm.get(num);
		       break;
		     case(2):
				    amount=time*lhm.get(num);
			       break;
		     case(3):
				    amount=time*lhm.get(num);
			       break;
		     case(4):
				    amount=time*lhm.get(num);
			       break;    
		     case(5):
				    amount=time*lhm.get(num);
			       break;      
	    }
		
		return amount;
	}
	public static void carList(){
		
	Cars c1=new Cars(1,"swift",300);
	Cars c2=new Cars(2,"Baleno",400);
	Cars c3=new Cars(3,"Fortuner",750);
	Cars c4=new Cars(4,"Innova",850);
	Cars c5=new Cars(5,"Audi",950);
	
	ArrayList<Cars> cList=new ArrayList<Cars>();
	cList.add(c1);
	cList.add(c2);
	cList.add(c3);
	cList.add(c4);
	cList.add(c5);
	

	System.out.println("----------------------------------------------------");
	System.out.println(" Id   |       Vehicle        |   CostHr");
	System.out.println("----------------------------------------------------");
	
	for(int i=0;i<cList.size();i++) {
		Cars c=cList.get(i);
		
		System.out.printf("%4d  |%15s   |%12d\n",c.getId(),c.getCar(),c.getPerHr());
		

	}
	System.out.println("----------------------------------------------------");
	
	

	}
	
	void bus()  throws IOException{
         busList();
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("select the Bus Id to book : ");
		int bid=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter your name : ");
		String uname=sc.nextLine();
		
		System.out.println("Enter your license no : ");
		String ulicense=sc.nextLine();
		
		System.out.println("Enter how many hours you want : ");
		int time=sc.nextInt();
		
		System.out.println("Total Amount="+totalBusAmount(bid, time, uname));
		System.out.println("THANK YOU "+uname+",HAVE A SAFE AND ENJOYFULL RIDE");
		String file="test.csv";
	 	FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("ID"+","+"UserName"+","+"LicenceNo "+","+"Hours "+",");

		bw.write("TotalAmount"+",");
	    bw.write("\n"+bid+","+uname+","+ulicense+","+time+","+totalBusAmount(bid, time, uname));

		bw.close();
		
	}	
		
	
	
	public static int totalBusAmount(int num,int time,String name) {
		LinkedHashMap<Integer,Integer> lhm=new LinkedHashMap<>();
		lhm.put(1,2000);
		lhm.put(2,2500);
		lhm.put(3,2800);
		lhm.put(4,2700);
		lhm.put(5,4500);
		
		int amount=0;
		
		
		switch(num) {
		
		     case(1):
			    amount=time*lhm.get(num);
		       break;
		     case(2):
				    amount=time*lhm.get(num);
			       break;
		     case(3):
				    amount=time*lhm.get(num);
			       break;
		     case(4):
				    amount=time*lhm.get(num);
			       break;    
		     case(5):
				    amount=time*lhm.get(num);
			       break;      
	    }
		
		return amount;
	}
	public static void busList(){
		
	Buses b1=new Buses(1,"RedBus",2000);
	Buses b2=new Buses(2,"Kaveri",2500);
	Buses b3=new Buses(3,"Indra",2800);
	Buses b4=new Buses(4,"Orange",2700);
	Buses b5=new Buses(5,"VKL",4500);
	
	ArrayList<Buses> bList=new ArrayList<Buses>();
	bList.add(b1);
	bList.add(b2);
	bList.add(b3);
	bList.add(b4);
	bList.add(b5);
	

	System.out.println("----------------------------------------------------");
	System.out.println(" Id   |      Buses       |   CostHr");
	System.out.println("----------------------------------------------------");
	
	for(int i=0;i<bList.size();i++) {
		Buses b=bList.get(i);
		
		System.out.printf("%4d  |%15s   |%12d\n",b.getId(),b.getBus(),b.getPerHr());
		

	}
	System.out.println("----------------------------------------------------");
	
	

	}
	

}
