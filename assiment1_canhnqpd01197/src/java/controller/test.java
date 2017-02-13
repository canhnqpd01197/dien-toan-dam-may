    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Win7
 */
public class test {
    public static void main(String[] args) {
        
        DateFormat dtfm=new SimpleDateFormat("MM/dd/yyyy");
        Date date=new Date();
        String today=dtfm.format(date);
        
        try {
            
            
            System.out.println(today);
            
        } catch (Exception ex) {
            
            
            System.out.println(ex);
            
        }
    }
  
}
