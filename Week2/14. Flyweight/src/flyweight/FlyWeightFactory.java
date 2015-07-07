package edu.mum.lsvs;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
    
    static Map<String,ConcreteFlyWeight>  locationMap = new HashMap<>();
    static {
        locationMap.put("loc1", new ConcreteFlyWeight(new Image("pp1","image1")));
        locationMap.put("loc2", new ConcreteFlyWeight(new Image("pp2","image2")));
        locationMap.put("loc3", new ConcreteFlyWeight(new Image("pp3","image3")));
        locationMap.put("loc4", new ConcreteFlyWeight(new Image("pp4","image4")));
    }

}
