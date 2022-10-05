package Main;

import java.util.Random;

public class Dress extends Clothes {
	Random rand = new Random();
	
	 public Dress(String size, String material, String color, String type, double width, int completionTime) {
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
		  
		  completionTime = (int) ((getCompletionTime() + rand.nextInt(18)) * width * 225 / 100);
		  
		  setCompletionTime(completionTime);
		 }
	
}


	
	
	


