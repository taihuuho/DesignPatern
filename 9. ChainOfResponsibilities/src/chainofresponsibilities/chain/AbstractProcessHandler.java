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
public abstract class AbstractProcessHandler {

    protected AbstractProcessHandler successor;

    abstract public void processRequest(List<CallRecord> requests);

    boolean canHandleRequest(List<CallRecord> reqquests) {
        return false;
    }
}
