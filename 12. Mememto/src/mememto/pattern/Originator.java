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
public class Originator {
 
    private User state;

    public Originator() {
        state = new User("First Name", "Last Name", "Age");
    }

    public User getState() {
        return state;
    }

    public void setState(User state) {
        this.state = state;
    }
    
    public void setMememtor(UserMememto mememto){
        state = mememto.getState();
    }
    
    public UserMememto createMememto(){
        return new UserMememto(state);
    }
}
