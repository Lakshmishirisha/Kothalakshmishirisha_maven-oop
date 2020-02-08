//package newyeargift;

import java.io.*;
import java.util.Scanner;
import gift.*;
import gift.sweets.rasgulla;
import gift.candies.dairymilk;

class newyeargift{
	public static void main(String args[]){
		//function calls
		System.out.println("Enter the number of gifts needed");
		int a;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		rasgulla r=new rasgulla();
		rasgulla r1=new rasgulla();
		dairymilk d=new dairymilk();
		if(a>0&&a<30){
			if(d.avail>=a)
				System.out.println("You have recieved a gift of "+d.name);	
		}
		else if(a>30&&a<50){
			if(r1.avail>=a)
				System.out.println("You have recieved a gift of "+r1.name);
		}
	}
}