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
public class Validator extends AbstractProcessHandler {

    List<CallRecord> validRequests = new ArrayList<>();
    List<CallRecord> inValidRequests = new ArrayList<>();

    @Override
    boolean canHandleRequest(List<CallRecord> reqquests) {
        return true;
    }
    
    @Override
    public void processRequest(List<CallRecord> requests) {
        for (CallRecord req : requests) {
            if (req.isIsValid()) {
                validRequests.add(req);
            } else {
                // discard
                inValidRequests.add(req);
            }
        }

        if (this.canHandleRequest(requests)) {
            if (this.successor != null) {
                this.successor.processRequest(validRequests);
            }
        }

        // save discarded-requests to file
    }

}
