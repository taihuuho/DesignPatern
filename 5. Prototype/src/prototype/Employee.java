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
        Employee cloneObj = (Employee) super.clone();
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
        // Check if the employee has direct reports
        if (staff != null && staff.length > 0) {
            Employee[] staffList = new Employee[staff.length];
            
            int i = 0;
            for (Employee emp : cloneObj.staff) {
                if (emp != null) {
                    emp = (Employee) emp.clone();
                    emp.supervisor = this;
                    staffList[i++] = emp;
                }
            }
            
            cloneObj.staff = staffList;
        }

        // Check employee having supervisor
        if (cloneObj.supervisor != null) {
            cloneObj.supervisor = (Employee) cloneObj.supervisor.clone();
            cloneObj.supervisor.staff[0] = this;
        }

        return cloneObj;
    }
}
