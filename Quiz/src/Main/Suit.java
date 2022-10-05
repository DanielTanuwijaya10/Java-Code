package Main;

import java.util.Random;

public class Suit extends Clothes {
	
	Random rand = new Random();
//	private int workingTime;
	private int completionTime;
	
	 public Suit(String size, String material, String color, String type, double width, int completionTime) {
		  super(size, material, color, type, width, completionTime);
		  this.completionTime = completionTime;
		 }

		 public int getCompletionTime() {
		  return completionTime;
		 }

		 public void setCompletionTime(int completionTime) {
		  this.completionTime = completionTime;
		 }

		 @Override
		 public void calculateCompletionTime() {
		  baseWorkingTime();
		  
		  completionTime = (int) ((getCompletionTime() + rand.nextInt(21)) * width * 175 / 100);
		  
		  setCompletionTime(completionTime);
		  
		 }

}
