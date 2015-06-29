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
public class Agent {

    private String agentId;
    private Address workLocation;

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public Address getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(Address workLocation) {
        this.workLocation = workLocation;
    }

}
