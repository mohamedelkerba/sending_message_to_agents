/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapp;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.wrapper.StaleProxyException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaApp {

    public static void main(String[] args) {

        // create runtime for jade
     jade.core.Runtime  r= jade.core.Runtime.instance();
     
     Profile p = new ProfileImpl("localhost",50120 ,"mohamed" );
     
     ContainerController main1 = r.createMainContainer(p);
        try {
           AgentController rma = main1.createNewAgent("jade", "jade.tools.rma.rma", null);

            rma.start();
            
            AgentController agent1 = main1.createNewAgent("agent1", 
                    "javaapp.agent1", null);
            agent1.start();
            
                AgentController sender = main1.createNewAgent("sender", 
                    "javaapp.sender", null);
            sender.start();
            
               AgentController reciever = main1.createNewAgent("reciever", 
                    "javaapp.reciever", null);
            reciever.start();
            
            
        } catch (StaleProxyException ex) {
         
            Logger.getLogger(JavaApp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
