/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.io.Serializable;

/**
 *
 * @author 984571
 */
public class Employee implements Cloneable, Serializable {

    private int id;
    private String Lastname;
    private String Firstname;
    private String streetAddress;
    private String city;
    private String state;
    private String zipcode;
    private Employee supervisor;
    private Employee staff[];

    @Override
    protected Object clone() throws CloneNotSupportedException {
    //implement deep copy here
        Employee cloneObj = new Employee();
        cloneObj.id = id;
        /*
        Strings are immutable objects in java
        Although you can also create a new object like :
        String copy = new String(s);
        But there is simply no need to do so.
        */
        cloneObj.Lastname = Lastname;
        cloneObj.Firstname = Firstname;
        cloneObj.streetAddress = streetAddress;
        cloneObj.city = city;
        cloneObj.state = state;
        cloneObj.zipcode = zipcode;
        if (supervisor != null) {
            cloneObj.supervisor = (Employee)supervisor.clone();
        }
        
        if(staff != null){
            Employee[] cloneStaff = new Employee[staff.length];
            for(int i = 0; i < staff.length; i++){
                cloneStaff[i] = (Employee)staff[i].clone();
            }
            cloneObj.staff = cloneStaff;
        }
        
        return cloneObj;
    }
}
