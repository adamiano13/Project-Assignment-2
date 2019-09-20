package damiano_p1;

import java.util.Scanner;

public class encryption {

	public static void main(String[] args) {
		//encryption
		
				Scanner scnr = new Scanner(System.in);
				int[] data = new int[4];
				int i,a,b,c,d,in;
				System.out.println("Please enter 4 digits to be encrypted:");
				
				in =scnr.nextInt();
					
				data[0]= in/1000; 
				data[1]= (in %1000)/100; 
				data[2]= ((in % 1000) % 100) / 10; 
				data[3]= (((in % 1000) % 100) % 10); 
				
				data[0] = (data[0]+7)%10;
				data[1] = (data[1]+7)%10;
				data[2] = (data[2]+7)%10;
				data[3] = (data[3]+7)%10;
				
				a = data[0] ;
				b = data[1] ;
				c = data[2] ;
				d = data[3] ;
				
				data[0] = c;
				data[1] = d;
				data[2] = a;
				data[3] = b;
				for (i=0; i<4;i++) {
					
					System.out.print(data[i]);
						}

	}

}
