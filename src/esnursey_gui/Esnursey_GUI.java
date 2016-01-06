/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package esnursey_gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author Eric
 */
public class Esnursey_GUI extends javax.swing.JFrame implements ActionListener {
    
    JFrame window = new JFrame("Chief Flight Attendant");
       
    
    Data current = new Data(4, 5, 5, 5, 5);
    Attendant boone = new Attendant("Craig Boone", true);
    Attendant veronica = new Attendant("Veronica Santangelo", true);
    Attendant cass = new Attendant("Sharon Cassidy", true);
    Attendant arcade = new Attendant("Arcade Gannon", true);
    String seats = "";
    
    
    private void but_InventoryActionPerformed(java.awt.event.ActionEvent evt) {                                              
        int b, s, p, n;
        b = current.getBeer();
        s = current.getSoda();
        p = current.getPretzels();
        n = current.getPeanuts();
        if(b <= 2 || s <= 2 || p <= 2 || n <= 2){
        Messages.setText("Current inventory:\nBeer: " + b + "\tSoda: " + s 
                + "\nPretzels: " + p + "\tPeanuts:" + n +"\nSome items are "
                + "low! Consider restocking.");
        }
        else{
            Messages.setText("Current inventory:\nBeer: " + b + "\tSoda: " + s 
                + "\nPretzels: " + p + "\tPeanuts:" + n);
        }
    }                                             

    private void but_RowAActionPerformed(java.awt.event.ActionEvent evt) {                                       
       if(but_A1.getBackground()!=Color.white || 
               but_A2.getBackground()!=Color.white ||
               but_A3.getBackground()!=Color.white ||
               but_A4.getBackground()!=Color.white ||
               but_A5.getBackground()!=Color.white ||
               but_A6.getBackground()!=Color.white ||
               but_A7.getBackground()!=Color.white ||
               but_A8.getBackground()!=Color.white ||
               but_A9.getBackground()!=Color.white &&
               current.getAttendants()>=1){
        if(but_A1.getBackground()!=Color.white){
            
            seats += "A1 ";
            current.decAttendants(1);
            but_A1.setBackground(Color.white);}
        else if(but_A1.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_A2.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "A2 ";
            current.decAttendants(1);
            but_A2.setBackground(Color.white);}
        else if(but_A2.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_A3.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "A3 ";
            current.decAttendants(1);
            but_A3.setBackground(Color.white);}
        else if(but_A3.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_A4.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "A4 ";
            current.decAttendants(1);
            but_A4.setBackground(Color.white);}
        else if(but_A4.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_A5.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "A5 ";
            current.decAttendants(1);
            but_A5.setBackground(Color.white);}
        else if(but_A5.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_A6.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "A6 ";
            current.decAttendants(1);
            but_A6.setBackground(Color.white);}
        else if(but_A6.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_A7.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "A7 ";
            current.decAttendants(1);
            but_A1.setBackground(Color.white);}
        else if(but_A7.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_A8.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "A8 ";
            current.decAttendants(1);
            but_A8.setBackground(Color.white);}
        else if(but_A8.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_A9.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "A9 ";
            current.decAttendants(1);
            but_A9.setBackground(Color.white);}
        else if(but_A9.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        Messages.setText("An attendant has been sent to the following seats:" 
                    + "\n" + seats);
           
       }
        else{
           Messages.setText("There are no attendants available \nor no "
                   + "passengers have requested assistance in this row.");
        }
       seats = "";
    }                                      

    private void but_RowBActionPerformed(java.awt.event.ActionEvent evt) {                                       
        if(but_B1.getBackground()!=Color.white || 
               but_B2.getBackground()!=Color.white ||
               but_B3.getBackground()!=Color.white ||
               but_B4.getBackground()!=Color.white ||
               but_B5.getBackground()!=Color.white ||
               but_B6.getBackground()!=Color.white ||
               but_B7.getBackground()!=Color.white ||
               but_B8.getBackground()!=Color.white ||
               but_B9.getBackground()!=Color.white &&
               current.getAttendants()>=1){
        if(but_B1.getBackground()!=Color.white){
            
            seats += "B1 ";
            current.decAttendants(1);
            but_B1.setBackground(Color.white);}
        else if(but_B1.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_B2.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "B2 ";
            current.decAttendants(1);
            but_B2.setBackground(Color.white);}
        else if(but_B2.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_B3.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "B3 ";
            current.decAttendants(1);
            but_B3.setBackground(Color.white);}
        else if(but_B3.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_B4.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "B4 ";
            current.decAttendants(1);
            but_B4.setBackground(Color.white);}
        else if(but_B4.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_B5.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "B5 ";
            current.decAttendants(1);
            but_B5.setBackground(Color.white);}
        else if(but_B5.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_B6.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "B6 ";
            current.decAttendants(1);
            but_B6.setBackground(Color.white);}
        else if(but_B6.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_B7.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "B7 ";
            current.decAttendants(1);
            but_B7.setBackground(Color.white);}
        else if(but_B7.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_B8.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "B8 ";
            current.decAttendants(1);
            but_B8.setBackground(Color.white);}
        else if(but_B8.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_B9.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "B9 ";
            current.decAttendants(1);
            but_B9.setBackground(Color.white);}
        else if(but_B9.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        Messages.setText("An attendant has been sent to the following seats:" 
                    + "\n" + seats);
           
       }
        else{
           Messages.setText("There are no attendants available \nor no "
                   + "passengers have requested assistance in this row.");
        }
        seats = "";
    }                                      

    private void but_RowCActionPerformed(java.awt.event.ActionEvent evt) {                                       
        if(but_C1.getBackground()!=Color.white || 
               but_C2.getBackground()!=Color.white ||
               but_C3.getBackground()!=Color.white ||
               but_C4.getBackground()!=Color.white ||
               but_C5.getBackground()!=Color.white ||
               but_C6.getBackground()!=Color.white ||
               but_C7.getBackground()!=Color.white ||
               but_C8.getBackground()!=Color.white ||
               but_C9.getBackground()!=Color.white &&
               current.getAttendants()>=1){
        if(but_C1.getBackground()!=Color.white){
            
            seats += "C1 ";
            current.decAttendants(1);
            but_C1.setBackground(Color.white);}
        else if(but_C1.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_C2.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "C2 ";
            current.decAttendants(1);
            but_C2.setBackground(Color.white);}
        else if(but_C2.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_C3.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "C3 ";
            current.decAttendants(1);
            but_C3.setBackground(Color.white);}
        else if(but_C3.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_C4.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "C4 ";
            current.decAttendants(1);
            but_C4.setBackground(Color.white);}
        else if(but_C4.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_C5.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "C5 ";
            current.decAttendants(1);
            but_C5.setBackground(Color.white);}
        else if(but_C5.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_C6.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "C6 ";
            current.decAttendants(1);
            but_C6.setBackground(Color.white);}
        else if(but_C6.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_C7.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "C7 ";
            current.decAttendants(1);
            but_C7.setBackground(Color.white);}
        else if(but_C7.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_C8.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "C8 ";
            current.decAttendants(1);
            but_C8.setBackground(Color.white);}
        else if(but_C8.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_C9.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "C9 ";
            current.decAttendants(1);
            but_C9.setBackground(Color.white);}
        else if(but_C9.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        Messages.setText("An attendant has been sent to the following seats:" 
                    + "\n" + seats);
           
       }
        else{
           Messages.setText("There are no attendants available \nor no "
                   + "passengers have requested assistance in this row.");
        }
        seats = "";
    }                                      

    private void but_RowDActionPerformed(java.awt.event.ActionEvent evt) {                                       
        if(but_D1.getBackground()!=Color.white || 
               but_D2.getBackground()!=Color.white ||
               but_D3.getBackground()!=Color.white ||
               but_D4.getBackground()!=Color.white ||
               but_D5.getBackground()!=Color.white ||
               but_D6.getBackground()!=Color.white ||
               but_D7.getBackground()!=Color.white ||
               but_D8.getBackground()!=Color.white ||
               but_D9.getBackground()!=Color.white &&
               current.getAttendants()>=1){
        if(but_D1.getBackground()!=Color.white){
            
            seats += "D1 ";
            current.decAttendants(1);
            but_D1.setBackground(Color.white);}
        else if(but_D1.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_D2.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "D2 ";
            current.decAttendants(1);
            but_D2.setBackground(Color.white);}
        else if(but_D2.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_D3.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "D3 ";
            current.decAttendants(1);
            but_D3.setBackground(Color.white);}
        else if(but_D3.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_D4.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "D4 ";
            current.decAttendants(1);
            but_D4.setBackground(Color.white);}
        else if(but_D4.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_D5.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "D5 ";
            current.decAttendants(1);
            but_D5.setBackground(Color.white);}
        else if(but_D5.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_D6.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "D6 ";
            current.decAttendants(1);
            but_D6.setBackground(Color.white);}
        else if(but_D6.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_D7.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "D7 ";
            current.decAttendants(1);
            but_D7.setBackground(Color.white);}
        else if(but_D7.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_D8.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "D8 ";
            current.decAttendants(1);
            but_D8.setBackground(Color.white);}
        else if(but_D8.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_D9.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "D9 ";
            current.decAttendants(1);
            but_D9.setBackground(Color.white);}
        else if(but_D9.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        Messages.setText("An attendant has been sent to the following seats:" 
                    + "\n" + seats);
           
       }
        else{
           Messages.setText("There are no attendants available \nor no "
                   + "passengers have requested assistance in this row.");
        }
        seats = "";
    }                                      

    private void but_RowEActionPerformed(java.awt.event.ActionEvent evt) {                                       
        if(but_E1.getBackground()!=Color.white || 
               but_E2.getBackground()!=Color.white ||
               but_E3.getBackground()!=Color.white ||
               but_E4.getBackground()!=Color.white ||
               but_E5.getBackground()!=Color.white ||
               but_E6.getBackground()!=Color.white ||
               but_E7.getBackground()!=Color.white ||
               but_E8.getBackground()!=Color.white ||
               but_E9.getBackground()!=Color.white &&
               current.getAttendants()>=1){
        if(but_E1.getBackground()!=Color.white){
            
            seats += "E1 ";
            current.decAttendants(1);
            but_E1.setBackground(Color.white);}
        else if(but_E1.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_E2.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "E2 ";
            current.decAttendants(1);
            but_E2.setBackground(Color.white);}
        else if(but_E2.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_E3.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "E3 ";
            current.decAttendants(1);
            but_E3.setBackground(Color.white);}
        else if(but_E3.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_E4.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "E4 ";
            current.decAttendants(1);
            but_E4.setBackground(Color.white);}
        else if(but_E4.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_E5.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "E5 ";
            current.decAttendants(1);
            but_E5.setBackground(Color.white);}
        else if(but_E5.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_E6.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "E6 ";
            current.decAttendants(1);
            but_E6.setBackground(Color.white);}
        else if(but_E6.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_E7.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "E7 ";
            current.decAttendants(1);
            but_E7.setBackground(Color.white);}
        else if(but_E7.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_E8.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "E8 ";
            current.decAttendants(1);
            but_E8.setBackground(Color.white);}
        else if(but_E8.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_E9.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "E9 ";
            current.decAttendants(1);
            but_E9.setBackground(Color.white);}
        else if(but_E9.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        Messages.setText("An attendant has been sent to the following seats:" 
                    + "\n" + seats);
           
       }
        else{
           Messages.setText("There are no attendants available \nor no "
                   + "passengers have requested assistance in this row.");
        }
        seats = "";
    }                                      

    private void but_RowFActionPerformed(java.awt.event.ActionEvent evt) {                                       
        if(but_F1.getBackground()!=Color.white || 
               but_F2.getBackground()!=Color.white ||
               but_F3.getBackground()!=Color.white ||
               but_F4.getBackground()!=Color.white ||
               but_F5.getBackground()!=Color.white ||
               but_F6.getBackground()!=Color.white ||
               but_F7.getBackground()!=Color.white ||
               but_F8.getBackground()!=Color.white ||
               but_F9.getBackground()!=Color.white &&
               current.getAttendants()>=1){
        if(but_F1.getBackground()!=Color.white){
            
            seats += "F1 ";
            current.decAttendants(1);
            but_F1.setBackground(Color.white);}
        else if(but_F1.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_F2.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "F2 ";
            current.decAttendants(1);
            but_F2.setBackground(Color.white);}
        else if(but_F2.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_F3.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "F3 ";
            current.decAttendants(1);
            but_F3.setBackground(Color.white);}
        else if(but_F3.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_F4.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "F4 ";
            current.decAttendants(1);
            but_F4.setBackground(Color.white);}
        else if(but_F4.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_F5.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "F5 ";
            current.decAttendants(1);
            but_F5.setBackground(Color.white);}
        else if(but_F5.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_F6.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "F6 ";
            current.decAttendants(1);
            but_F6.setBackground(Color.white);}
        else if(but_F6.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_F7.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "F7 ";
            current.decAttendants(1);
            but_F7.setBackground(Color.white);}
        else if(but_F7.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_F8.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "F8 ";
            current.decAttendants(1);
            but_F8.setBackground(Color.white);}
        else if(but_F8.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        if(but_F9.getBackground()!=Color.white && current.getAttendants()>=1){
            
            seats += "F9 ";
            current.decAttendants(1);
            but_F9.setBackground(Color.white);}
        else if(but_F9.getBackground()!=Color.white && current.getAttendants()==0){
            seats += "\nAll attendants are now busy.";
        }
        Messages.setText("An attendant has been sent to the following seats:" 
                    + "\n" + seats);
           
       }
        else{
           Messages.setText("There are no attendants available \nor no "
                   + "passengers have requested assistance in this row.");
        }
        seats = "";
    }                                                

    private void but_RefreshmentsActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        if(current.getBeer() == 0 || current.getPeanuts() == 0 ||
                current.getSoda() == 0 || current.getPretzels() == 0){
            Messages.setText("You are out of some refreshments.  "
                    + "\nRestock at your next landing.");
        }
        else if(current.getAttendants() >= 2){
        Messages.setText("Attendants have been notified to serve refreshments.");
        current.decAttendants(2);
        current.decBeer(1);
        current.decPretzels(1);
        current.decPeanuts(1);
        current.decSoda(1);
        }
        else Messages.setText("There are not enough attendants available to "
                + "do that.");
    }                                                

    private void but_AttendantsActionPerformed(java.awt.event.ActionEvent evt) {                                               
        Messages.setText("Attendants on duty:\n" + boone.name + "\n" 
                + veronica.name + "\n" + arcade.name + "\n" + cass.name);
        current.addAttendants(4-current.getAttendants());
        
    }                                              

    private void but_AnnouncementActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        Messages.setText("Remove the microphone and press the button \non its "
                + "side, then speak.\nReplace the microphone when finished.");
    }                                                

    
    public Esnursey_GUI(){
    
        initComponents();
    
}

    private void initComponents(){
        
        
        but_A1 = new javax.swing.JButton();
        but_A2 = new javax.swing.JButton();
        but_A3 = new javax.swing.JButton();
        but_A4 = new javax.swing.JButton();
        but_A5 = new javax.swing.JButton();
        but_A6 = new javax.swing.JButton();
        but_A7 = new javax.swing.JButton();
        but_A8 = new javax.swing.JButton();
        but_A9 = new javax.swing.JButton();
        but_B1 = new javax.swing.JButton();
        but_B2 = new javax.swing.JButton();
        but_B3 = new javax.swing.JButton();
        but_B4 = new javax.swing.JButton();
        but_B5 = new javax.swing.JButton();
        but_B6 = new javax.swing.JButton();
        but_B7 = new javax.swing.JButton();
        but_B8 = new javax.swing.JButton();
        but_B9 = new javax.swing.JButton();
        but_C1 = new javax.swing.JButton();
        but_C2 = new javax.swing.JButton();
        but_C3 = new javax.swing.JButton();
        but_C4 = new javax.swing.JButton();
        but_C5 = new javax.swing.JButton();
        but_C6 = new javax.swing.JButton();
        but_C7 = new javax.swing.JButton();
        but_C8 = new javax.swing.JButton();
        but_C9 = new javax.swing.JButton();
        but_D1 = new javax.swing.JButton();
        but_D2 = new javax.swing.JButton();
        but_D3 = new javax.swing.JButton();
        but_D4 = new javax.swing.JButton();
        but_D5 = new javax.swing.JButton();
        but_D6 = new javax.swing.JButton();
        but_D7 = new javax.swing.JButton();
        but_D8 = new javax.swing.JButton();
        but_D9 = new javax.swing.JButton();
        but_E1 = new javax.swing.JButton();
        but_E2 = new javax.swing.JButton();
        but_E3 = new javax.swing.JButton();
        but_E4 = new javax.swing.JButton();
        but_E5 = new javax.swing.JButton();
        but_E6 = new javax.swing.JButton();
        but_E7 = new javax.swing.JButton();
        but_E8 = new javax.swing.JButton();
        but_E9 = new javax.swing.JButton();
        but_F1 = new javax.swing.JButton();
        but_F2 = new javax.swing.JButton();
        but_F3 = new javax.swing.JButton();
        but_F4 = new javax.swing.JButton();
        but_F5 = new javax.swing.JButton();
        but_F6 = new javax.swing.JButton();
        but_F7 = new javax.swing.JButton();
        but_F8 = new javax.swing.JButton();
        but_F9 = new javax.swing.JButton();
        but_Refreshments = new javax.swing.JButton();
        but_Announcement = new javax.swing.JButton();
        but_Attendants = new javax.swing.JButton();
        but_Inventory = new javax.swing.JButton();
        but_RowA = new javax.swing.JButton();
        but_RowB = new javax.swing.JButton();
        but_RowC = new javax.swing.JButton();
        but_RowD = new javax.swing.JButton();
        but_RowE = new javax.swing.JButton();
        but_RowF = new javax.swing.JButton();
        Messages = new javax.swing.JTextArea();
        lab_RowA = new javax.swing.JLabel();
        lab_RowB = new javax.swing.JLabel();
        lab_RowC = new javax.swing.JLabel();
        lab_RowD = new javax.swing.JLabel();
        lab_RowE = new javax.swing.JLabel();
        lab_RowF = new javax.swing.JLabel();
        lab_RowHead = new javax.swing.JLabel();
        lab_Col1 = new javax.swing.JLabel();
        lab_Col2 = new javax.swing.JLabel();
        lab_Col3 = new javax.swing.JLabel();
        lab_Col4 = new javax.swing.JLabel();
        lab_Col5 = new javax.swing.JLabel();
        lab_Col6 = new javax.swing.JLabel();
        lab_Col7 = new javax.swing.JLabel();
        lab_Col8 = new javax.swing.JLabel();
        lab_Col9 = new javax.swing.JLabel();
        lab_ColHead = new javax.swing.JLabel();
        but_hide = new javax.swing.JButton();
        
        window.getContentPane().add(lab_ColHead).setLocation(308,10);
        lab_ColHead.setText("Column");
        lab_ColHead.setSize(70, 20);
        window.getContentPane().add(lab_Col1).setLocation(207, 25);
        lab_Col1.setText("1");
        lab_Col1.setSize(30, 20);
        window.getContentPane().add(lab_Col2).setLocation(237, 25);
        lab_Col2.setText("2");
        lab_Col2.setSize(30, 20);
        window.getContentPane().add(lab_Col3).setLocation(267, 25);
        lab_Col3.setText("3");
        lab_Col3.setSize(30, 20);
        window.getContentPane().add(lab_Col4).setLocation(297, 25);
        lab_Col4.setText("4");
        lab_Col4.setSize(30, 20);
        window.getContentPane().add(lab_Col5).setLocation(327, 25);
        lab_Col5.setText("5");
        lab_Col5.setSize(30, 20);
        window.getContentPane().add(lab_Col6).setLocation(357, 25);
        lab_Col6.setText("6");
        lab_Col6.setSize(30, 20);
        window.getContentPane().add(lab_Col7).setLocation(387, 25);
        lab_Col7.setText("7");
        lab_Col7.setSize(30, 20);
        window.getContentPane().add(lab_Col8).setLocation(417, 25);
        lab_Col8.setText("8");
        lab_Col8.setSize(30, 20);
        window.getContentPane().add(lab_Col9).setLocation(447, 25);
        lab_Col9.setText("9");
        lab_Col9.setSize(30, 20);
        window.getContentPane().add(lab_RowHead).setLocation(14, 30);
        lab_RowHead.setSize(30, 20);
        lab_RowHead.setText("Row");
        window.getContentPane().add(lab_RowA).setLocation(20, 50);
        lab_RowA.setSize(20, 20);
        lab_RowA.setText("A");
        window.getContentPane().add(lab_RowB).setLocation(20, 80);
        lab_RowB.setSize(20, 20);
        lab_RowB.setText("B");
        window.getContentPane().add(lab_RowC).setLocation(20, 110);
        lab_RowC.setSize(20, 20);
        lab_RowC.setText("C");
        window.getContentPane().add(lab_RowD).setLocation(20, 170);
        lab_RowD.setSize(20, 20);
        lab_RowD.setText("D");
        window.getContentPane().add(lab_RowE).setLocation(20, 200);
        lab_RowE.setSize(20, 20);
        lab_RowE.setText("E");
        window.getContentPane().add(lab_RowF).setLocation(20, 230);
        lab_RowF.setSize(20, 20);
        lab_RowF.setText("F");
        window.getContentPane().add(Messages).setLocation(390 ,280);
        Messages.setSize(340, 100);
        Messages.setEditable(false);
        window.getContentPane().add(but_Refreshments).setLocation(50, 280);
        but_Refreshments.setSize(160, 30);
        but_Refreshments.setText("Send Refreshments");
        window.getContentPane().add(but_Announcement).setLocation(50, 320);
        but_Announcement.setSize(160, 30);
        but_Announcement.setText("Make Announcement");
        window.getContentPane().add(but_Attendants).setLocation(220, 280);
        but_Attendants.setSize(160, 30);
        but_Attendants.setText("View Attendants");
        window.getContentPane().add(but_Inventory).setLocation(220, 320);
        but_Inventory.setSize(160, 30);
        but_Inventory.setText("View Inventory");
        window.getContentPane().add(but_RowA).setLocation(50, 50);
        but_RowA.setSize(140, 20);
        but_RowA.setText("Send Attendant ->");
        window.getContentPane().add(but_RowB).setLocation(50, 80);
        but_RowB.setSize(140, 20);
        but_RowB.setText("Send Attendant ->");
        window.getContentPane().add(but_RowC).setLocation(50, 110);
        but_RowC.setSize(140, 20);
        but_RowC.setText("Send Attendant ->");
        window.getContentPane().add(but_RowD).setLocation(50, 170);
        but_RowD.setSize(140, 20);
        but_RowD.setText("Send Attendant ->");
        window.getContentPane().add(but_RowE).setLocation(50, 200);
        but_RowE.setSize(140, 20);
        but_RowE.setText("Send Attendant ->");
        window.getContentPane().add(but_RowF).setLocation(50, 230);
        but_RowF.setSize(140, 20);
        but_RowF.setText("Send Attendant ->");
        window.getContentPane().add(but_A1).setLocation(200, 50);
        but_A1.setSize(20, 20);
        window.getContentPane().add(but_A2).setLocation(230, 50);
        but_A2.setSize(20, 20);
        window.getContentPane().add(but_A3).setLocation(260, 50);
        but_A3.setSize(20, 20);
        window.getContentPane().add(but_A4).setLocation(290, 50);
        but_A4.setSize(20, 20);
        window.getContentPane().add(but_A5).setLocation(320, 50);
        but_A5.setSize(20, 20);
        window.getContentPane().add(but_A6).setLocation(350, 50);
        but_A6.setSize(20, 20);
        window.getContentPane().add(but_A7).setLocation(380, 50);
        but_A7.setSize(20, 20);
        window.getContentPane().add(but_A8).setLocation(410, 50);
        but_A8.setSize(20, 20);
        window.getContentPane().add(but_A9).setLocation(440, 50);
        but_A9.setSize(20, 20);
        window.getContentPane().add(but_B1).setLocation(200, 80);
        but_B1.setSize(20, 20);
        window.getContentPane().add(but_B2).setLocation(230, 80);
        but_B2.setSize(20, 20);
        window.getContentPane().add(but_B3).setLocation(260, 80);
        but_B3.setSize(20, 20);
        window.getContentPane().add(but_B4).setLocation(290, 80);
        but_B4.setSize(20, 20);
        window.getContentPane().add(but_B5).setLocation(320, 80);
        but_B5.setSize(20, 20);
        window.getContentPane().add(but_B6).setLocation(350, 80);
        but_B6.setSize(20, 20);
        window.getContentPane().add(but_B7).setLocation(380, 80);
        but_B7.setSize(20, 20);
        window.getContentPane().add(but_B8).setLocation(410, 80);
        but_B8.setSize(20, 20);
        window.getContentPane().add(but_B9).setLocation(440, 80);
        but_B9.setSize(20, 20);
        window.getContentPane().add(but_C1).setLocation(200, 110);
        but_C1.setSize(20, 20);
        window.getContentPane().add(but_C2).setLocation(230, 110);
        but_C2.setSize(20, 20); 
        window.getContentPane().add(but_C3).setLocation(260, 110);
        but_C3.setSize(20, 20);
        window.getContentPane().add(but_C4).setLocation(290, 110);
        but_C4.setSize(20, 20);
        window.getContentPane().add(but_C5).setLocation(320, 110);
        but_C5.setSize(20, 20);
        window.getContentPane().add(but_C6).setLocation(350, 110);
        but_C6.setSize(20, 20);
        window.getContentPane().add(but_C7).setLocation(380, 110);
        but_C7.setSize(20, 20);
        window.getContentPane().add(but_C8).setLocation(410, 110);
        but_C8.setSize(20, 20);
        window.getContentPane().add(but_C9).setLocation(440, 110);
        but_C9.setSize(20, 20);
        window.getContentPane().add(but_D1).setLocation(200, 170);
        but_D1.setSize(20, 20);
        window.getContentPane().add(but_D2).setLocation(230, 170);
        but_D2.setSize(20, 20);
        window.getContentPane().add(but_D3).setLocation(260, 170);
        but_D3.setSize(20, 20);
        window.getContentPane().add(but_D4).setLocation(290, 170);
        but_D4.setSize(20, 20);
        window.getContentPane().add(but_D5).setLocation(320, 170);
        but_D5.setSize(20, 20);
        window.getContentPane().add(but_D6).setLocation(350, 170);
        but_D6.setSize(20, 20);
        window.getContentPane().add(but_D7).setLocation(380, 170);
        but_D7.setSize(20, 20);
        window.getContentPane().add(but_D8).setLocation(410, 170);
        but_D8.setSize(20, 20);
        window.getContentPane().add(but_D9).setLocation(440, 170);
        but_D9.setSize(20, 20);
        window.getContentPane().add(but_E1).setLocation(200, 200);
        but_E1.setSize(20, 20);
        window.getContentPane().add(but_E2).setLocation(230, 200);
        but_E2.setSize(20, 20);
        window.getContentPane().add(but_E3).setLocation(260, 200);
        but_E3.setSize(20, 20);
        window.getContentPane().add(but_E4).setLocation(290, 200);
        but_E4.setSize(20, 20);
        window.getContentPane().add(but_E5).setLocation(320, 200);
        but_E5.setSize(20, 20);
        window.getContentPane().add(but_E6).setLocation(350, 200);
        but_E6.setSize(20, 20);
        window.getContentPane().add(but_E7).setLocation(380, 200);
        but_E7.setSize(20, 20);
        window.getContentPane().add(but_E8).setLocation(410, 200);
        but_E8.setSize(20, 20);
        window.getContentPane().add(but_E9).setLocation(440, 200);
        but_E9.setSize(20, 20);
        window.getContentPane().add(but_F1).setLocation(200, 230);
        but_F1.setSize(20, 20);
        window.getContentPane().add(but_F2).setLocation(230, 230);
        but_F2.setSize(20, 20);
        window.getContentPane().add(but_F3).setLocation(260, 230);
        but_F3.setSize(20, 20);
        window.getContentPane().add(but_F4).setLocation(290, 230);
        but_F4.setSize(20, 20);
        window.getContentPane().add(but_F5).setLocation(320, 230);
        but_F5.setSize(20, 20);
        window.getContentPane().add(but_F6).setLocation(350, 230);
        but_F6.setSize(20, 20);
        window.getContentPane().add(but_F7).setLocation(380, 230);
        but_F7.setSize(20, 20);
        window.getContentPane().add(but_F8).setLocation(410, 230);
        but_F8.setSize(20, 20);
        window.getContentPane().add(but_F9).setLocation(440, 230);
        but_F9.setSize(20, 20);
        window.getContentPane().add(but_hide).setLocation(470, 230);
        
        but_A1.setBackground(Color.white);
        but_A2.setBackground(Color.white);
        but_A3.setBackground(Color.white);
        but_A4.setBackground(Color.white);
        but_A5.setBackground(Color.orange);
        but_A6.setBackground(Color.white);
        but_A7.setBackground(Color.white);
        but_A8.setBackground(Color.white);
        but_A9.setBackground(Color.white);
        but_B1.setBackground(Color.orange);
        but_B2.setBackground(Color.white);
        but_B3.setBackground(Color.white);
        but_B4.setBackground(Color.white);
        but_B5.setBackground(Color.white);
        but_B6.setBackground(Color.white);
        but_B7.setBackground(Color.orange);
        but_B8.setBackground(Color.white);
        but_B9.setBackground(Color.white);
        but_C1.setBackground(Color.white);
        but_C2.setBackground(Color.white);
        but_C3.setBackground(Color.white);
        but_C4.setBackground(Color.white);
        but_C5.setBackground(Color.white);
        but_C6.setBackground(Color.white);
        but_C7.setBackground(Color.white);
        but_C8.setBackground(Color.white);
        but_C9.setBackground(Color.white);
        but_D1.setBackground(Color.white);
        but_D2.setBackground(Color.white);
        but_D3.setBackground(Color.orange);
        but_D4.setBackground(Color.white);
        but_D5.setBackground(Color.white);
        but_D6.setBackground(Color.white);
        but_D7.setBackground(Color.orange);
        but_D8.setBackground(Color.white);
        but_D9.setBackground(Color.white);
        but_E1.setBackground(Color.white);
        but_E2.setBackground(Color.white);
        but_E3.setBackground(Color.white);
        but_E4.setBackground(Color.white);
        but_E5.setBackground(Color.orange);
        but_E6.setBackground(Color.white);
        but_E7.setBackground(Color.white);
        but_E8.setBackground(Color.white);
        but_E9.setBackground(Color.white);
        but_F1.setBackground(Color.orange);
        but_F2.setBackground(Color.white);
        but_F3.setBackground(Color.white);
        but_F4.setBackground(Color.white);
        but_F5.setBackground(Color.white);
        but_F6.setBackground(Color.orange);
        but_F7.setBackground(Color.white);
        but_F8.setBackground(Color.white);
        but_F9.setBackground(Color.white);
        
        but_hide.setSize(20, 20);
        but_hide.setVisible(false);
        
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(750, 450);
        window.setVisible(true);
        
        

        
        but_Attendants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_AttendantsActionPerformed(evt);
            }
        });
        
        but_Announcement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_AnnouncementActionPerformed(evt);
            }
        });
        
        but_Refreshments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_RefreshmentsActionPerformed(evt);
            }
        });
        
        but_Inventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_InventoryActionPerformed(evt);
            }
        });
        
        but_RowA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_RowAActionPerformed(evt);
            }
        });
        
        but_RowB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_RowBActionPerformed(evt);
            }
        });
        
        but_RowC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_RowCActionPerformed(evt);
            }
        });
        
        but_RowD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_RowDActionPerformed(evt);
            }
        });
        
        but_RowE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_RowEActionPerformed(evt);
            }
        });
        
        but_RowF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_RowFActionPerformed(evt);
            }
        });
        
    }
    
    private static JButton but_A1;
    private static JButton but_A2;
    private static JButton but_A3;
    private static JButton but_A4;
    private static JButton but_A5;
    private static JButton but_A6;
    private static JButton but_A7;
    private static JButton but_A8;
    private static JButton but_A9;
    private static JButton but_B1;
    private static JButton but_B2;
    private static JButton but_B3;
    private static JButton but_B4;
    private static JButton but_B5;
    private static JButton but_B6;
    private static JButton but_B7;
    private static JButton but_B8;
    private static JButton but_B9;
    private static JButton but_C1;
    private static JButton but_C2;
    private static JButton but_C3;
    private static JButton but_C4;
    private static JButton but_C5;
    private static JButton but_C6;
    private static JButton but_C7;
    private static JButton but_C8;
    private static JButton but_C9;
    private static JButton but_D1;
    private static JButton but_D2;
    private static JButton but_D3;
    private static JButton but_D4;
    private static JButton but_D5;
    private static JButton but_D6;
    private static JButton but_D7;
    private static JButton but_D8;
    private static JButton but_D9;
    private static JButton but_E1;
    private static JButton but_E2;
    private static JButton but_E3;
    private static JButton but_E4;
    private static JButton but_E5;
    private static JButton but_E6;
    private static JButton but_E7;
    private static JButton but_E8;
    private static JButton but_E9;
    private static JButton but_F1;
    private static JButton but_F2;
    private static JButton but_F3;
    private static JButton but_F4;
    private static JButton but_F5;
    private static JButton but_F6;
    private static JButton but_F7;
    private static JButton but_F8;
    private static JButton but_F9;
    private static JButton but_hide;
    private static JButton but_Refreshments;
    private static JButton but_Attendants;
    private static JButton but_Announcement;
    private static JButton but_Inventory;
    private static JButton but_RowA;
    private static JButton but_RowB;
    private static JButton but_RowC;
    private static JButton but_RowD;
    private static JButton but_RowE;
    private static JButton but_RowF;
    private static JTextArea Messages;
    private static JLabel lab_RowA;
    private static JLabel lab_RowB;
    private static JLabel lab_RowC;
    private static JLabel lab_RowD;
    private static JLabel lab_RowE;
    private static JLabel lab_RowF;
    private static JLabel lab_RowHead;
    private static JLabel lab_Col1;
    private static JLabel lab_Col2;
    private static JLabel lab_Col3;
    private static JLabel lab_Col4;
    private static JLabel lab_Col5;
    private static JLabel lab_Col6;
    private static JLabel lab_Col7;
    private static JLabel lab_Col8;
    private static JLabel lab_Col9;
    private static JLabel lab_ColHead;
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Esnursey_GUI().setVisible(true);
                
            }
        });
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
    
    
    }
    
    
}
