/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibilities.chain;

import chainofresponsibilities.models.CallRecord;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 984571
 */
public class DataWasher extends AbstractProcessHandler {

    List<CallRecord> saleLeads = new ArrayList<>();

    @Override
    boolean canHandleRequest(List<CallRecord> reqquests) {
        return true;
    }
    
    @Override
    public void processRequest(List<CallRecord> requests) {
        for (CallRecord req : requests) {
            if (req.isIsASalesLead()) {
                saleLeads.add(req);
            } else {
                //do nothing
            }
        }

        if (this.canHandleRequest(requests)) {
            if (this.successor != null) {
                this.successor.processRequest(saleLeads);
            }
        }

    }

}
