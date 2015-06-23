/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author 984571
 */
public class AdapterClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Adapter adapter = new Adapter();
        StackTarget stackTarget = adapter;
        
        stackTarget.push("Tai Ho");
        stackTarget.push("Trinh Truong");
        
        String pop = stackTarget.pop();
        System.out.println(pop);
        
        QueueTarget queueTarget = adapter;
        queueTarget.enqueue("Trinh Truong");
        
        String dequeue = queueTarget.dequeue();
        System.out.println(dequeue);
        
        System.out.println(adapter);
    }
    
}
