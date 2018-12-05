package QueueLab.Tute02;

import java.util.Scanner;

public class Main {

	static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) {
		
		PrinterLine printerLine = new PrinterLine(5);
		
		for(int i=0;i<5;i++) {
			System.out.print("Enter JobId : ");
			int job=sc.nextInt();
			
			printerLine.insert(job);
		}
		
		while(!printerLine.isEmpty()) {
			
			int job=printerLine.remove();
			
			if(job%2==0) 
				System.out.println("JobID "+job+" (PC1)");
			
			else
				System.out.println("JobID "+job+" (PC2)");
			
			
		}

	}

}
