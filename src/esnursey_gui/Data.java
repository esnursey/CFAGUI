/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package esnursey_gui;

/**
 *
 * @author Eric Nursey
 */
public class Data {
    
    public int attendants, beer, pretzels, soda, peanuts;
    
    public Data(int a, int b, int p, int s, int n){
        
        attendants = a;
        beer = b;
        pretzels = p;
        soda = s;
        peanuts = n;
        
    }

    
    public boolean getAvailable(){
        
        if(attendants > 0) return true;
        else return false;
        
    }
    
    public int getAttendants(){return attendants;}
    public boolean decAttendants(int c){
        
        if(attendants >= c){
            attendants = attendants-c;
            return true;
        }
        else return false;
        
    }
    public boolean addAttendants(int c){
        
        attendants += c;
        return true;
    }
    
    public int getBeer(){return beer;}
    public int getPretzels(){return pretzels;}
    public int getSoda(){return soda;}
    public int getPeanuts(){return peanuts;}
    
   public boolean decBeer(int amt){
       
       if(beer >= amt){
           beer = beer-amt; 
           return true;
       }
       else return false;
       
   }
   
   public boolean decPretzels(int amt){
       
       if(pretzels >= amt){
           pretzels = pretzels-amt; 
           return true;
       }
       else return false;
       
   }
   
   public boolean decSoda(int amt){
       
       if(soda >= amt){
           soda = soda-amt; 
           return true;
       }
       else return false;
       
   }
   
   public boolean decPeanuts(int amt){
       
       if(peanuts >= amt){
           peanuts = peanuts-amt; 
           return true;
       }
       else return false;
       
   }
}
    

