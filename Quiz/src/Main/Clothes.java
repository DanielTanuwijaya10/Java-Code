package Main;                                                                                                  
                                                                                                               
public  abstract class Clothes {                                                                               
	                                                                                                           
	protected String size, material, color, type;                                                              
	protected double width;                                                                                    
	protected int completionTime;                                                                              
	                                                                                                           
	public Clothes(String size, String material, String color, String type, double width, int completionTime) {
		super();                                                                                               
		this.size = size;                                                                                      
		this.material = material;                                                                              
		this.color = color;                                                                                    
		this.type = type;                                                                                      
		this.width = width;                                                                                    
		this.completionTime = completionTime;                                                                  
	}                                                                                                          
                                                                                                               
	public String getSize() {                                                                                  
		return size;                                                                                           
	}                                                                                                          
                                                                                                               
	public void setSize(String size) {                                                                         
		this.size = size;                                                                                      
	}                                                                                                          
                                                                                                               
	public String getMaterial() {                                                                              
		return material;                                                                                       
	}                                                                                                          
                                                                                                               
	public void setMaterial(String material) {                                                                 
		this.material = material;                                                                              
	}                                                                                                          
                                                                                                               
	public String getColor() {                                                                                 
		return color;                                                                                          
	}                                                                                                          
                                                                                                               
	public void setColor(String color) {                                                                       
		this.color = color;                                                                                    
	}                                                                                                          
                                                                                                               
	public String getType() {                                                                                  
		return type;                                                                                           
	}                                                                                                          
                                                                                                               
	public void setType(String type) {                                                                         
		this.type = type;                                                                                      
	}                                                                                                          
                                                                                                               
	public double getWidth() {                                                                                 
		return width;                                                                                          
	}                                                                                                          
                                                                                                               
	public void setWidth(double width) {                                                                       
		this.width = width;                                                                                    
	}                                                                                                          
                                                                                                               
	public int getCompletionTime() {                                                                           
		return completionTime;                                                                                 
	}                                                                                                          
                                                                                                               
	public void setCompletionTime(int completionTime) {                                                        
		this.completionTime = completionTime;                                                                  
	}   
	
	public void baseWorkingTime() {
		if(type.equals("S")) {
			completionTime = 2;
		}else if(type.equals("M")) {
			completionTime = 3;
		}else if(type.equals("L")) {
			completionTime = 4;
		}
		
	}

	public void calculateCompletionTime() {
		// TODO Auto-generated method stub
		
	}
	                                                                                                           
                                                                                                               
}                                                                                                              
                                                                                                               