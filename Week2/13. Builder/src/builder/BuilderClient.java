/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author 984571
 */
public class BuilderClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Director d = new Director(new ConcreteBuilder());
        d.ConstructRequest();
        Request req = d.getRequest();
        System.out.println(req.toString());
    }

}
