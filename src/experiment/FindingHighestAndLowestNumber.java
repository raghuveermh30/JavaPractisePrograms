package experiment;

import java.util.Scanner;
import java.util.TreeSet;

public class FindingHighestAndLowestNumber {


	 public static void main(String[] args) 
	    {
	       
		 int a[] =  {10,20,24,5,6,8};
		 int temp;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	System.out.println("*************************");	
		System.out.println(a[a.length-2]);
		
		//System.out.println([a.length-1]);
		 
		 
	    }
}
