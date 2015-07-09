/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

/**
 *
 * @author 984571
 */
public abstract class Item implements VisitableItem{
    
    protected String destination;
    
    public abstract double getPrice();
    public abstract double getShippingFee();
    
    public double getTotalShipmentFee(){
        if (getPrice() <= 100){
            return getShippingFee();
        }else{
            if ("US".endsWith(destination)) {
                return getShippingFee();
            }
            return 20 + getShippingFee();
        }
    }
   
}
