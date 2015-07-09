/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 984571
 */
public class VisitorDemo {

    List<VisitableItem> items = new ArrayList<>();
    
    public double getTotalPrice(){
        // creat Price visitor
        PriceVisitor priceVisitor = new PriceVisitor();
        for (VisitableItem item : items) {
            item.accept(priceVisitor);
        }
        return priceVisitor.getTotalPrice();
    }
    
    public double getTotalShippingFee(){
        // creat Price visitor
        ShippingFeeVisitor shippingFeeVisitor = new ShippingFeeVisitor();
        for (VisitableItem item : items) {
            item.accept(shippingFeeVisitor);
        }
        return shippingFeeVisitor.getTotalShippingFee();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    }
    
}
