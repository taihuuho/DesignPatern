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
public interface QueueTarget extends AbtractTarget{
    public void enqueue(String string);
    public String dequeue();
    
}