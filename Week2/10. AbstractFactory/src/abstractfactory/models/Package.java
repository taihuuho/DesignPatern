package edu.mum.lsvs.entity;

public abstract class Package {
	
	protected String type;
	protected float price;

	
	public String getType() {
		return type;
	}
	public abstract void setType(String type);
	public abstract float getPrice();
	public void setPrice(float price) {
		this.price = price;
	}
    
	
   
	
	

}
