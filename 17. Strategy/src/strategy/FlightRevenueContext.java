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
public class FlightRevenueContext {
    private Model strategy;

    public void setStrategy(Model strategy) {
        this.strategy = strategy;
    }
    
    public long getRevenue(List<Flight> flights){
        return strategy.getRevenue(flights);
    }
}
