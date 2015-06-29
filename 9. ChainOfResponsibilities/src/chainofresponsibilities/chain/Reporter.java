/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibilities.chain;

import chainofresponsibilities.models.CallRecord;
import java.util.List;

/**
 *
 * @author 984571
 */
public class Reporter extends AbstractProcessHandler {

    @Override
    public void processRequest(List<CallRecord> reqList) {
      for (CallRecord req : reqList)
        {
            System.out.println("-----------");
            System.out.println("Name: " + req.getCustomer().toString() + "\n Agent: " + req.getAgent());
        }  
    }
    
}
