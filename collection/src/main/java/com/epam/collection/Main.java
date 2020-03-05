package com.epam.collection;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) 
    {
        DataList<Integer> list = new DataList<Integer>();
 
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        
        System.out.println(list);
       
        System.out.println("Enter a no");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        list.add(n);
        
        System.out.println("Size of list is: "+list.size());
        System.out.println("List after addition of element"+list);
        
        
        System.out.println(list);
         
        System.out.println("Removing element at 2nd index or 3rd position");
        list.remove(2);
        System.out.println("List after removal  of element:"+list);
         
        System.out.println("Element at 0 index: "+ list.get(0) );
        System.out.println("Element at 1 index: " + list.get(1) );
 
       System.out.println("Size of list is: "+list.size());
       System.out.println(list);
     
    
    }
}

