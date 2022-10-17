package com.user.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;
import java.util.*;
public class MainClass {
    
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		Scanner scan1=new Scanner(System.in);
		List<Employee> emp=new ArrayList<Employee>();
		int a;
		do {
		System.out.println("enter 1 for insert the data");
		System.out.println("enter 2 for display the data");
		System.out.println("enter 3 for search the data");
		System.out.println("enter 4 for delete the data");
		System.out.println("enter 5 for update  the data");
		
		System.out.println("please enter you choice");
		 a=scan.nextInt();
		 switch(a)
		 {
			 case 1:
				 System.out.print("enter the employee number");
				 int empo=scan.nextInt();
				 System.out.print("enter the employee name");
				 String name=scan1.next();
				 System.out.print("enter the employee salary");
				 int salary=scan.nextInt();
				 
				 emp.add(new Employee(empo,name,salary));
				 
				 break;
			 case 2:
				 System.out.println("-----------");
				 Iterator<Employee> i=emp.iterator();
						 while(i.hasNext())
						 {
						Employee e= i.next();
						System.out.println(e);
						 }
						 System.out.println("---------");
				      break;
			 case 3:boolean found=false;
			 System.out.println("enter empno to search");
		            empo=scan.nextInt();
				 System.out.println("-----------");
				        i=emp.iterator();
						 while(i.hasNext())
						 {
							 Employee e=i.next();
                          if(e.getEmpo()==empo)
                          {
						System.out.println(e);
                          found=true;
						 }
						 }
					if(!found) {
						System.out.println("record not found");
					}
					System.out.println("-----------");
				      break;
			 case 4: found=false;
			 System.out.println("enter empno to delete");
		            empo=scan.nextInt();
				 System.out.println("-----------");
				        i=emp.iterator();
						 while(i.hasNext())
						 {
							 Employee e=i.next();
                          if(e.getEmpo()==empo)
                          {
                        	  i.remove();
                          found=true;
						 }
						 }
					if(!found) {
						System.out.println("record not found");
					}
					else
					{
						System.out.println("record is delete successfully");
					}
					System.out.println("-----------");
				      break;
			 case 5: found=false;
			 System.out.println("enter empno to upadte");
		            empo=scan.nextInt();
				 System.out.println("-----------");
				       ListIterator<Employee> list=emp.listIterator();
						 while(list.hasNext())
						 {
							 Employee e=list.next();
                          if(e.getEmpo()==empo)
                          {
                        	  System.out.println("enter the new name");
                        	  name=scan1.next();
                        	  System.out.println("enter the new salary");
                        	  salary=scan.nextInt();
                        	  list.set(new Employee(empo,name,salary));
                          found=true;
						 }
						 }
					if(!found) {
						System.out.println("record not found");
					}
					else
					{
						System.out.println("record update successfully");
					}
					System.out.println("-----------");
				      break;
		 }
		 
		}while(a!=0);
		
		

		
		
	}  

	

}



