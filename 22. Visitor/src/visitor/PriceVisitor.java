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
public class PriceVisitor {
    
    private double totalPrice = 0;

    public double getTotalPrice() {
        return totalPrice;
    }
    
    public void visit(WeightItem item){
        totalPrice += item.getPrice();
    }    

    public void visit(UnitItem item){
        totalPrice += item.getPrice();
    }
}
