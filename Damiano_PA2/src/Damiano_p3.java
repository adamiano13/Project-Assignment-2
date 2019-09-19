import java.util.Scanner;

public class Damiano_p3 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String[] topics = {"Fishing","Hunting","Nascar ","Boating","Mudding"};	
		String opt = "y";
		int[][] responses = new int[5][10];
		int j = 0,vote;
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
				
			}//end for loop
			
			break;
		  
		
		  case "r":
			  System.out.print("Results");
			  for(int i = 0; i<10; i++) {
				  System.out.print("   "+(i+1));
			  }
			  System.out.println();
			  for(int i = 0; i<16; i++) {
				  System.out.print("___");
			  }
			  System.out.println();
			  for(int i = 0; i<5; i++) {
				  
				  System.out.print(topics[i]);
				  for(j =0;j<10;j++) {
					 System.out.print(" | "+responses[i][j]); 
					  
				  }
				  System.out.println("");
			  }
			break;
		  
		  		
				
		}//end switch
		}//end while
		System.out.println("Thanks for taking part in the survey!");
	}

}
