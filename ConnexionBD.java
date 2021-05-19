/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gestion_colloque;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author yanis
 */
public class ConnexionBD {
     Connection conn=null;
    
    public static Connection Connexion(){
        try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_colloque?serverTimezone=UTC", "root", "Azerty77");
                                                if (conn!=null)
            System.out.println("Connexion à la base de données a été établie avec succès !");
                                                else
                                                System.out.println("Problème de connexion à la base de données");

       return conn;
       
        }
        catch(Exception e) {
            System.out.println("--> SQLException : " + e) ;
       return null;
        }
    }
    
    
}
