/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton.synchronization;

/**
 *
 * @author 984571
 */
public class Singleton {
    // private shared instance
    private static Singleton sharedInstance = null;
    
    /**
     * 
     * @return  private sharedInstance instantiated
     */
    public static Singleton sharedInstance(){
    
        if(sharedInstance == null){
            synchronized(Singleton.class){
               if(sharedInstance == null){
                   sharedInstance = new Singleton();
               }
            }
        }
        return sharedInstance;
    }
    /**
     * Make the Constructor private, prevent instantiation from outside
     */
    private Singleton(){
    
    }
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
