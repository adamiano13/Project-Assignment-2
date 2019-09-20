package damiano_p3;

import java.util.Scanner;

public class polling {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		String[] topics = {"Fishing","Hunting","Nascar ","Boating","Mudding"};	
		String opt = "y";
		int[][] responses = new int[5][10];
		int[] sum = new int[5];
		int[] num = new int[5];
		int j = 0,vote,min=0,max=0,locationMin=0,locationMax=0;
		//Welcome	
		System.out.println("Welcome to redneck survey!\n");
		//Menu
		while (opt.compareTo("q") != 0) {
		System.out.println("Please enter :");
		System.out.println("y for another person");
		System.out.println("r for results");
		System.out.println("q to quit");
		opt = scnr.next();
		
		switch(opt)
		{ case "y":
			System.out.println("Please vote on each activity rating with ");
			System.out.println("1-10 with 1 being least favorite and 10 being greatest.");
			
			for(int i=0; i<5; i++) {
				System.out.println(topics[i]+":");			
				vote = scnr.nextInt();
				responses[i][vote-1] += 1; 	
				num[i]=num[i]+1;
				
			}//end for loop
			
			break;
		  
		
		  case "r":
			  System.out.print("Results");
			  for(int i = 0; i<10; i++) {
				  System.out.print("   "+(i+1));
			  }
			  
			  System.out.println("  Average ");
			  for(int i = 0; i<16; i++) {
				  System.out.print("___");
			  }
			  for(int i = 0; i<5; i++) {
				  for(j = 0; j<10; j++) {
					  sum[i]	= sum[i]+ (j+1)*(responses[i][j]);	 
				  }
				  
			  }
			  System.out.println();
			  for(int i = 0; i<5; i++) {
				  
				  System.out.print(topics[i]);
				  for(j =0;j<10;j++) {
					 System.out.print(" | "+responses[i][j]); 
					  
				  }
				  System.out.printf("    %.2f",(float)(sum[i])/num[i]);
				  System.out.println("");
				  
			  }
			  max = sum[0];
			  min = sum[0];
			  for(int i=0 ;i<5;i++) {
				if (sum[i]>max) {
					max = sum[i];
					locationMax =i;}
			}
			  for (int i=0; i<5; i++) {
				  if (sum[i]<min) {
						min = sum[i];
						locationMin =i;}
			  }
			  System.out.println("");
			System.out.println("Category with most points: "+ topics[locationMax]+" "+sum[locationMax]);  
			System.out.println("Category with least points: "+ topics[locationMin]+" "+sum[locationMin]);  
			
			System.out.println("");
			break;
		  
		  		
				
		}//end switch
		}//end while
		System.out.println("Thanks for taking part in the survey!");
		
		
		
		
		
		
		
		
	}

}
