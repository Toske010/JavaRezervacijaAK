/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rezervacijaAKbaza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 *
 * @author Toske
 */
public class Baza {
     public Connection dbConn = null;
    public Statement naredba1 = null;
    PreparedStatement pst = null;
    public void poveziSaBazom(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            dbConn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "c##stefan", "stefan010" );
            
            System.out.println("Veza sa bazom je: "+dbConn);
            System.out.println("Veza uspostavljena\n");
            
            naredba1 = dbConn.createStatement();
        }catch(Exception e){
            System.out.println("Greska pri komunikaciji sa bazom: "+e.getMessage());
        }
    }
    public void zatvoriBazu(){
        try{
            if(naredba1 != null){
                naredba1.close();
            }
            if(dbConn != null){
                dbConn.close();
            }
        }catch(Exception e){
            System.out.println("SQL izuzetak za vreme close(): "+e.getMessage());
        }
    }

    public PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}
