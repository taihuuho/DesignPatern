/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

/**
 *
 * @author 984571
 */
public class FlyweightClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConcreteFlyWeight info = FlyWeightFactory.locationMap.get("loc1");
        info.printCustomerInfo(1, "Tai Ho", "Whatsapp", info.getImage());
        
        info = FlyWeightFactory.locationMap.get("loc2");
        info.printCustomerInfo(2, "Tai Ho 2", "Snapchat", info.getImage());
    }
    
}
