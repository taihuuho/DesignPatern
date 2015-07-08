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
public interface Model {
    static final int BASE_TICKKET_PRICE = 300;
    static final int FIXED_PRICE = 50000;
    
    public long getRevenue(List<Flight> flights);
}
