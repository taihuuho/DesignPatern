/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mememto.pattern;

/**
 *
 * @author 984571
 */
public class UserMememto {
    private User state;

    public UserMememto(User state) {
        this.state = state;
    }
    
    public User getState() {
        return state;
    }

    public void setState(User state) {
        this.state = state;
    }
    
    
}
