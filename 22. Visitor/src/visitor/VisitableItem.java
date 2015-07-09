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
public interface VisitableItem {
    public void accept(PriceVisitor visitor);
    public void accept(ShippingFeeVisitor visitor);
}
