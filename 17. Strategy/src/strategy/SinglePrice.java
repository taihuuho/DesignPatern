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
public class SinglePrice implements Model{

    @Override
    public long getRevenue(List<Flight> flights) {
        long totalRevenue = 0;
        for (Flight flight : flights) {
            totalRevenue += flight.getNumberOfPassengers()*BASE_TICKKET_PRICE;
        }
        return totalRevenue - FIXED_PRICE;
    }
    
}
