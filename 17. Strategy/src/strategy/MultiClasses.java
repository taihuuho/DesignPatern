/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.List;
import strategy.entity.Flight;

/**
 *
 * @author 984571
 */
public class MultiClasses implements Model{

    @Override
    public long getRevenue(List<Flight> flights) {
        long totalRevenue = 0;
        for (Flight flight : flights) {
            totalRevenue += (flight.getNumberOfPassengers()*BASE_TICKKET_PRICE*4/10 + flight.getNumberOfPassengers()*BASE_TICKKET_PRICE*1.5/5
                    + flight.getNumberOfPassengers()*BASE_TICKKET_PRICE*7/10);
        }
        return (long) (totalRevenue - FIXED_PRICE*1.2);
    }
    
}
