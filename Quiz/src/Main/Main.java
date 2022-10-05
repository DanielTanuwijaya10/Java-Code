package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	ArrayList<Clothes> clothesList = new ArrayList<>();
	
	private int mainChoose, completionTime, deleteid;
	 private String size, material, color, type;
	 private double width;

	 public Main() {
	  main();
	 }
	 
	 private void main() {
	  
	  do {
	   
		  mainMenu();
		  mainChoose = sc.nextInt();
		  sc.nextLine();
	  
		  if(mainChoose == 1) {
			  view();
		  }else if(mainChoose == 2) {
			  add();
		  }else if(mainChoose == 3) {
			  remove();
		  }
	   
	  }while(mainChoose != 4);
	  
	 }
	 
	 private void remove() {
	  // TODO Auto-generated method stub
		 view();
		  
		  do {
		   System.out.print("Input cloth no. [1 - " + clothesList.size() + "]: ");
		   deleteid = sc.nextInt();
		   sc.nextLine();
		  }while(deleteid > clothesList.size());
		  
		  clothesList.remove(deleteid-1);
		  
	 }

	 private void add() {
		  
		  do {
			  System.out.print("Input cloth size [S | M | L]: ");
			  size = sc.nextLine();
		   
		  }while(!size.equals("S") && !size.equals("M") && !size.equals("L"));
		  
		  do {
			  System.out.print("Input cloth material [Cotton | Silk]: ");
			  material = sc.nextLine();
		  }while(!material.equals("Cotton") && !material.equals("Silk"));
		  
		  do {
			  System.out.print("Input color [5..13]: ");
			  color = sc.nextLine();
		  }while(color.length() < 5 || color.length()>13);
		  
		  do {
			  System.out.print("Input lapel width [2.25 - 4.50]: ");
			  width = sc.nextDouble();  
		  }while(width < 2.25 || width > 4.50);
		  
		  do {
			  System.out.print("Input cloth type[Dress | Suit]: ");
			  type = sc.nextLine();
		  }while(!type.equals("Dress") && !type.equals("Suit"));
		  
		  
		  
		  if(type.equals("Dress")) {
			  Dress dress = new Dress(size, material, color, type, width, completionTime);
			  dress.calculateCompletionTime();
			  completionTime = dress.getCompletionTime();
			  clothesList.add(dress);
		   
			  System.out.println("Your cloth will be ready in " +completionTime+ " day(s)");
			  System.out.println("Cloth successfully inserted");
			  System.out.println();
			  System.out.println("press enter to continue...");
			  sc.nextLine();
		  }else if(type.equals("Suit")) {
			  Suit suit = new Suit(size, material, color, type, width, completionTime);
			  suit.calculateCompletionTime();
			  completionTime = suit.getCompletionTime();
			  clothesList.add(suit);
		   
			  System.out.println("Your cloth will be ready in " +completionTime+ " day(s)");
			  System.out.println("Cloth successfully inserted");
			  System.out.println();
			  System.out.println("press enter to continue...");
			  sc.nextLine();
		  }
		  
	}

	 private void view() {
		if(clothesList.isEmpty()) {
			 System.out.println("There is no clothes...");
			 System.out.println("Press enter to continue");
			 sc.nextLine();
		 }else {
			 System.out.println("=================================================================");
			 System.out.println("|No.| Material     | Type  | Size  | Color   | Completion Time  | Lapel Width   |");
			 System.out.println("=================================================================");
			 
			 for(int i = 0 ; i< clothesList.size() ; i++) {
				    System.out.printf("|%d| %-12s | %s | %s | %-15s |%-10d day(s)| %-10f inch |\n",
				      i+1,
				      clothesList.get(i).getMaterial(),
				      clothesList.get(i).getType(),
				      clothesList.get(i).getSize(),
				      clothesList.get(i).getColor(),
				      clothesList.get(i).getCompletionTime(),
				      clothesList.get(i).getWidth());
				   }
				 System.out.println("===============================================================");
				 System.out.println("Press enter to continue..."); 
				 sc.nextLine();
			
			 }
		 }
		 
	 

	 private void mainMenu() {
		 System.out.println("================");
		 System.out.println("   QueensMan  ");
		 System.out.println("================ ");
		 System.out.println("1. View Clothes");
		 System.out.println("2. Add Clothes");
		 System.out.println("3. Remove Clothes");
		 System.out.println("4. Exit");
		 System.out.print(">> ");
	 }

	 public static void main(String[] args) {
	  new Main();
	 }

}
