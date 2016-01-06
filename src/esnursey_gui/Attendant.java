/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package esnursey_gui;

/**
 *
 * @author Eric Nursey
 */
public class Attendant {
    
    String name;
    boolean available;
    
    public Attendant(String n, boolean a){
        
        name = n;
        available = a;
        
    }
    
    public String getName(){return name;}
    public boolean getAvailable(){return available;}
    
}
