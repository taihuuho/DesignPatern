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
public class WeightItem extends Item {

    private static final int PRICE_PER_KG = 100;
    
    double weight;

    public double getWeight() {
        return weight;
    }
    
    @Override
    public double getPrice(){
        return weight*PRICE_PER_KG;
    }

    @Override
    public double getShippingFee() {
        if (weight <= 0.5) {
            return 0;
        }else{
            
        }
        return weight <= 0.5 ? 0 : weight*0.5/2; // USD
    }
    
    

    @Override
    public void accept(PriceVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void accept(ShippingFeeVisitor visitor) {
        visitor.visit(this);
    }
    
}
