package Damiano_P1;

import java.util.Scanner;

public class Damiano_P1_2 {

	public static void main(String[] args) {
		//Decryption
		
				Scanner scnr = new Scanner(System.in);
				int[] data = new int[4];
				int i,a,b,c,d,in;
				System.out.println("Please enter encrypted 4 digits:");
				in =scnr.nextInt();
				data[0]= in/1000; 
				data[1]= (in %1000)/100; 
				data[2]= ((in % 1000) % 100) / 10; 
				data[3]= (((in % 1000) % 100) % 10); 
				
				
				a = (data[2]+3)%10;
				b = (data[3]+3)%10;
				c = (data[0]+3)%10;
				d = (data[1]+3)%10;
				
				data[0] = a;
				data[1] = b;
				data[2] = c;
				data[3] = d;
				for (i=0; i<4;i++) {
					
					System.out.print(data[i]);
						}
					

	}

}
