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
public class ShippingFeeVisitor {
    private double totalShippingFee = 0;

    public double getTotalShippingFee() {
        return totalShippingFee;
    }
    
    public void visit(WeightItem item){
        totalShippingFee += item.getShippingFee();
    }
    
    public void visit(UnitItem item){
        totalShippingFee += item.getShippingFee();
    }
}
