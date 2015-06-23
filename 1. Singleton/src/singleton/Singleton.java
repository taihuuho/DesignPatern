/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author 984571
 */
public class Singleton {
    
    
    private static class InnerClass{
        static Singleton sharedInstance = new Singleton();
    }
    /**
     * 
     * @return  private sharedInstance instantiated
     */
    public static Singleton sharedInstance(){
        return InnerClass.sharedInstance;
    }
    
    /**
     * Make the Constructor private, prevent instantiation from outside
     */
    private Singleton(){
        System.out.println("new Singleton()");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("1");
        sharedInstance();
    }
    
}
