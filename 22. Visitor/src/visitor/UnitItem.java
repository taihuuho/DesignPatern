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
public class UnitItem extends Item{
    private static final int PRICE_PER_UNIT = 100;
    double numberOfUnit;
    
    @Override
    public double getPrice(){
        return PRICE_PER_UNIT * numberOfUnit;
    }

    public double getNumberOfUnit() {
        return numberOfUnit;
    }
    
    @Override
    public void accept(PriceVisitor visitor) {
        visitor.visit(this);
    }
    
    @Override
    public void accept(ShippingFeeVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public double getShippingFee() {
        return numberOfUnit < 3 ? getPrice()*0.02 : getPrice()*0.125;
    }
}
