
package com.mycompany.gestion_colloque;
import javax.swing.*;
import java.sql.ResultSet;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Lancement de votre application");
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGUI().setVisible(true);
            }
        });

    }
}
