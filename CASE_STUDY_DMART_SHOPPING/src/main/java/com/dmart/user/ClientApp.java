package com.dmart.user;

import java.util.List;
import java.util.Scanner;

import com.dmart.entity.Product;
import com.dmart.service.ImplProductService;
import com.dmart.service.iProduct;

public class ClientApp {

	public static void main(String[] args) {
		
		iProduct service=new ImplProductService();
		 Scanner sc= new Scanner(System.in);	 
		 String ans;
		 int no;
		do {
			System.out.println("***** DMART  Services ****");
			System.out.println("1. Add product -> Enter Product Info ");	
			System.out.println("2. View Product List > -customer  ");			
			System.out.println("Pls enter your choice: ");
			no=sc.nextInt();			
					switch(no)
					{
					case 1: System.out.println("case 1");
					
			//		iProduct service=new ImplProductService(); //everytime new obj gets created, so use static or declare outside..!
					
					System.out.println("Enter id, name, cost:");
					int pid=sc.nextInt();
					String pname=sc.next();
					double pcost=sc.nextDouble();
					
					Product p=new Product(pid,pname,pcost);
					String msg=service.addProduct(p);
						System.out.println(msg);	
							
					
				//	System.out.println(p);
				//	service.addProduct(p);  bcoz now did return to interace and service methods.
					
					
					
					
						break;
					case 2: System.out.println("case 2");
					
					List<Product> myList =service.getAllProducts(); 
					System.out.println(myList);
					
					break;							
					}	
					System.out.println("wish to continue? type y/n  ");
					ans = sc.next();
					}while(ans.equals("Y")||ans.equals("y"));							
					System.out.println("Thanks and visit again.");							
		}
		
		
		
		
	}
	

