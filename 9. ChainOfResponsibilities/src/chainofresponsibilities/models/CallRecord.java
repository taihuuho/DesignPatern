/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibilities.models;

/**
 *
 * @author 984571
 */
public class CallRecord {

    private Customer customer;
    private Agent agent;
    private String requestInformation;
    private boolean isValid;
    private boolean isASalesLead;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public String getRequestInformation() {
        return requestInformation;
    }

    public void setRequestInformation(String requestInformation) {
        this.requestInformation = requestInformation;
    }

    public boolean isIsValid() {
        isValid = customer != null && agent != null;
        return isValid;
    }

    public void setIsValid(boolean isValid) {
        this.isValid = isValid;
    }

    public boolean isIsASalesLead() {
        return isASalesLead;
    }

    public void setIsASalesLead(boolean isASalesLead) {
        this.isASalesLead = isASalesLead;
    }
    
    

}
